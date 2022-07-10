package architecture.hexa_camo.member.application.port.in;

import architecture.hexa_camo.common.SelfValidating;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class MemberUpdateCommand extends SelfValidating<MemberRegisterCommand> {

    @NotNull
    private Long id;

    @NotNull
    private String nickName;

    @NotNull
    private String password;

    public MemberUpdateCommand(Long id, String nickName, String password) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.validateSelf();
    }
}
