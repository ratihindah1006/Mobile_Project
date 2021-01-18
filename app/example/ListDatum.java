
package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListDatum {

    @SerializedName("populer")
    @Expose
    private List<Populer> populer = null;
    @SerializedName("drama")
    @Expose
    private List<Drama> drama = null;

    public List<Populer> getPopuler() {
        return populer;
    }

    public void setPopuler(List<Populer> populer) {
        this.populer = populer;
    }

    public List<Drama> getDrama() {
        return drama;
    }

    public void setDrama(List<Drama> drama) {
        this.drama = drama;
    }

}
