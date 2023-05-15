package com.app.pokeapi.client.entity;

public class VersionDetail {
    private Integer rarity;
    private Version version;

    public VersionDetail() {
    }

    public VersionDetail(Integer rarity, Version version) {
        this.rarity = rarity;
        this.version = version;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "VersionDetail{" +
                "rarity=" + rarity +
                ", version=" + version +
                '}';
    }
}
