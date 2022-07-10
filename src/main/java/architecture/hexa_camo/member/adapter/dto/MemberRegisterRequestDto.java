package architecture.hexa_camo.member.adapter.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRegisterRequestDto {

    @NotNull
    private String nickName;
    @NotNull
    private String password;

    @Builder
    public MemberRegisterRequestDto(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }
}
