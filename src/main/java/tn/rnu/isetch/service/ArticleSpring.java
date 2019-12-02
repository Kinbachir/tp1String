package tn.rnu.isetch.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.rnu.isetch.modele.Article;
import tn.rnu.isetch.repository.ArticleRepostory;
@Service
public class ArticleSpring implements IArticle{
    @Autowired
	ArticleRepostory resp;
	@Override
	public void addArticle(Article a) {
		resp.save(a);
	}

	@Override
	public List<Article> listeArticle() {
		return (List<Article>) resp.findAll();
	}
	@Override
	public Article getById(Integer id) {
		return resp.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		resp.deleteById(id);
	}

	@Override
	public void update(Article a, Integer id) {
		resp.save(a);
	}

	

}
