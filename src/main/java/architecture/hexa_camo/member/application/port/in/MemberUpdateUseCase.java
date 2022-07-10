package architecture.hexa_camo.member.application.port.in;

public interface MemberUpdateUseCase {

    String changeNickname(String newNickName);
    String changePassword(String newPassword);
}
