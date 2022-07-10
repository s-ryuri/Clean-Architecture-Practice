package architecture.hexa_camo.member.application.port.in;

import architecture.hexa_camo.common.SelfValidating;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class MemberRegisterCommand extends SelfValidating<MemberRegisterCommand> {

    @NotNull
    private String nickName;

    @NotNull
    private String password;

    public MemberRegisterCommand(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
        this.validateSelf();
    }
}
