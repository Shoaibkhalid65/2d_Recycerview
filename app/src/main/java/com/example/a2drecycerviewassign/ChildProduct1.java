package com.example.a2drecycerviewassign;

import java.util.Objects;

public class ChildProduct1 extends ChildProduct{
    private int imageResourceId;
    private String title;
    private float rating;

    public ChildProduct1() {
    }

    public ChildProduct1(int imageResourceId, String title, float rating) {
        this.imageResourceId = imageResourceId;
        this.title = title;
        this.rating = rating;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildProduct1 that = (ChildProduct1) o;
        return imageResourceId == that.imageResourceId && Float.compare(rating, that.rating) == 0 && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageResourceId, title, rating);
    }

    @Override
    public String toString() {
        return "ChildProduct1{" +
                "imageResourceId=" + imageResourceId +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
