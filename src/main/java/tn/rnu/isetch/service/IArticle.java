package tn.rnu.isetch.service;

import java.util.List;

import tn.rnu.isetch.modele.Article;

public interface IArticle {
	public void addArticle(Article a);
	public List<Article> listeArticle();
	public Article getById(Integer id);
	public void delete(Integer id);
	public void update (Article a,Integer id);
}
