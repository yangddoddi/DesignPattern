package com.example.design_pattern.structural.decorator_pattern.after;

public class CommentDecorator implements CommentService{
    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {

    }
}
