package com.example.design_pattern.behavior.strategy_pattern;

public class Conclusion {
    /*
    * 전략 패턴
    * 여러 알고리즘을 캡슐화하고 상호 교환할 수 있게 만드는 패턴
    * 컨텍스트에서 사용할 알고리즘을 클라이언트가 선택한다
    *
    * 대표 예시
    * - Comparator
    * - 스프링의 거의 모든 것들이 전략패턴이다 ApplicationContext의 구현체가 여러가지임
    * - BeanDefinitionParser
    * - PlatformTansactionManager
    * - CacheManager
    *
    * 장점
    * - 새로운 전략을 추가하더라도 기존 코드를 변경하지 않는다.
    * - 상속 대신 위임을 사용할 수 있다.
    * - 런타임에 전략을 변경할 수 있다. (세터 혹은 메서드 인자로 사용)
    * - 구체화가 추상화에 의존함
    *
    * 단점
    * - 클라이언트 코드가 전략에 대해 의존성이 생긴다
    * */
}
