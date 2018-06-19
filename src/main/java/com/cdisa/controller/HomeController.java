package com.cdisa.controller;

import com.cdisa.model.Article;
import com.cdisa.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@ComponentScan
public class HomeController {

    final private ArticleService articleService;

    @Autowired
    public HomeController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping("/")
    public String indexAction(ModelMap model) {
        List<Article> articles = this.articleService.listArticles();
        model.addAttribute("articles", articles);
        return "home";
    }

}
