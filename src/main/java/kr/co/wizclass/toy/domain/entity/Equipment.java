package kr.co.wizclass.toy.domain.entity;

import kr.co.wizclass.toy.domain.entity.base.BaseEntity;
import kr.co.wizclass.toy.domain.entity.type.EquipmentCategory;
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
@Table(name = "equipment")
@DynamicUpdate
//@SQLDelete(sql = "update equipment set delete_at = now() where id = ?")
public class Equipment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Type(JsonType.class)
    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Map<String, Object> json;

    @Enumerated(EnumType.STRING)
    private EquipmentCategory equipmentCategory;
}
