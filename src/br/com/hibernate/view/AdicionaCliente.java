/**
 * 
 */
package br.com.hibernate.view;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.hibernate.bean.Cliente;

/**
 * @author VictorSampaio
 *
 */
public class AdicionaCliente {

	public static void main(String[] args) {

		// Create a New Cliente
		Cliente cliente = new Cliente();
		// p.setId(0);
		System.out.println("ID do produto Id: " + cliente.getId());

		cliente.setNome(JOptionPane.showInputDialog("Insira o Nome: "));
		cliente.setCidade(JOptionPane.showInputDialog("Insira a Cidade: "));
		cliente.setCpf(JOptionPane.showInputDialog("Insira o CPF: "));
		cliente.setRg(JOptionPane.showInputDialog("Insira o RG: "));
		cliente.setTelefone(JOptionPane.showInputDialog("Insira o Telefone: "));
		
		
		// Annotation Configuration
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(Cliente.class);
		
		// Session - SessionFactory
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		// Session 
		session.beginTransaction();
		session.save(cliente);
		session.getTransaction().commit();
		
		//Results
		System.out.println("Id Cliente: " + cliente.getId());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("RG: " + cliente.getRg());
		System.out.println("Cidade: " + cliente.getCidade());
		System.out.println("Telefone: " + cliente.getTelefone());
		session.close();
		
		JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso");
		
	}
}









