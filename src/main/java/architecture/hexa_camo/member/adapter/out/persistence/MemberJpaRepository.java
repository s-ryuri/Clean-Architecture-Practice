package architecture.hexa_camo.member.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface MemberJpaRepository extends JpaRepository<MemberJpaEntity,Long> {
    Optional<MemberJpaEntity> findByNickName(String nickName);
}
