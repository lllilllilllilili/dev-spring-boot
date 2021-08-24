## 프로젝트 생성

아래 사이트로 스프링 프로젝트를 만들 수 있다.

https://start.spring.io

| Gradle 구성

```javascript
plugins {
id 'org.springframework.boot' version '2.3.1.RELEASE'
id 'io.spring.dependency-management' version '1.0.9.RELEASE' id 'java'
}
group = 'hello'
version = '0.0.1-SNAPSHOT' sourceCompatibility = '11'
    repositories {
      mavenCentral()
}
dependencies {
implementation 'org.springframework.boot:spring-boot-starter-thymeleaf' implementation 'org.springframework.boot:spring-boot-starter-web' testImplementation('org.springframework.boot:spring-boot-starter-test') {
   exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
}
```
