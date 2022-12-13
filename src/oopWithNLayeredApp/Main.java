package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.DatabaseLogger;
import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entites.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Iphone Xr", 10000);
		
		 Logger loggers;
		
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.Add(product1);

	}

}
