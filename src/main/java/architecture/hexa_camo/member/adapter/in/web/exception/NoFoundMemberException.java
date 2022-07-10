package architecture.hexa_camo.member.adapter.in.web.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NoFoundMemberException extends RuntimeException {
    public NoFoundMemberException(String message) {
        super(message);
    }

}
