package br.com.hibernate.view;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.hibernate.bean.Product;
import br.com.hibernate.control.ProductValidation;

/**
 * @author VictorSampaio id - descricao - tipo - codigodebarra, estoqueFisico,
 *         estoqueSolicitado, estoqueDisponivel, precoDeCompra, precoDeVenda
 */
public class AddProduct {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Product produto = new Product();
		// p.setId(0);
		System.out.println("ID do produto Id: " + produto.getId());

		// Identificação
		produto.setNome(JOptionPane.showInputDialog("PRODUTO - Insira Nome: "));
		ProductValidation.validaNome(produto.getNome());
		System.out.println("Produto: " + produto.getNome());

		// Descricao
		produto.setDescricao(JOptionPane.showInputDialog("DESCRIÇÃO :"));
		System.out.println("Descrição :" + produto.getDescricao());

		// Tipo
		produto.setTipo(JOptionPane.showInputDialog("TIPO: "));
		System.out.println("Tipo: " + produto.getTipo());

		// Codigo de Barra - Codigo EAN
		produto.setCodigoEan(JOptionPane
				.showInputDialog("Codigo de Barra(EAN) :"));
		ProductValidation.validaCodigoEan(produto.getCodigoEan());
		System.out.println("Codigo de Barra(EAN): " + produto.getCodigoEan());

		// Estoque Fisico
		produto.setEstoquefisico(Integer.parseInt(JOptionPane
				.showInputDialog("Estoque Fisico: ")));
		System.out.println("Estoque Fisico: " + produto.getEstoquefisico());

		// Estoque Solicitado
		produto.setEstoqueSolicitado(Integer.parseInt(JOptionPane
				.showInputDialog("Estoque Solicitado")));
		System.out.println("Estoque Solicitado: "
				+ produto.getEstoqueSolicitado());

		// Estoque Disponivel
		produto.setEstoqueDisponivel(Integer.parseInt(JOptionPane
				.showInputDialog("Estoque Disponivel")));
		System.out.println("Estoque Disponivel: "
				+ produto.getEstoqueDisponivel());

		// Preco Compra
		produto.setPrecoCompra(Double.parseDouble(JOptionPane
				.showInputDialog("Preço de Compra: ")));
		System.out.println("Preço de Compra: " + produto.getPrecoCompra());

		// Preco Venda
		produto.setPrecoVenda(Double.parseDouble(JOptionPane
				.showInputDialog("Preço de Venda: ")));
		System.out.println("Preço de Venda: " + produto.getPrecoVenda());

		// Annotation Configuration
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Product.class);

		// Session Factory
		SessionFactory factory = cfg.buildSessionFactory();
		// Session
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(produto);
		session.getTransaction().commit();

		System.out.println("ID: " + produto.getId());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Descrição : " + produto.getDescricao());
		System.out.println("Tipo: " + produto.getNome());
		System.out.println("Codigo de Barra(EAN): " + produto.getCodigoEan());
		System.out.println("Estoque Fisico: " + produto.getEstoquefisico());
		System.out.println("Estoque Solicitado: "
				+ produto.getEstoqueSolicitado());
		System.out.println("Estoque Disponivel: "
				+ produto.getEstoqueDisponivel());
		System.out.println("Preço de Compra: " + produto.getPrecoCompra());
		System.out.println("Preço de Venda: " + produto.getPrecoVenda());
		session.close();

		JOptionPane.showMessageDialog(null, "Produto Salvo com Sucesso");
	}

}
