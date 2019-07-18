package com.example.myaplication.model;

import java.util.List;

public class Articles {
    String slug;
    String title;
    String description;
    String body;
    List<String> tagList;
    String createAt;
    String updatedAt;
    boolean favorited;
    int favoritesCount;
    Author author;

    public Articles(String slug, String title, String description, String body, List<String> tagList, String createAt, String updatedAt, boolean favorited, int favoritesCount, Author author) {
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.body = body;
        this.tagList = tagList;
        this.createAt = createAt;
        this.updatedAt = updatedAt;
        this.favorited = favorited;
        this.favoritesCount = favoritesCount;
        this.author = author;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public int getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(int favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    /*"slug": "how-to-train-your-dragon",
            "title": "How to train your dragon",
            "description": "Ever wonder how?",
            "body": "It takes a Jacobian",
            "tagList": ["dragons", "training"],
            "createdAt": "2016-02-18T03:22:56.637Z",
            "updatedAt": "2016-02-18T03:48:35.824Z",
            "favorited": false,
            "favoritesCount": 0,
            "author": {
        "username": "jake",
                "bio": "I work at statefarm",
                "image": "https://i.stack.imgur.com/xHWG8.jpg",
                "following": false*/
}
