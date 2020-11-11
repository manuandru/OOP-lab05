package it.unibo.oop.lab05.ex5;

import java.util.Collection;

/**
 *
 */
public final class Utilities {

    private Utilities() {
    }

    /**
     * Copies all the element of the first collection in the second collection.
     * 
     * @param source
     *            the source collection
     * @param target
     *            the target collection
     * @param <X>
     *            Collection type
     */
    public static <X> void copyAll(final Collection<X> source, final Collection<? super X> target) {
    	/*for (var elem : source) {
    		target.add(elem);
    	}*/
    	target.addAll(source);
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     * 
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	
    	//better use new Random().nextInt(coll.size());
    	int random = (int) (Math.random() * coll.size());
    	X value = null;
    	int count = 0;
    	
    	for (var elem : coll) {
    		if (count == random) {
    			value = elem;
    		}
    		count++;
    	}
    	
        return value;
    }

    /**
     * @param one
     *            first collection
     * @param two
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> one, final Collection<Y> two) {
    	Pair<X, Y> value = new Pair<>(
    			Utilities.getRandomElement(one),
    			Utilities.getRandomElement(two)
    			);
        return value;
    }
}
