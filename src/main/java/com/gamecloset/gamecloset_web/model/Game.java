package com.gamecloset.gamecloset_web.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    private String genre;

    @NotBlank(message = "Platform is required")
    private String platform;

    private int releaseYear;

    private String condition;

    @Positive(message = "Price must be greater than zero")
    private double price;

    public Game() {}

    public Game(String title, String genre, String platform, int releaseYear, String condition, double price) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.releaseYear = releaseYear;
        this.condition = condition;
        this.price = price;
    }

    //GETTERS
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getPlatform() { return platform; }
    public int getReleaseYear() { return releaseYear; }
    public String getCondition() { return condition; }
    public double getPrice() { return price; }

    //SETTERS
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPlatform(String platform) { this.platform = platform; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
    public void setCondition(String condition) { this.condition = condition; }
    public void setPrice(double price) { this.price = price; }
}