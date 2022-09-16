package com.example.design_pattern.structural.decorator_pattern.after;

public class SpamFilteringCommentDecorator extends CommentDecorator{
    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if (isNotSpam(comment))
        { super.addComment(comment); }
    }

    private boolean isNotSpam(String comment) {
        return comment.contains("http");
    }
}
