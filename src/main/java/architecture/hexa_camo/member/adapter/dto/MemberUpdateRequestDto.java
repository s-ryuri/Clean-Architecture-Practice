package architecture.hexa_camo.member.adapter.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class MemberUpdateRequestDto {

    @NotNull
    private Long id;

    @NotNull
    private String nickName;

    @NotNull
    private String password;

    public MemberUpdateRequestDto(Long id, String nickName, String password) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;

    }
}
