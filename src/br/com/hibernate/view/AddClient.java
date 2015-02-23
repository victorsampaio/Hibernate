/**
 * 
 */
package br.com.hibernate.view;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.hibernate.bean.Client;

/**
 * @author VictorSampaio
 *
 */
public class AddClient {

	public static void main(String[] args) {

		// Create a New Cliente
		Client cliente = new Client();
		// p.setId(0);
		System.out.println("ID do produto Id: " + cliente.getId());

		// Razão Social
		cliente.setRazaoSocial(JOptionPane.showInputDialog("Razão Social: "));
		
		// Fantasia
		cliente.setFantasia(JOptionPane.showInputDialog("Fantasia: "));
		//Telefone
		cliente.setTelefone(JOptionPane.showInputDialog("Telefone: "));
		//Estado UF
		cliente.setEstadoUF(JOptionPane.showInputDialog("Estado(UF): "));
		//Cidade
		cliente.setCidade(JOptionPane.showInputDialog("Cidade: "));
		// Endereço
		cliente.setEndereco(JOptionPane.showInputDialog("Endereço: "));
		// Numero
		cliente.setNumero(JOptionPane.showInputDialog("Numero: "));
		//Pessoa Juridica/Fisica
		cliente.setPessoaJuridicaFisica(JOptionPane.showInputDialog("Pessoa Juridica(J) - Fisica(F): "));
		//CPF
		cliente.setCpf(JOptionPane.showInputDialog("CPF: "));
		// Registro Geral (RG)
		cliente.setRg(JOptionPane.showInputDialog("Registro Geral (RG): "));
		
		// Annotation Configuration
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(Client.class);
		
		// Session - SessionFactory
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		// Session 
		session.beginTransaction();
		session.save(cliente);
		session.getTransaction().commit();
		
		//Results
		System.out.println("Id Cliente: " + cliente.getId());
		System.out.println("Nome: " + cliente.getRazaoSocial());
		System.out.println("Fantasia: " + cliente.getFantasia());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("Estado(UF): " + cliente.getEstadoUF());
		System.out.println("Cidade: " + cliente.getCidade());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Numero: " + cliente.getNumero());
		System.out.println("Pessoa Juridica(J) - Fisica(F): " + cliente.getPessoaJuridicaFisica());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("RG: " + cliente.getRg());
		
		System.out.println("Telefone: " + cliente.getTelefone());
		session.close();
		
		JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso");
		
	}
}









