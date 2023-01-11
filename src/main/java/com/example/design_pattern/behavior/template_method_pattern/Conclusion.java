package com.example.design_pattern.behavior.template_method_pattern;

public class Conclusion {
    /*
    *
    * 알고리즘 구조를 서브 클래스가 확장할 수 있도록 템플릿으로 제공하는 방법
    * 추상 클래스는 템플릿을 제공하고 하위 클래스는 구체적 알고리즘을 제공한다.
    *
    * 장점
    * - 템플릿 코드를 재사용하고 중복 코드를 줄일 수 있다.
    * - 템플릿 코드를 변경하지 않고 상속을 받아서 구체적인 알고리즘만 변경할 수 있다
    *
    * 단점
    * - 리스코프 치환 원칙을 위반할 수 있다.
    * - 알고리즘 구조가 복잡할수록 템플릿을 유지하기 어려워진다.
    *
    * 예시
    * - HttpServlet 쓸 때 필요한 메서드만 오버라이드해서 사용
    * - ConfigurationAdapter에서 일부 메서드만 오버라이드해서 사용함(현재 deprecated됨)
    * */


    /*
    * 템플릿 콜백 패턴?
    *
    * 상속 대신 콜백이라는 인터페이스에 넣어놓고 의존성을 콜백으로 역전시킨다.
    * 장점 -> 상속을 사용하지 않아도 된다. (위임)
    *
    * 예시 - JDBC Template의 execute 메서드
    * */
}
