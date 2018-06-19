package com.cdisa.service;

import com.cdisa.model.Article;

import java.util.List;

public interface ArticleService {

    Article save(Article person);

    List<Article> listArticles();

}
