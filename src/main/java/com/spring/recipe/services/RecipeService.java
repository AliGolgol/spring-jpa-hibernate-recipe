package com.spring.recipe.services;

import com.spring.recipe.domains.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
