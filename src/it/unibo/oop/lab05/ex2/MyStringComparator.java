package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {


	public int compare(String s1, String s2) {
		return 1 - s1.compareTo(s2);
	}

}
