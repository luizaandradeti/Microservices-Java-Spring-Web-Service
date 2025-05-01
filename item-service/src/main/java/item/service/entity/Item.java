package item.service.entity;

import lombok.Getter;
import javax.persistence.Id;

@Getter
public class Item {
    @Id
    private String id;
	private String nome;
	private double preco;

	// Constructor, getters, and setters
	public Item(String id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

}