/**
 * 
 */
package br.com.hibernate.control;

import java.util.Iterator;

import javax.swing.JOptionPane;

import br.com.hibernate.bean.Product;
import br.com.hibernate.control.validacaoproduto.NameValidation;

/**
 * @author VictorSampaio
 *
 */
public class ProductValidation {
	
		public static String validaNome(String nome) {			
			NameValidation.validacaoNome(nome);
			
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
