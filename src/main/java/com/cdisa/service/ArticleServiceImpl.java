package com.cdisa.service;

import com.cdisa.dao.ArticleRepository;
import com.cdisa.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    @Transactional
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> listArticles() {
        return articleRepository.findTop10ByOrderByCreatedAtDesc();
    }

}