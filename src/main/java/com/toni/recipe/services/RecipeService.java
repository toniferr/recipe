package com.toni.recipe.services;

import com.toni.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
