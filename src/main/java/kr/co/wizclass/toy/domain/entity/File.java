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
@Table(name = "file")
@DynamicUpdate
//@SQLDelete(sql = "update file set delete_at = now() where id = ?")
public class File extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
