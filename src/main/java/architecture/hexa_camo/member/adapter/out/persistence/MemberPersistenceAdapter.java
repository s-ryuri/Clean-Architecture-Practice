package architecture.hexa_camo.member.adapter.out.persistence;

import architecture.hexa_camo.member.adapter.in.web.exception.DuplicatedMemberException;
import architecture.hexa_camo.member.adapter.in.web.exception.NoFoundMemberException;
import architecture.hexa_camo.member.application.port.in.MemberUpdateCommand;
import architecture.hexa_camo.member.application.port.out.SaveMemberPort;
import architecture.hexa_camo.member.application.port.out.UpdateMemberPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
class MemberPersistenceAdapter implements SaveMemberPort, UpdateMemberPort {

    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Long saveMember(String nickName, String password) {
        MemberJpaEntity member = new MemberJpaEntity(nickName, password);
        memberJpaRepository.save(member);
        MemberJpaEntity findMember = memberJpaRepository.findByNickName(nickName)
                                                        .orElseThrow(() -> new NoFoundMemberException("닉네임을 가지는 아이디가 없습니다."));
        return findMember.getId();
    }

    @Override
    public void checkDuplicatedNickName(String nickName) {
        memberJpaRepository.findByNickName(nickName).ifPresent(memberJpaEntity -> {
            throw new DuplicatedMemberException("중복된 닉네임입니다.");
        });

    }

    @Override
    public MemberUpdateResponseDto changeMember(MemberUpdateCommand memberUpdateCommand) {
        MemberJpaEntity memberJpaEntity = new MemberJpaEntity(memberUpdateCommand.getId(),memberUpdateCommand.getNickName(), memberUpdateCommand.getPassword());
        MemberJpaEntity member = memberJpaRepository.save(memberJpaEntity);
        return new MemberUpdateResponseDto(member.getNickName(),member.getPassword());
    }
}
