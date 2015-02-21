/**
 * 
 */
package br.com.hibernate.control.validacaoproduto;

import javax.swing.JOptionPane;

/**
 * @author VictorSampaio
 *
 */
public class ValidacaoNome {
	// Nome
		public static String validacaoNome(String nome) {
			System.out.println("Nome :" + nome.length());

			/**
			 * while (nome.length() >= 50) { JOptionPane.showMessageDialog(null,
			 * "Nome Invalido Com mais de 50 Caracteres"); }
			 */

			// Verifica se Existe caracter em Nome
			if (nome.length() >= 1) {
				System.out.println("Nome com Caracteres");
			} else {
				JOptionPane.showMessageDialog(null,
						"Nome Invalido. Insira Caracteres");
			}
			return nome;

		}

		

}
