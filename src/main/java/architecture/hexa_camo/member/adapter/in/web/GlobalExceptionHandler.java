package architecture.hexa_camo.member.adapter.in.web;

import architecture.hexa_camo.member.adapter.in.web.exception.DuplicatedMemberException;
import architecture.hexa_camo.member.adapter.in.web.exception.NoFoundMemberException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NoFoundMemberException.class)
    public ErrorResult NoFoundExceptionHandler(NoFoundMemberException e){
        return new ErrorResult(HttpStatus.BAD_REQUEST.value(),e.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DuplicatedMemberException.class)
    public ErrorResult DuplicatedMemberHandler(DuplicatedMemberException e){
        return new ErrorResult(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResult MethodArgumentNotValidHandler(MethodArgumentNotValidException e){
        return new ErrorResult(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

}
