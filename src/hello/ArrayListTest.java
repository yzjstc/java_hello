package hello;

import java.util.ArrayList;

public class ArrayListTest {
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String note) {
		notes.add(note);
	}
	
	public String getNotes(int index) {
		// TODO Auto-generated method stub
		return notes.get(index);
	}
	public static void main(String[] args) {
		ArrayListTest notes = new ArrayListTest();
		String a = new String("1");
		String b = new String("2");
		String c = new String("3");
		notes.add(a);
		notes.add(b);
		notes.add(c);
		
		String d = c;
		c = "4";
		System.out.println(d);
		System.out.println(notes.getNotes(2));
		System.out.println(notes.getNotes(2) == c);
		System.out.println(notes.getNotes(2) == d);
		System.out.println(notes.getNotes(2) == "3");
		
	
	}
}
