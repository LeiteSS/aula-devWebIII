package com.fatec.grupo3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Veiculo {
	
	@Id
	@Column(unique = true)
	private String placa;
	
	@NotNull
	private String fabricante;
	
	@NotNull
	@Size(min = 3, max = 12)
	private String cilindros;
	
	@Min(2)
	private int quantidadeDePassageiros;
	// ...
}
