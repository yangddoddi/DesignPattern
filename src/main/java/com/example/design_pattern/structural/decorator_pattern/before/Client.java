package com.example.design_pattern.structural.decorator_pattern.before;

/*
*
* 여러가지 기능을 동시에 사용하고 싶은데 어뜩하나요
* 데코레이터 패턴 적용 전 - 상속으로 문제를 해결하려고 할 때
*
* */

public class Client {
    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void man(String[] args) {
        Client client = new Client(new CommentService());
        client.writeComment("오징어 게임");
        client.writeComment("오징어 게임게임게임게임");

        // 만약 데코레이터 패턴이 없는데 같은 기능을 구현하고 싶다면
        /*
        CommentService commentService = new CommentService();
        if (enabledSpamFilter) {
            commentService = new SpanFilteringCommentService();
        }
        if (enabledTrimming) {
            commentService = new TrimmingCommentService();
        }
        if (enabledTrimming&&enabledSpamFilter) {
            commentService = new SpamFilteringAndTriming...
        }
    }*/
    }
}
