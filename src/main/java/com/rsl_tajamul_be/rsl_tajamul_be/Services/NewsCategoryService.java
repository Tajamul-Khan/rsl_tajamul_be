package com.rsl_tajamul_be.rsl_tajamul_be.Services;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.NewsCategory;

import java.util.ArrayList;

public interface NewsCategoryService {
    NewsCategory saveNewsCategory(NewsCategory newsCategory);

    ArrayList<NewsCategory> getNewsCategory();

    NewsCategory getNewsCategoryById(Long newsCategoryId);

    void deleteNewsCategory(Long newsCategoryId);

    NewsCategory updateNewsCategory(Long newsCategoryId, NewsCategory newsCategory);
}
