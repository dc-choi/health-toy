package kr.co.wizclass.toy.domain.entity;

import kr.co.wizclass.toy.domain.entity.base.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Map;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "amenity")
@DynamicUpdate
//@SQLDelete(sql = "update amenity set delete_at = now() where id = ?")
public class Amenity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // https://okky.kr/articles/1369238
    @Type(type = "json") // 2.X에서만 사용
    // @Type(JsonType.class) // 3.X에서만 사용
    @Column(columnDefinition = "json")
    private Map<String, Object> json;
}
