package com.flix.movieflix.mapper;

import com.flix.movieflix.controller.request.CategoryRequest;
import com.flix.movieflix.controller.response.CategoryResponse;
import com.flix.movieflix.entity.Category;
import lombok.experimental.UtilityClass;

@UtilityClass //classe que nao pode ser instanciado
public class CategoryMapper {
    public static Category toCategory(CategoryRequest categoryRequest) {
        return Category.builder().name(categoryRequest.name()).build();
    }

    public static CategoryResponse toCategoryResponse(Category category) {
        return CategoryResponse.builder().id(category.getId()).name(category.getName()).build();
    }
}
