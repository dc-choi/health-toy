package kr.co.wizclass.toy.domain.entity;

import kr.co.wizclass.toy.domain.entity.base.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity // JPA의 엔티티
@Getter // 게터 생성
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 매개변수없이 생성자는 protecd로 보호됨.
@Table(name = "common_code") // 테이블 이름을 명시적으로 기록한다.
@DynamicUpdate // 동적인 업데이트가 가능함. 수정이 필요하지 않은 컬럼은 수정되지 않는다.
//@SQLDelete(sql = "update common_code set delete_at = now() where id = ?") // JPA에서 delete를 진행할 경우 다음 쿼리를 실행시킨다.
public class CommonCode extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Builder // 빌더패턴을 자동으로 구현해주는 어노테이션
    // @AllArgsConstructor와 같이 쓰는건 편하지만 좀 위험하다...
    // 사용하려면 접근레벨을 낮추거나 아예 생성자를 직접 작성한다.
    // https://jake-seo-dev.tistory.com/70
//    public CommonCode(Long id) {
//        this.id = id;
//    }
}
