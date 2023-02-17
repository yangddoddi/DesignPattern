package com.example.design_pattern.structural.facade_pattern

class Conclusion {
    /*
    * 외부에서는 오직 전경만 볼 수 있다.
    * 외부에서 내부를 들여다볼 수 없다.
    * */

    /*
    * 클라이언트가 사용해야하는 복잡한 서브 시스템 의존성을 간단한 인터페이스로 추상화
    *
    * 장점
    * 1. 서브시스템에 대한 의존성을 한 곳에 몰아놓을 수 있다
    * 2. 재사용, 유지보수성이 용이해진다
    *
    * 단점
    * 1. Facade 자체가 의존성을 가지는 것은 같음
    * */

    /*
    * 자바의 Facade 패턴?
    * 1. MailSender
    * 2. PlatformTransactionManager
    * 3. Spring MVC
    *
    * -> 인터페이스 뒤에 다양한 코드를 감춤
   춤* */
}