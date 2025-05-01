package com.compraservice;

import lombok.Getter;


public class Item {
	private String id;
	private String nome;
	private double preco;

	// Constructor, getters, and setters
	public Item() {}

	public Item(String id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
}