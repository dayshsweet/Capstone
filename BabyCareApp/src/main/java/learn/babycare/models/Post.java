package learn.babycare.models;

import java.time.LocalDateTime;

public class Post {
    private int postId;
    private User user;
    private String title;
    private String content;
    private LocalDateTime timeCreated;

    public Post(int postId, User user, String title, String content, LocalDateTime timeCreated) {
        this.postId = postId;
        this.user = user;
        this.title = title;
        this.content = content;
        this.timeCreated = timeCreated;
    }

    public Post() {

    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }
}
