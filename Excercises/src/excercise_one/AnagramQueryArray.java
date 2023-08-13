package excercise_one;

import java.util.Scanner;
import java.util.*;

/**
 * Class has main method which takes 2 user entered input argument String arrays
 * The first array consists of Strings that will be tested against the second array of Strings
 * The result determines if Strings in the first array are anagrams of Strings from the second array
 * An array of sorted anagrams found is the end result   
 * @author jgard
 */
public class AnagramQueryArray {

	/**
	 * Takes 2 input argument strings 
	 * and checks if their lengths are equal 
	 * @param n
	 * @param q
	 * @return boolen value
	 */
	public boolean testLength(String n, String q) {
		
		// checking for string equal length
		if (n.length() == q.length())
			return true;
		else
			return false;
	}
	
	/**
	 * Takes 2 input argument strings, transfers to char array, 
	 * sorts characters arrays, if character arrays are equal 
	 * the strings are anagrams and returns true 
	 * @param n
	 * @param q
	 * @return boolean
	 */
	public boolean testStringCharacters(String n, String q) {
		
		// char array conversion
		char[] nArray = new char[n.length()];
		char[] qArray = new char[q.length()];
		
		// already know lengths are equal
		for (int i = 0; i < n.length(); i++) {
			nArray[i] = n.charAt(i);
			qArray[i] = q.charAt(i);
		}
		
		char temp;
		
		// sorting n
		for (int i = 0; i < nArray.length; i++) {
			for (int j = i + 1; j < nArray.length; j++) {
				if (nArray[i] > nArray[j]) {
					temp = nArray[i];
					nArray[i] = nArray[j];
					nArray[j] = temp;
				}
			}
		}
		
		// sorting q
		for (int i = 0; i < qArray.length; i++) {
			for (int j = i + 1; j < qArray.length; j++) {
				if (qArray[i] > qArray[j]) {
					temp = qArray[i];
					qArray[i] = qArray[j];
					qArray[j] = temp;
				}
			}
		}
		
		// if sorted are equal they are the same
		boolean test = Arrays.equals(nArray, qArray);
		if (test)
			return true;
		else 
			return false; 
	}
	
	/**
	 * Takes 2 input argument String ArrayLists to determine if 
	 * there are anagrams of queries array Strings in words array Strings
	 * @param words
	 * @param queries
	 */
	public void getSearchResults(ArrayList<String> words, ArrayList<String> queries) {
	
		// convert to String arrays
		String [] n = new String[words.size()];
		String [] q = new String[queries.size()];
		
		// transfers ArrayList to String arrays
		int i = 0;
		while (i < n.length) {
			n[i] = words.get(i);
			i++;
		}
		
		int j = 0;
		while (j < q.length) {
			q[j] = queries.get(j);
			j++;
		}
		
		// find anagrams in n from q
		String[] anagrams = new String[n.length];
		int count = 0;
		for (i = 0; i < n.length; i++) {
			for (j = 0; j < q.length; j++) {
				if (testLength(n[i], q[j]))
					if(testStringCharacters(n[i], q[j])) {
						System.out.println(n[i] + " is an anagram.");
						anagrams[count] = n[i];
						count++;
					}
			}
		}
		
		// display anagrams array 
		System.out.print("Array of anagrams[");
		for (int k = 0; k < count; k++) {
			System.out.print(anagrams[k]);
			if (k < count - 1)
				System.out.print(", ");
		}
		System.out.print("]");
		
		ArrayList<String> sorted = new ArrayList<String>();
		
		for (int k = 0; k < anagrams.length; k++) {
			if (anagrams[k] != null)
				sorted.add(anagrams[k]);
		}
		
		Collections.sort(sorted);
		System.out.println("\nSorted array of anagrams: " + sorted);	
	}
	
	public static void main(String[] args) {
		
		AnagramQueryArray anagramQueryArray = new AnagramQueryArray();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<String>(); 
		ArrayList<String> queries = new ArrayList<String>(); 
		int choice = 1;
		
		// menu to add more Strings to words ArrayList<String>
		while (choice == 1) {
			System.out.println("Please enter a word.");
			words.add(sc.nextLine());
			System.out.println("Would you like to add another?");
			System.out.println("1 -> yes");
			System.out.println("2 -> no");
			choice = sc.nextInt();
			sc.nextLine();
		}
		
		choice = 1;
		
		// menu to add more Strings to queries ArrayList<String>
		while (choice == 1) {
			System.out.println("Please enter a word to query: ");
			queries.add(sc.nextLine());
			System.out.println("Would you like to add another?");
			System.out.println("1 -> yes");
			System.out.println("2 -> no");
			choice = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("These are the words you chose: " );
		System.out.println(words);
		System.out.println("These are the queries you chose: " );
		System.out.println(queries);
		
		anagramQueryArray.getSearchResults(words, queries);
		
		sc.close();
	}	
}
