/**
 * 
 */
package br.com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * @author VictorSampaio
 *
 */
public class GeraTabelas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Produto.class);
		
		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);
	}
}
