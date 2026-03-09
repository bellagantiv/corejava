package com.day10;

import java.util.UUID;

public class Player {

    private UUID id;
    private   String name;
    private   String role;
    private   String country;
    private   String team;
    private double amount;

    public Player(UUID id, double amount, String team, String country, String role, String name) {
        this.id = id;
        this.amount = amount;
        this.team = team;
        this.country = country;
        this.role = role;
        this.name = name;
    }

    public Player(long id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTeam(String team) {
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTeam(String team) {
    }

    public void setTeam(String team) {

    }
}
