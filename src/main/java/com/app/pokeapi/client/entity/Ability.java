package com.app.pokeapi.client.entity;

public class Ability {

    private AbilityObject ability;
    private Boolean is_hidden;
    private Integer slot;

    public Ability() {
    }

    public Ability(AbilityObject ability, Boolean is_hidden, Integer slot) {
        this.ability = ability;
        this.is_hidden = is_hidden;
        this.slot = slot;
    }

    public AbilityObject getAbility() {
        return ability;
    }

    public void setAbility(AbilityObject ability) {
        this.ability = ability;
    }

    public Boolean getHidden() {
        return is_hidden;
    }

    public void setHidden(Boolean hidden) {
        is_hidden = hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "ability=" + ability +
                ", isHidden=" + is_hidden +
                ", slot=" + slot +
                '}';
    }
}
