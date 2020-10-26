package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

	private static final int START = 1;
	private static final int STOP = 20;
	
	
    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         */
    	
    	// 1) Builds a TreeSet containing Strings
    	final Set<String> set = new TreeSet<>();
    	
    	
        // 2) Populates such Collection with all the Strings ranging from "1" to
        //    "20"
    	for (int i = START; i <= STOP; i++) {
    		set.add(Integer.toString(i));
    	}
    	
    	// 3) Prints its content
    	System.out.println(set);
    	
    	// 4) Removes all those strings whose represented number is divisible by
        //	  * three
    	
    	/* Error: ConcurrentModificationException
    	for (var elem : set) {
    		if (Integer.valueOf(elem) % 3 == 0) {
    			set.remove(elem);
    		}
    	}
    	*/
    	
    	var it = set.iterator();
    	
    	while (it.hasNext()) {
    		String elem = it.next();
    		
    		if (Integer.valueOf(elem) % 3 == 0) {
    			it.remove();
    		}
    	}
    	
    	
    	// 5) Prints the content of the Set using a for-each costruct
    	System.out.print("[");
    	for (var elem : set) {
    		System.out.print(elem + ", ");
    	}
    	System.out.println("]");
    	
    	// 6) Verifies if all the numbers left in the set are even
    	System.out.println(areAllEven(set));
    	
    	
    	
    	
    }
    
    //utility method
    private static boolean areAllEven(Set<String> set) {
		
    	for (var elem : set) {
    		if (isOdd(Integer.valueOf(elem))) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    private static boolean isOdd(int number) {
    	return number % 2 != 0;
    }
}
