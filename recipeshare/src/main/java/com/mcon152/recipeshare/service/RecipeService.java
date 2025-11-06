

package com.mcon152.recipeshare.service;

import com.mcon152.recipeshare.Recipe;

import java.util.List;
import java.util.Optional;
// Comments for Homework 4
// The RecipeService class is part of the Service layer (as per the name),
// which isn't really in the MVC layers but its in between the Controller and Model
// Its job is to define business operations
public interface RecipeService {
    Recipe addRecipe(Recipe recipe);
    List<Recipe> getAllRecipes();
    Optional<Recipe> getRecipeById(long id);
    boolean deleteRecipe(long id);
    Optional<Recipe> updateRecipe(long id, Recipe updatedRecipe);
    Optional<Recipe> patchRecipe(long id, Recipe partialRecipe);
}

