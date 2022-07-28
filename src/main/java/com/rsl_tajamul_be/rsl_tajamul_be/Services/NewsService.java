package com.rsl_tajamul_be.rsl_tajamul_be.Services;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.News;

import java.util.ArrayList;

public interface NewsService {
    News saveNews(News news);

    ArrayList<News> getNews();

    News getNewsById(Long newsId);

    void deleteNews(Long newsId);

    News updateNews(Long newsId, News news);
}
