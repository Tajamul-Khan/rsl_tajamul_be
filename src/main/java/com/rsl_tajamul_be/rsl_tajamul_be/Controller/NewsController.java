package com.rsl_tajamul_be.rsl_tajamul_be.Controller;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.News;
import com.rsl_tajamul_be.rsl_tajamul_be.Services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @PostMapping("/saveNews")
    public News saveNews(@RequestBody News news) {
        return newsService.saveNews(news);
    }

    @GetMapping("/getNews")
    public ArrayList<News> getNews() {
        return newsService.getNews();
    }

    @GetMapping("/getNews/{id}")
    public News getNewsById(@PathVariable("id") Long newsId) {
        return newsService.getNewsById(newsId);
    }

    @DeleteMapping("/ deleteNews/{id}")
    public String deleteNewsId(@PathVariable("id") Long newsId) {
        newsService.deleteNews(newsId);
        return "newsDeleted";
    }

    @PutMapping("/updateNews/{id}")
    public News updateNews(@PathVariable("id") Long newsId, @RequestBody News news) {
        return newsService.updateNews(newsId, news);
    }


}
