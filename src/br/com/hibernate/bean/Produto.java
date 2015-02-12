package br.com.hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;
/**
 * @author VictorSampaio
 *
 */
@Entity
@Table
public class Produto {
	// Hibernate annotations: 
	// Identity - Mapeado para colunas identity no DB2, MySQL, MSSQL, Sybase, HSQLDM, Infomix. 
	// Sequence- Mapeado em seqüências no DB2, PostgreSQL, Oracle, SAP DB, irebird (ou generator no Interbase). 
	
	@Id @NotNull
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name = "id") 
	private int id; 

	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="preco")
	private double preco;
	
	
	
	//---Getters and Setters---\\
	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
