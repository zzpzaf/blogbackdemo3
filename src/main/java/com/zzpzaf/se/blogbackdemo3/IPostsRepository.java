package com.zzpzaf.se.blogbackdemo3;

import java.util.List;

public interface IPostsRepository {

    List<Category> getCategories();

    Category getCategoryById(int id);


    List<Article> getArticles(); 

    List<Article> getCategoryArticles(int id); 

    Article getArticleById(int id);

}


