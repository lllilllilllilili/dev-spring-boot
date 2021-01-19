package me.whiteship.demospringbootvalidation;

import javax.validation.constraints.*;

public class Event {
    Integer id;

    @NotEmpty
    String title;

    @NotNull @Min(0) //-> ㅇㅣ런 간단한 것들은 Validation ㅇㅣ 없이도 검증할 수 있습니다. implements Validator ~~~
    Integer limit;

    @Email
    String email;

    //3. ㅌㅏ이틀이 널이면 안되는 경우입니다.
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
