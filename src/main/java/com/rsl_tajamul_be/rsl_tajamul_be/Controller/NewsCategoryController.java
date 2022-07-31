package com.rsl_tajamul_be.rsl_tajamul_be.Controller;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.Location;
import com.rsl_tajamul_be.rsl_tajamul_be.Entity.NewsCategory;
import com.rsl_tajamul_be.rsl_tajamul_be.Services.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class NewsCategoryController {

    @Autowired
    public NewsCategoryService newsCategoryService;

    @PostMapping("/saveNewsCategory")
    public NewsCategory saveNewsCategory(@RequestBody NewsCategory newsCategory){
        return newsCategoryService.saveNewsCategory(newsCategory);
    }
    @GetMapping("/getNewsCategory")
    public ArrayList<NewsCategory> getNewsCategory(){
        return newsCategoryService.getNewsCategory();
    }
    @GetMapping("/getNewsCategory/{id}")
    public NewsCategory getNewsCategoryById(@PathVariable("id")Long newsCategoryId){
        return newsCategoryService.getNewsCategoryById(newsCategoryId);
    }
    @DeleteMapping("/deleteNewsCategory/{id}")
    public String deleteNewsCategory(@PathVariable("id")Long newsCategoryId){
        newsCategoryService.deleteNewsCategory(newsCategoryId);
        return "NewsCategoryDeleted";
    }
    @PutMapping("/updateNewsCategory/{id}")
    public NewsCategory updateNewsCategory(@PathVariable("id")Long newsCategoryId,@RequestBody NewsCategory newsCategory){
        return newsCategoryService.updateNewsCategory(newsCategoryId, newsCategory);
    }




}
