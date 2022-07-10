package architecture.hexa_camo.member.application.port.out;

import architecture.hexa_camo.member.adapter.out.persistence.MemberUpdateResponseDto;
import architecture.hexa_camo.member.application.port.in.MemberUpdateCommand;

public interface UpdateMemberPort {

    MemberUpdateResponseDto changeMember(MemberUpdateCommand memberUpdateCommand);
}
