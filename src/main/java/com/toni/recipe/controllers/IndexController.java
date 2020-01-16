package com.toni.recipe.controllers;

import com.toni.recipe.domain.Category;
import com.toni.recipe.domain.UnitOfMeasure;
import com.toni.recipe.repositories.CategoryRepository;
import com.toni.recipe.repositories.UnitOfMeasureRepository;
import com.toni.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
