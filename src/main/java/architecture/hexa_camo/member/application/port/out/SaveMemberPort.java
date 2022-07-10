package architecture.hexa_camo.member.application.port.out;

public interface SaveMemberPort {
    Long saveMember(String nickName,String password);
    //중복 검사를 어디서 해야될까?
    void checkDuplicatedNickName(String nickName);
}
