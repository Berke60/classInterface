package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entites.Product;

public class jdbcProductDao implements ProductDao{
	public void Add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi");
	}
	
}


