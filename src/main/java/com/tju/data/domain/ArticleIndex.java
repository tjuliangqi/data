package com.tju.data.domain;

public class ArticleIndex {
    private String title;
    private String source;
    private String id;

    public String getTitle() {
        return title;
    }

    public String getSource() {
        return source;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ArticleIndex{" +
                "title='" + title + '\'' +
                ", source='" + source + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
