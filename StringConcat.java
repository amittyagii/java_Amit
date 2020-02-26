/*
 * Prob-1
===============
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"

public String comboString(String a, String b) {
  
}
*/




package pack;
import java.util.Scanner;
public class StringConcat {
	
	 public static String comboString(String a, String b) {
		int x=a.length();
		int y=b.length();
		if(x==y) {
			return "Same Lenght so error";
		}
		if(x>y) {
			return b+a+b;
		}
		else {
			return a+b+a;
		}
		
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two String");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		StringConcat sac=new StringConcat();
	    String x=sac.comboString(str1,str2);
	    System.out.println(x);
	}

}
