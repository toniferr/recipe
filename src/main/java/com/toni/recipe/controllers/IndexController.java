package com.toni.recipe.controllers;

import com.toni.recipe.domain.Category;
import com.toni.recipe.domain.UnitOfMeasure;
import com.toni.recipe.repositories.CategoryRepository;
import com.toni.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("America");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("teaspoon");

        System.out.println("category id is: "+categoryOptional.get().getId());
        System.out.println("uom id is: "+unitOfMeasureOptional.get().getId());

        return "index";
    }
}
