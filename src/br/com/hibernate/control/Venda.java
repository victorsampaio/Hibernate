/**
 * 
 */
package br.com.hibernate.control;

/**
 * @author VictorSampaio
 *
 */
public class Venda {
	
	String cliente;
	String produto;
	double valor;
	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
}
