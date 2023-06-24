package com.example.benchmarkjackson.entity;

public class Entity {
    private String id;
    private int age;
    private boolean isActive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Entity(String id, int age, boolean isActive) {
        this.id = id;
        this.age = age;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}
