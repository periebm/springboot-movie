package com.flix.movieflix.service;

import com.flix.movieflix.entity.Category;
import com.flix.movieflix.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }


    public Category saveCategory(Category category) {
        return repository.save(category);
    }


    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }

}
