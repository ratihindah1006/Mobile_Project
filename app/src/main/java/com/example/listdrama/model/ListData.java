
package com.example.listdrama.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListData {

    @SerializedName("populer")
    @Expose
    private List<Populer> populer = null;
    @SerializedName("romace")
    @Expose
    private List<Romace> romace = null;
    @SerializedName("drama")
    @Expose
    private List<Drama> drama = null;
    @SerializedName("action")
    @Expose
    private List<Action> action = null;
    @SerializedName("fantasi")
    @Expose
    private List<Fantasi> fantasi = null;
    @SerializedName("horor")
    @Expose
    private List<Horor> horor = null;

    public List<Populer> getPopuler() {
        return populer;
    }

    public void setPopuler(List<Populer> populer) {
        this.populer = populer;
    }

    public List<Romace> getRomace() {
        return romace;
    }

    public void setRomace(List<Romace> romace) {
        this.romace = romace;
    }

    public List<Drama> getDrama() {
        return drama;
    }

    public void setDrama(List<Drama> drama) {
        this.drama = drama;
    }

    public List<Action> getAction() {
        return action;
    }

    public void setAction(List<Action> action) {
        this.action = action;
    }

    public List<Fantasi> getFantasi() {
        return fantasi;
    }

    public void setFantasi(List<Fantasi> fantasi) {
        this.fantasi = fantasi;
    }

    public List<Horor> getHoror() {
        return horor;
    }

    public void setHoror(List<Horor> horor) {
        this.horor = horor;
    }

}
