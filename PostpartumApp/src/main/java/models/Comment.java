package models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comment {
    private int commentId;
    private Post post;
    private User user;
    private String text;
    private LocalDateTime timePosted;

    public Comment(int commentId, Post post, User user, String text, LocalDateTime timePosted) {
        this.commentId = commentId;
        this.post = post;
        this.user = user;
        this.text = text;
        this.timePosted = timePosted;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimePosted() {
        return timePosted;
    }

    public void setTimePosted(LocalDateTime timePosted) {
        this.timePosted = timePosted;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return getCommentId() == comment.getCommentId() && Objects.equals(getPost(), comment.getPost()) && Objects.equals(getUser(), comment.getUser()) && Objects.equals(getText(), comment.getText()) && Objects.equals(getTimePosted(), comment.getTimePosted());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommentId(), getPost(), getUser(), getText(), getTimePosted());
    }
}
