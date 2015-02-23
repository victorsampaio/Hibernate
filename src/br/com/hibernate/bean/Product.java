package br.com.hibernate.bean;

//Hibernate annotations: 
// Identity - Mapeado para colunas identity no DB2, MySQL, MSSQL, Sybase, HSQLDM, Infomix. 
// Sequence- Mapeado em seqüências no DB2, PostgreSQL, Oracle, SAP DB, irebird (ou generator no Interbase).

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * @author VictorSampaio 
 * 		id - descricao - tipo - codigodebarra, estoqueFisico,
 *      estoqueSolicitado, estoqueDisponivel, precoDeCompra, precoDeVenda
 *
 */
@Entity
@Table
public class Product {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nome")
	@Length @NotNull
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "codigoEan")
	@NotNull
	private String codigoEan;

	@Column(name = "estoqueFisico")
	private int estoqueFisico;

	@Column(name = "estoqueSolicitado")
	private int estoqueSolicitado;

	@Column(name = "estoqueDisponivel")
	private int estoqueDisponivel;

	@Column(name = "precoCompra")
	private double precoCompra;

	@Column(name = "precoVenda")
	private double precoVenda;
	// ---Getters and Setters---\\

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigoEan() {
		return codigoEan;
	}

	public void setCodigoEan(String codigoEan) {
		this.codigoEan = codigoEan;
	}

	public int getEstoquefisico() {
		return estoqueFisico;
	}

	public void setEstoquefisico(int estoqueFisico) {
		this.estoqueFisico = estoqueFisico;
	}

	public int getEstoqueSolicitado() {
		return estoqueSolicitado;
	}

	public void setEstoqueSolicitado(int estoqueSolicitado) {
		this.estoqueSolicitado = estoqueSolicitado;
	}

	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public void setEstoqueDisponivel(int estoqueDisponivel) {
		this.estoqueDisponivel = estoqueDisponivel;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	
	
}
