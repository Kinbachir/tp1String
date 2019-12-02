package tn.rnu.isetch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import tn.rnu.isetch.modele.Article;
import tn.rnu.isetch.service.ArticleSpring;

@RestController
public class ArticleController {
	@Autowired
	Environment e;
	@Autowired
	ArticleSpring art;
	@GetMapping("/articles")
	public List<Article> liste()
	{
		return art.listeArticle();
	}
	@PostMapping("/add")
	public void add(@RequestBody Article a)
	{
		art.addArticle(a);
	}
	@DeleteMapping("/delete")
	public void delete(@PathVariable(name="id") Integer id)
	{
		art.delete(id);
	}
	@PutMapping("/update")
	public void update(@RequestBody Article a,@PathVariable(name="id") Integer id)
	{
		art.update(a,id);
	}
	
	@GetMapping("/instance")
	public String instance()
	{
		String port=e.getProperty("local.server.port");
		return port;
	}
	
}
