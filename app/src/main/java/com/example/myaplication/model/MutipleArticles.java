package com.example.myaplication.model;

import com.example.myaplication.model.Articles;

import java.util.List;

public class MutipleArticles {
    List<Articles> articles;
    int articlesCount;

    public MutipleArticles(List<Articles> articles, int articlesCount) {
        this.articles = articles;
        this.articlesCount = articlesCount;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }

    public int getArticlesCount() {
        return articlesCount;
    }

    public void setArticlesCount(int articlesCount) {
        this.articlesCount = articlesCount;
    }
}
