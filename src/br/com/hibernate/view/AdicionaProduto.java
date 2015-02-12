package br.com.hibernate.view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.hibernate.bean.Produto;

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
		p.setNome("Produto TICO");
		System.out.println("ID do produto Name: " + p.getNome());
		// Descricao
		p.setDescricao("Descricao TICO");
		System.out.println("ID do produto Desc: " + p.getDescricao());
		// Valor
		p.setPreco(555.55);
		System.out.println("ID do produto Preco: " + p.getPreco());
				
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Produto.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
		System.out.println("ID do produto: " + p.getId());
		System.out.println("Nome do produto: " + p.getNome());
		System.out.println("Descrição do produto: " + p.getDescricao());
		System.out.println("Preço do produto: " + p.getPreco());
		session.close();
	}

}
