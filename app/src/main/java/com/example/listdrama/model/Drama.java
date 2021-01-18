
package com.example.listdrama.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Drama {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("sinopsis")
    @Expose
    private String sinopsis;
    @SerializedName("pemeran1")
    @Expose
    private String pemeran1;
    @SerializedName("pemeran2")
    @Expose
    private String pemeran2;
    @SerializedName("pemeran3")
    @Expose
    private String pemeran3;
    @SerializedName("pemeran4")
    @Expose
    private String pemeran4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getPemeran1() {
        return pemeran1;
    }

    public void setPemeran1(String pemeran1) {
        this.pemeran1 = pemeran1;
    }

    public String getPemeran2() {
        return pemeran2;
    }

    public void setPemeran2(String pemeran2) {
        this.pemeran2 = pemeran2;
    }

    public String getPemeran3() {
        return pemeran3;
    }

    public void setPemeran3(String pemeran3) {
        this.pemeran3 = pemeran3;
    }

    public String getPemeran4() {
        return pemeran4;
    }

    public void setPemeran4(String pemeran4) {
        this.pemeran4 = pemeran4;
    }

}
