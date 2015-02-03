package br.com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author VictorSampaio
 *
 */
public class AdicionaProduto {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Produto p = new Produto();
		//p.setId(0);
		System.out.println("ID do produto Id: " + p.getId());
		
		// Nome
		p.setNome("Nome Prod 3");
		System.out.println("ID do produto Name: " + p.getNome());
		// Descricao
		p.setDescricao("Descricao Prod 3");
		System.out.println("ID do produto Desc: " + p.getDescricao());
		// Valor
		p.setPreco(300.30);
		System.out.println("ID do produto Preco: " + p.getPreco());
		
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Produto.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
		System.out.println("ID do produto: " + p.getId());
		session.close();
	}

}
