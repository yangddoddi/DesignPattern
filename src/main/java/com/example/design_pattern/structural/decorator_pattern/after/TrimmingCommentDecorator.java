package com.example.design_pattern.structural.decorator_pattern.after;

public class TrimmingCommentDecorator extends CommentDecorator{
    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...","");
    }
}
