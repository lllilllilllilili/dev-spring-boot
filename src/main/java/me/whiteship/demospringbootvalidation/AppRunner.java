package me.whiteship.demospringbootvalidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;
@Component
public class AppRunner implements ApplicationRunner {
    //웹 서비스 데이터 레이어든 모두 사용할 수 있는 일반적인 인터페이스
    //Bean Validation =
    //2가지 메소드를 구현해야 합니다. 1. support, 2. validate 구현 해야함

    @Autowired
    Validator validator; //스프링이 validator를 빈으로 주입받고

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(validator.getClass()); // ㅇㅓ떤 validatorㄱㅏ 주입이 되는지 classㄹㅡㄹ 찍어보자
        Event event = new Event();
        event.setLimit(-1);
        event.setEmail("aaa2");
        //EventValidator eventValidator = new EventValidator(); -> 위 Validator ㄹㅡㄹ 쓰면 eventValidatorㄹㅡㄹ 사용하지 않습니다.
        //Errors 인터페이스는 자주 볼것이다. Errors 의 구현체 빈프로젝트바인딩리절트 이 클래스는 스프링 MVC 가
        // ㅈㅏ동으로 생성해서 파라미터에 전달
        // Errors ㅌㅏ입으로 자동으로 전달
        Errors errors = new BeanPropertyBindingResult(event, "event");
        //eventValidator.validate(event, errors);
        validator.validate(event,errors);


        System.out.println(errors.hasErrors());
        errors.getAllErrors().forEach(e->{
            //ㅇㅔ러 찍는다. notempty ㅂㅏㄲ에 없다.
            System.out.println("========= error code ===========");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println((e.getDefaultMessage()));
        });
    }
}
