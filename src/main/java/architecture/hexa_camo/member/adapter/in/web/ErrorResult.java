package architecture.hexa_camo.member.adapter.in.web;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class ErrorResult {

    private int status;

    private String message;

}
