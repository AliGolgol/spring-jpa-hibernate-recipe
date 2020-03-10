package com.spring.recipe.repositories;

import com.spring.recipe.domains.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
