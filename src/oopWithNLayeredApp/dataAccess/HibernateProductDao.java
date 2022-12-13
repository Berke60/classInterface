package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entites.Product;

public class HibernateProductDao implements ProductDao{
	public void Add(Product product) {
		System.out.println("Hiber nate ile veri tabanına eklendi");
	}

}
