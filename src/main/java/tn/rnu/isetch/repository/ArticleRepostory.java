package tn.rnu.isetch.repository;
import org.springframework.data.repository.CrudRepository;

import tn.rnu.isetch.modele.Article;
public interface ArticleRepostory extends CrudRepository<Article, Integer> {

}
