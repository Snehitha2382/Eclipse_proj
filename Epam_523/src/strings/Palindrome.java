package strings;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         StringBuffer sb = new StringBuffer(str);
         sb.reverse();
         String s = sb.toString();
         if(s.equalsIgnoreCase(str))
        	 System.out.println("True");
         else
        	 System.out.println("False");
         String a = sc.nextLine();
         String b = sc.nextLine();
         if(a.charAt(a.length()-1)==b.charAt(0))
        	 str = a+b.substring(1);
         else
        	 str = a+" "+b;
         System.out.println(str);
         String abc = sc.nextLine();
         String ab = abc.substring(0,2);
         StringBuffer sbc = new StringBuffer("");
         for(int i=0;i<abc.length();i++) {
        	 sbc=sbc.append(ab);
         }
         System.out.println(sbc);
	}

}
