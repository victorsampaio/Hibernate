/**
 * 
 */
package br.com.hibernate.control;

import java.util.Iterator;

import javax.swing.JOptionPane;

import br.com.hibernate.bean.Produto;
import br.com.hibernate.control.validacaoproduto.ValidacaoNome;

/**
 * @author VictorSampaio
 *
 */
public class ValidacaoProduto {
	
		public static String validaNome(String nome) {			
			ValidacaoNome.validacaoNome(nome);
			
			return nome;
		}
	
	// Codigo de Barra - EAN
	public static String validaCodigoEan(String codigoEan) {
		// Verifica se Existe caracter em Nome
		if (codigoEan.length() >= 1) {
			System.out.println("Codigo EAN com Caracteres");
		} else {
			JOptionPane.showMessageDialog(null,
					"Codigo EAN Invalido. Insira Caracteres");
		}

		return codigoEan;

	}
}
