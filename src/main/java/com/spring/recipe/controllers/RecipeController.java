package com.spring.recipe.controllers;

import com.spring.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/index")
    public String getRecipes(Model model){
        log.debug("We are in recipe controller... ");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
