package kr.co.wizclass.toy.domain.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import kr.co.wizclass.toy.domain.entity.base.BaseEntity;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Type;

import java.util.Map;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "amenity")
@DynamicUpdate
@SQLDelete(sql = "update amenity set delete_at = now() where id = ?")
public class Amenity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // https://okky.kr/articles/1369238
    @Type(JsonType.class)
    @Column(columnDefinition = "json")
    private Map<String, Object> json;
}
