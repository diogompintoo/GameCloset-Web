package com.gamecloset.gamecloset_web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "games")

public class Game {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private String platform;
    private int year;
    private String condition;
    private double price;

    public Game() {
    }
    public Game(String title,
                String genre,
                String platform,
                int year,
                String condition,
                double price) {

        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }
    //GET
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getPlatform() {
        return platform;
    }
    public void getYear(int year) {
        this.year = year;
    }
    public String getCondition() {
        return condition;
    }
    public double getPrice() {
        return price;
    }

    //SET
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
