package it.unibo.oop.lab05.ex2;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	
    	//1) Creates a new ORDERED TreeSet of Strings. To order the set, define
        //   a new Comparator in a separate class.
    	
    	var myComparator = new MyStringComparator();
    	Set<String> set = new TreeSet<>(myComparator);
    	
    	//2) Inserts in the set a hundred strings containing randomly generated
        //   numbers (use Math.random())
    	
    	for (int i = 0; i < 80; i++) {
    		set.add(String.valueOf(Math.random()));
    	}
    	
    	// 3) Prints the set, which must be ordered
    	System.out.println(set);
    	
    	
    }
}
