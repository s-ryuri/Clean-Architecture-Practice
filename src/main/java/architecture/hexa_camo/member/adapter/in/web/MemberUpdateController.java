package architecture.hexa_camo.member.adapter.in.web;

import architecture.hexa_camo.member.adapter.dto.MemberUpdateRequestDto;
import architecture.hexa_camo.member.adapter.out.persistence.MemberUpdateResponseDto;
import architecture.hexa_camo.member.application.port.in.MemberUpdateCommand;
import architecture.hexa_camo.member.application.port.out.UpdateMemberPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RequestMapping("/api/members")
@RestController
@RequiredArgsConstructor
class MemberUpdateController {

    private final UpdateMemberPort updateMemberPort;
    @PatchMapping("")
    public MemberUpdateResponseDto changeMember(@RequestBody @Valid MemberUpdateRequestDto memberUpdateRequestDto){
        MemberUpdateCommand memberUpdateCommand = new MemberUpdateCommand(memberUpdateRequestDto.getId(),
                                                                          memberUpdateRequestDto.getNickName(),
                                                                          memberUpdateRequestDto.getPassword());
        MemberUpdateResponseDto memberUpdateResponseDto = updateMemberPort.changeMember(memberUpdateCommand);
        return memberUpdateResponseDto;
    }
}
