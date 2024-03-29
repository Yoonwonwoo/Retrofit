package com.example.myaplication.model;

public class Author {

    String username;
    String bio;
    String image;
    boolean following;

    public Author(String username, String bio, String image, boolean following) {
        this.username = username;
        this.bio = bio;
        this.image = image;
        this.following = following;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    /*"author": {
        "username": "jake",
                "bio": "I work at statefarm",
                "image": "https://i.stack.imgur.com/xHWG8.jpg",
                "following": false
                }*/
}
