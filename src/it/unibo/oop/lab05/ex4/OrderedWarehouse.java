package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WharehouseImpl;

public class OrderedWarehouse extends WharehouseImpl {


	
	public Set<Product> allProducts() {
		/* I could return in one line 
		 * return new TreeSet<>(super.allProducts());
		 */
		Set<Product> set = new TreeSet<Product>();
		set.addAll(super.allProducts());
		
		return set;
	}

}
