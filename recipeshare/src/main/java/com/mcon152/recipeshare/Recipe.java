package com.mcon152.recipeshare;

import jakarta.persistence.*;
// Comments for Homework 4
// The Recipe class is part of the Model (in MVC) because it represents the data structure
// of a recipe, and it holds the fields, getters, setters...

@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Column(length = 2000)
    private String ingredients;

    @Column(length = 4000)
    private String instructions;

    private Integer servings; // New field for number of servings

    // Constructors
    public Recipe() {}

    public Recipe(Long id, String title, String description, String ingredients, String instructions, Integer servings) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.servings = servings;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }

    public Integer getServings() { return servings; }
    public void setServings(Integer servings) { this.servings = servings; }
}
