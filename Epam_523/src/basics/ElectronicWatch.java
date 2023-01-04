package basics;
import java.util.*;
public class ElectronicWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of seconds: ");
        int n = sc.nextInt();
        int h = n/3600;
        n = n-h*3600;
        int min = n/60;
        n = n-min*60;
        System.out.printf("%d:%0,2d:%0,2d",h%24,min,n);
	}

}
