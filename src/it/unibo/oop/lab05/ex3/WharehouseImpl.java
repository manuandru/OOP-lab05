package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;


public class WharehouseImpl implements Warehouse {
	
	private final Set<Product> set = new HashSet<>();

	
	public void addProduct(Product p) {
		this.set.add(p);
	}


	public Set<String> allNames() {
		return Set.copyOf(this.nameSet());
	}


	public Set<Product> allProducts() {
		return Set.copyOf(this.set);
	}


	public boolean containsProduct(Product p) {
		return this.set.contains(p);
	}

	
	public double getQuantity(String name) {
		return this.containsProduct(name) ? 
				this.getProduct(name).getQuantity()
				: -1;
	}
	
	private Product getProduct(String name) {
		for (var elem : this.set) {
			if (elem.getName() == name) {
				return elem;
			}
		}
		return null;
	}
	
	
	/**
	 * Utility method
	 * 
	 *@return true if the set contains the product referenced by name 
	 */
	private boolean containsProduct(String s) {
		return this.nameSet().contains(s);
	}
	
	/**
	 * Utility method
	 * 
	 *@return Set of name of all products 
	 */
	private Set<String> nameSet() {
		final Set<String> names = new HashSet<>();
		for (var elem : this.set) {
			names.add(elem.getName());
		}
		
		return names;
	}

}
