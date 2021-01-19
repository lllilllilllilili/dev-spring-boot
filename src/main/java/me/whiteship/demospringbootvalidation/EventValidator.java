package me.whiteship.demospringbootvalidation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//4. validator는 스프링에 있는것을 가져와야 합니다. 복잡한 Validationㅇㅢ 경우에는 아래 처럼 구현해서 쓸 수 있다. 
public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Event.class.equals(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //메세지 리졸버 좀 더 공부해야함
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title","not empty", "Empty title is now allowed");


    }
}
