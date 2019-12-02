package tn.rnu.isetch.DTO;

import java.io.Serializable;

public class ArticleDTO implements Serializable{
	private int id ;
	private String code;
	private String Designation;
	private double Prix_HT;
	private int 	TVA;
	private int prixTTC;
	public ArticleDTO() {}
}
