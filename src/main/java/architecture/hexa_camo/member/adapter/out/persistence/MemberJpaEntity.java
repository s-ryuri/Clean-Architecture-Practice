package architecture.hexa_camo.member.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor
@AllArgsConstructor
class MemberJpaEntity {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 5,max = 10)
    @Column(nullable = false)
    private String nickName;


    @Size(min = 6,max = 12)
    @Column(nullable = false)
    private String password;

    @Builder
    public MemberJpaEntity(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }
}
