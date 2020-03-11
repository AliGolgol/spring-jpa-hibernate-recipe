package com.spring.recipe.services;

import com.spring.recipe.domains.Recipe;
import com.spring.recipe.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImp implements RecipeService {

    private final RecipeRepository repository;

    public RecipeServiceImp(RecipeRepository repository) {
        this.repository = repository;
    }


    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I am in the recipe service");
        Set<Recipe> recipes=new HashSet<>();
        repository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
