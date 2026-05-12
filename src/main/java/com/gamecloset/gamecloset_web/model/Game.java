package com.gamecloset.gamecloset_web.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    private String genre;

    @NotBlank
    private String platform;

    private int releaseYear;

    private String condition;

    @Positive
    private double price;

    public Game() {}

    public Game(String title, String genre, String platform, int year, String condition, double price) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.releaseYear = year;
        this.condition = condition;
        this.price = price;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getPlatform() { return platform; }
    public int getReleaseYear() { return releaseYear; }
    public String getCondition() { return condition; }
    public double getPrice() { return price; }

    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPlatform(String platform) { this.platform = platform; }
    public void setReleaseYear(int year) { this.releaseYear = year; }
    public void setCondition(String condition) { this.condition = condition; }
    public void setPrice(double price) { this.price = price; }
}