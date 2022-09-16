package com.example.design_pattern.structural.decorator_pattern.before;

public class TrimmingCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        super.addComment(comment);
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
