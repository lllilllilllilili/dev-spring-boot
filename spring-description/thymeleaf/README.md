### thymeleaf

동적으로 view 단 화면을 구성할 수 있다.

hello로 입력받는 파라미터에 대해 동적으로 값을 인입하여 화면을 resolve 할 수 있다.

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
  <head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>
    <p th:text="'안녕하세요. ' + ${data}">안녕하세요. 손님</p>
  </body>
</html>
```
