package architecture.hexa_camo.member.adapter.out.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberUpdateResponseDto {

    private String nickName;
    private String password;

    public MemberUpdateResponseDto(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }
}
