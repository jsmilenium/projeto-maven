package br.com.josue.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class Hello implements Serializable {
	
	@PostConstruct
	public void init(){
		System.out.println(" Bean executado! ");
	}
	
	public String getMessage(){
		return "Hello World JSF!";
	}

}