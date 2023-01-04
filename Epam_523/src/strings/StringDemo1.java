package strings;
import java.util.*;
public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         String str1 = "CSE";
         String str2 = "CSE";
         String s1 = new String("CSE");
         String s2 = new String("CSE");
         System.out.println(s1.equals(s2));
         System.out.println(str1.equals(str2));
         System.out.println(s1.equals(str1));
         System.out.println(s1==str1);
         System.out.println(s1==s2);
         System.out.println(str1==str2);
	}

}
