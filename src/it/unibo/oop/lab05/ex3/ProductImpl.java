package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private double quantity;
	
	
	public ProductImpl(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}


	public String getName() {
		return this.name;
	}

	
	public double getQuantity() {
		return this.quantity;
	}



	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + "]";
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductImpl other = (ProductImpl) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


//    public int hashCode() {
//        return name.hashCode();
//    }
//
//    
//    public boolean equals(final Object obj) {
//        if (obj instanceof Product) {
//            final var pr = (Product) obj;
//            return name.equals(pr.getName());
//        }
//        return false;
//    }
    
    
	
	

}
