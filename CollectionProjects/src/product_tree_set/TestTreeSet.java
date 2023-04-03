package product_tree_set;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {

	public static void main(String[] args){
		TreeSet<String> product = new TreeSet<>();
		
		product.add("tv");
		product.add("chair");
		product.add("couch");
		product.add("bed");
		product.add("couch");
		
		Iterator<String> itr = product.iterator();
		
		System.out.println("The full set of products");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println();
		
		System.out.println("The first product:");
		System.out.println(product.first());
		System.out.println();
		
		System.out.println("The last product:");
		System.out.println(product.last());
		System.out.println();
		
		System.out.println("The size of the set:");
		System.out.println(product.size());
		System.out.println();
		
		System.out.println("Removing couch from the set:");
		product.remove("couch");
		System.out.println();
		
		System.out.println("The full set of products");
		itr = product.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println();
		
		System.out.println("The size of the set:");
		System.out.println(product.size());
	}
}
