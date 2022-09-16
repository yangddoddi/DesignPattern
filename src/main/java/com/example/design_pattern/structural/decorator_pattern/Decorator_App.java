package com.example.design_pattern.structural.decorator_pattern;

/*
*
* 데코레이터 패턴?
* -> 기존 코드를 변경하지 않고 부가 기능을 추가하는 패턴
* -> Composite 패턴과 달리 단 하나의 wrappee만을 가지고 있음
* -> 주가 되는 구체적인 서비스는 콘크리트
* -> 부가기능은 데코레이터
*
* 장점
* - 새로운 클래스 만들지 않고 기존 기능을 조합할 수 있다 (Open Closed Principals)
* - 컴파일 타임이 아닌 런타임에 동적으로 기능을 변경할 수 있다
* - 모든 구현체가 하나의 인터페이스에 의존한다 (Dependency inversion Principle)
* - 모든 구현체가 하나의 역할만 가지고 있다 (Single Responsibility Principal)
*
* 단점
* - 조합하는 코드가 복잡해질 수 있다.
*
* */

import com.example.design_pattern.structural.decorator_pattern.after.*;

public class Decorator_App {
    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        ClientAfter client = new ClientAfter(commentService);
        client.writeComment("오징어게임");
        client.writeComment("...배고프다...");
        client.writeComment("http://whiteship.me");




    }
}
