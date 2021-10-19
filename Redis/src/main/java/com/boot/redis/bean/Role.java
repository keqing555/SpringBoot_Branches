package com.boot.redis.bean;

import java.io.Serializable;

public class Role implements Serializable {
    private int id;
    private String name;
    private String weapon;

    public Role() {
    }

    public Role(int id, String name, String weapon) {
        this.id = id;
        this.name = name;
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
