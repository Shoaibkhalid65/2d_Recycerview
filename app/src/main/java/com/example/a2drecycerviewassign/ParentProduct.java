package com.example.a2drecycerviewassign;

import java.util.List;
import java.util.Objects;

public class ParentProduct {
    private String title;
    private int imageResourceId;
    private List<ChildProduct> childProducts;

    public ParentProduct() {
    }

    public ParentProduct(String title, int imageResourceId, List<ChildProduct> childProducts) {
        this.title = title;
        this.imageResourceId = imageResourceId;
        this.childProducts = childProducts;
    }

    public List<ChildProduct> getChildProducts() {
        return childProducts;
    }

    public void setChildProducts(List<ChildProduct> childProducts) {
        this.childProducts = childProducts;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentProduct that = (ParentProduct) o;
        return imageResourceId == that.imageResourceId && Objects.equals(title, that.title) && Objects.equals(childProducts, that.childProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, imageResourceId, childProducts);
    }

    @Override
    public String toString() {
        return "ParentProduct{" +
                "title='" + title + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", childProducts=" + childProducts +
                '}';
    }
}
