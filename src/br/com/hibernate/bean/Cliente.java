/**
 * 
 */
package br.com.hibernate.bean;

//Hibernate annotations: 
// Identity - Mapeado para colunas identity no DB2, MySQL, MSSQL, Sybase, HSQLDM, Infomix. 
// Sequence- Mapeado em seqüências no DB2, PostgreSQL, Oracle, SAP DB, irebird (ou generator no Interbase).

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.NotNull;

/**
 * @author VictorSampaio
 *
 *         Cod_ID - RazaoSocial - Fantasia - Fone, Estado, Cidade, Endereço,
 *         Numero, Complemento, Bairro, Cep, Contato, Email, Pessoa:
 *         Juridica/Fisica
 */
@Entity
@Table
public class Cliente {

	// Identify
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "razaoSocial")
	private String razaoSocial;

	@Column(name = "nomeFantasia")
	private String fantasia;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "estadoUF")
	private String estadoUF;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "numero")
	private String numero;

	@Column(name = "pessoaJuridicaFisica")
	private String pessoaJuridicaFisica;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "rg")
	private String rg;

	// ---- Getters and Setters ---- \\

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEstadoUF() {
		return estadoUF;
	}

	public void setEstadoUF(String estadoUF) {
		this.estadoUF = estadoUF;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPessoaJuridicaFisica() {
		return pessoaJuridicaFisica;
	}

	public void setPessoaJuridicaFisica(String pessoaJuridicaFisica) {
		this.pessoaJuridicaFisica = pessoaJuridicaFisica;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
