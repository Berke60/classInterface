package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entites.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger loggers;
	
	public ProductManager(ProductDao productDao, Logger loggers2 ) {
		this.productDao = productDao;
		this.loggers = loggers2;
	}
	
	public void Add(Product product) throws Exception {
		// iş kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}
		
		HibernateProductDao productDao = new HibernateProductDao();
		productDao.Add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}

}
