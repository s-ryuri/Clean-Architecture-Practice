package architecture.hexa_camo.member.application.port.in;

public interface MemberRegisterUseCase {

    Long saveMember(MemberRegisterCommand memberRegisterCommand);
}
