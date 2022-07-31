package com.rsl_tajamul_be.rsl_tajamul_be.Services;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.Location;
import com.rsl_tajamul_be.rsl_tajamul_be.Entity.NewsCategory;
import com.rsl_tajamul_be.rsl_tajamul_be.Repository.NewsCategoryRepository;

import java.util.ArrayList;
import java.util.Objects;

public class NewsCategoryServiceImpl implements NewsCategoryService {

    private NewsCategoryRepository newsCategoryRepository;

    @Override
    public NewsCategory saveNewsCategory(NewsCategory newsCategory) {
        return newsCategoryRepository.save(newsCategory);
    }

    @Override
    public ArrayList<NewsCategory> getNewsCategory() {
        return (ArrayList<NewsCategory>) newsCategoryRepository.findAll();
    }

    @Override
    public NewsCategory getNewsCategoryById(Long newsCategoryId) {
        return newsCategoryRepository.findById(newsCategoryId).get();
    }

    @Override
    public void deleteNewsCategory(Long newsCategoryId) {
        newsCategoryRepository.deleteById(newsCategoryId);
    }

    @Override
    public NewsCategory updateNewsCategory(Long newsCategoryId, NewsCategory newsCategory) {
        return null;
    }


}
