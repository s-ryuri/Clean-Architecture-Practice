package architecture.hexa_camo.member.adapter.in.web;

import architecture.hexa_camo.member.adapter.dto.MemberRegisterRequestDto;
import architecture.hexa_camo.member.application.port.in.MemberRegisterCommand;
import architecture.hexa_camo.member.application.port.in.MemberRegisterUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RequestMapping("/api/members")
@RestController
@RequiredArgsConstructor
class MemberRegisterController {
    //in 포트를 통해서 들어간 다음에
    //out 포트를 통해서 db에 접근
    private final MemberRegisterUseCase memberRegisterUseCase;

    @PostMapping("/register")
    public Long registerMember(@RequestBody @Valid MemberRegisterRequestDto memberRegisterRequestDto){
        MemberRegisterCommand memberRegisterCommand = new MemberRegisterCommand(memberRegisterRequestDto.getNickName(),
                                                                                memberRegisterRequestDto.getPassword());
        return memberRegisterUseCase.saveMember(memberRegisterCommand);
    }
}
