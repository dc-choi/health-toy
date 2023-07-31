package kr.co.wizclass.toy.domain.entity;

import kr.co.wizclass.toy.domain.entity.base.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "trainer")
@DynamicUpdate
//@SQLDelete(sql = "update trainer set delete_at = now() where id = ?")
public class Trainer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
