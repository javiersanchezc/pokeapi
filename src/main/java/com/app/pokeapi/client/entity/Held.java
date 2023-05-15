package com.app.pokeapi.client.entity;

import java.util.ArrayList;

public class Held  {
    private HeldItem item;
    private ArrayList<VersionDetail> version_details;

    public Held() {
    }

    public Held(HeldItem item, ArrayList<VersionDetail> version_details) {
        this.item = item;
        this.version_details = version_details;
    }

    public HeldItem getItem() {
        return item;
    }

    public void setItem(HeldItem item) {
        this.item = item;
    }

    public ArrayList<VersionDetail> getVersionDetails() {
        return version_details;
    }

    public void setVersionDetails(ArrayList<VersionDetail> version_details) {
        this.version_details = version_details;
    }

    @Override
    public String toString() {
        return "Held{" +
                "item=" + item +
                ", version_details=" + version_details +
                '}';
    }
}
