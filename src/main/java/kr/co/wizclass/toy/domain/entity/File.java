package kr.co.wizclass.toy.domain.entity;

import jakarta.persistence.*;
import kr.co.wizclass.toy.domain.entity.base.BaseEntity;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "file")
@DynamicUpdate
@SQLDelete(sql = "update file set delete_at = now() where id = ?")
public class File extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}