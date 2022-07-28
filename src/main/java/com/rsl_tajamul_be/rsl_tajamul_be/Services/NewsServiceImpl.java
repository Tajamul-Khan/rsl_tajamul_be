package com.rsl_tajamul_be.rsl_tajamul_be.Services;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.News;
import com.rsl_tajamul_be.rsl_tajamul_be.Repository.NewsRepository;
import com.rsl_tajamul_be.rsl_tajamul_be.Services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;


    @Override
    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    @Override
    public ArrayList<News> getNews() {
        return (ArrayList<News>) newsRepository.findAll();
    }

    @Override
    public News getNewsById(Long newsId) {
        return newsRepository.findById(newsId).get();
    }

    @Override
    public void deleteNews(Long newsId) {
        newsRepository.deleteById(newsId);
    }

    @Override
    public News updateNews(Long newsId, News news) {
        News editNews = newsRepository.findById(newsId).get();

        if (Objects.nonNull(news.getNewsTitle()) && !" ".equalsIgnoreCase(news.getNewsTitle())){
            editNews.setNewsTitle(news.getNewsTitle());
        }
        if (Objects.nonNull(news.getNewsDescription()) && !" ".equalsIgnoreCase(news.getNewsDescription())){
            editNews.setNewsDescription(news.getNewsDescription());
        }
        return newsRepository.save(editNews);
    }
}
