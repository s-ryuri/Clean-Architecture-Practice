package architecture.hexa_camo.member.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    private String nickName;
    private String password;

    @Builder
    public Member(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

    public void changeNickName(String newNickName){
        this.nickName = newNickName;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }
}
