package com.example.a2drecycerviewassign;

import java.util.Objects;

public class ChildProduct2 extends ChildProduct{
    private int imageResourceId1;
    private String title1;
    private String comment11;
    private String comment12;
    private float rating1;
    private String mb1;
    private int imageResourceId2;
    private String title2;
    private String comment21;
    private String comment22;
    private float rating2;
    private String mb2;
    private int imageResourceId3;
    private String title3;
    private String comment31;
    private String comment32;
    private float rating3;
    private String mb3;

    public ChildProduct2() {
    }

    public ChildProduct2(int imageResourceId1, String title1, String comment11, String comment12, float rating1, String mb1, int imageResourceId2, String title2, String comment21, String comment22, float rating2, String mb2, int imageResourceId3, String title3, String comment31, String comment32, float rating3, String mb3) {
        this.imageResourceId1 = imageResourceId1;
        this.title1 = title1;
        this.comment11 = comment11;
        this.comment12 = comment12;
        this.rating1 = rating1;
        this.mb1 = mb1;
        this.imageResourceId2 = imageResourceId2;
        this.title2 = title2;
        this.comment21 = comment21;
        this.comment22 = comment22;
        this.rating2 = rating2;
        this.mb2 = mb2;
        this.imageResourceId3 = imageResourceId3;
        this.title3 = title3;
        this.comment31 = comment31;
        this.comment32 = comment32;
        this.rating3 = rating3;
        this.mb3 = mb3;
    }

    public int getImageResourceId1() {
        return imageResourceId1;
    }

    public void setImageResourceId1(int imageResourceId1) {
        this.imageResourceId1 = imageResourceId1;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getComment11() {
        return comment11;
    }

    public void setComment11(String comment11) {
        this.comment11 = comment11;
    }

    public String getComment12() {
        return comment12;
    }

    public void setComment12(String comment12) {
        this.comment12 = comment12;
    }

    public float getRating1() {
        return rating1;
    }

    public void setRating1(float rating1) {
        this.rating1 = rating1;
    }

    public String getMb1() {
        return mb1;
    }

    public void setMb1(String mb1) {
        this.mb1 = mb1;
    }

    public int getImageResourceId2() {
        return imageResourceId2;
    }

    public void setImageResourceId2(int imageResourceId2) {
        this.imageResourceId2 = imageResourceId2;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getComment21() {
        return comment21;
    }

    public void setComment21(String comment21) {
        this.comment21 = comment21;
    }

    public String getComment22() {
        return comment22;
    }

    public void setComment22(String comment22) {
        this.comment22 = comment22;
    }

    public float getRating2() {
        return rating2;
    }

    public void setRating2(float rating2) {
        this.rating2 = rating2;
    }

    public String getMb2() {
        return mb2;
    }

    public void setMb2(String mb2) {
        this.mb2 = mb2;
    }

    public int getImageResourceId3() {
        return imageResourceId3;
    }

    public void setImageResourceId3(int imageResourceId3) {
        this.imageResourceId3 = imageResourceId3;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getComment31() {
        return comment31;
    }

    public void setComment31(String comment31) {
        this.comment31 = comment31;
    }

    public String getComment32() {
        return comment32;
    }

    public void setComment32(String comment32) {
        this.comment32 = comment32;
    }

    public float getRating3() {
        return rating3;
    }

    public void setRating3(float rating3) {
        this.rating3 = rating3;
    }

    public String getMb3() {
        return mb3;
    }

    public void setMb3(String mb3) {
        this.mb3 = mb3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildProduct2 that = (ChildProduct2) o;
        return imageResourceId1 == that.imageResourceId1 && Float.compare(rating1, that.rating1) == 0 && mb1 == that.mb1 && imageResourceId2 == that.imageResourceId2 && Float.compare(rating2, that.rating2) == 0 && mb2 == that.mb2 && imageResourceId3 == that.imageResourceId3 && Float.compare(rating3, that.rating3) == 0 && mb3 == that.mb3 && Objects.equals(title1, that.title1) && Objects.equals(comment11, that.comment11) && Objects.equals(comment12, that.comment12) && Objects.equals(title2, that.title2) && Objects.equals(comment21, that.comment21) && Objects.equals(comment22, that.comment22) && Objects.equals(title3, that.title3) && Objects.equals(comment31, that.comment31) && Objects.equals(comment32, that.comment32);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageResourceId1, title1, comment11, comment12, rating1, mb1, imageResourceId2, title2, comment21, comment22, rating2, mb2, imageResourceId3, title3, comment31, comment32, rating3, mb3);
    }

    @Override
    public String toString() {
        return "ChildProduct2{" +
                "imageResourceId1=" + imageResourceId1 +
                ", title1='" + title1 + '\'' +
                ", comment11='" + comment11 + '\'' +
                ", comment12='" + comment12 + '\'' +
                ", rating1=" + rating1 +
                ", mb1=" + mb1 +
                ", imageResourceId2=" + imageResourceId2 +
                ", title2='" + title2 + '\'' +
                ", comment21='" + comment21 + '\'' +
                ", comment22='" + comment22 + '\'' +
                ", rating2=" + rating2 +
                ", mb2=" + mb2 +
                ", imageResourceId3=" + imageResourceId3 +
                ", title3='" + title3 + '\'' +
                ", comment31='" + comment31 + '\'' +
                ", comment32='" + comment32 + '\'' +
                ", rating3=" + rating3 +
                ", mb3=" + mb3 +
                '}';
    }
}
