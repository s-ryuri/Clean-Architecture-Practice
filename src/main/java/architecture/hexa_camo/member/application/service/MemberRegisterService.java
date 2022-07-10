package architecture.hexa_camo.member.application.service;

import architecture.hexa_camo.member.application.port.in.MemberRegisterCommand;
import architecture.hexa_camo.member.application.port.in.MemberRegisterUseCase;
import architecture.hexa_camo.member.application.port.out.SaveMemberPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MemberRegisterService implements MemberRegisterUseCase {

    private final SaveMemberPort saveMemberPort;
    @Override
    public Long saveMember(MemberRegisterCommand memberRegisterCommand) {
        duplicatedMember(memberRegisterCommand.getNickName());
        Long memberId = saveMemberPort.saveMember(memberRegisterCommand.getNickName(), memberRegisterCommand.getPassword());
        return memberId;
    }

    public void duplicatedMember(String nickName){
        saveMemberPort.checkDuplicatedNickName(nickName);
    }
}
