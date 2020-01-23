package com.toni.recipe.services;

import com.toni.recipe.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    //void deleteById(Long id);

    void deleteById(Long recipeId, Long idToDelete);
}
