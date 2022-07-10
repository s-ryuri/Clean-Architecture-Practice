package architecture.hexa_camo.member.adapter.in.web.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DuplicatedMemberException extends RuntimeException{
    public DuplicatedMemberException(String message) {
        super(message);
    }

}
