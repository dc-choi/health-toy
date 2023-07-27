package kr.co.wizclass.toy.domain.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass // 공통 매핑 정보를 포함하는 부모 엔티티를 지정하는데 사용됨.
@Getter
@EntityListeners(AuditingEntityListener.class) // 엔티티의 라이프사이클 이벤트를 감지하는 리스너를 지정한다.
public abstract class BaseEntity {
    @CreatedDate // @EntityListeners와 같이 사용됨.
    @Column(name = "created_at", columnDefinition = "DATETIME", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate // @EntityListeners와 같이 사용됨.
    @Column(name = "modified_at", columnDefinition = "DATETIME")
    private LocalDateTime modifiedAt;

    @Column(name = "deleted_at", columnDefinition = "DATETIME")
    private LocalDateTime deletedAt;
}
