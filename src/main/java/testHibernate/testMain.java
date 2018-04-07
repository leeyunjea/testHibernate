package testHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class testMain {

	private static SessionFactory sessionFactory; //어플리케이션에서 한번 만듬
	
	public static void main(String[] args) {
		
		/*Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml"); //"hibernate.cfg.xml" 이건 디폴트 이름이어서 빼도 되는데 다른이름으로 하면 넣어주어야한다.
		sessionFactory = conf.buildSessionFactory();*/
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Product product = new Product();
		product.setName("notebook1");
		product.setPrice(1000);
		product.setDescription("Powerful notebook!!!!");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(product); //sql statement를 사용하여 했었는데 이문장 하나로 create가 된다.
		
		tx.commit();
		session.close();
		
	}

}
