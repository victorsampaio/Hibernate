/**
 * 
 */
package br.com.hibernate.view;

import br.com.hibernate.control.Venda;

/**
 * @author VictorSampaio
 *
 */
public class SaleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		Venda objVenda = new Venda();
		objVenda.setCliente("");
		objVenda.setProduto("");
		objVenda.setValor(40.00);

	}

}
