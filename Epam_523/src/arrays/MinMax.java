package arrays;
import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter size of the array: ");
          int n = sc.nextInt();
          System.out.println("Enter elements ");
          int[] a = new int[n];
          for(int i=0;i<n;i++) {
        	  a[i]=sc.nextInt();
          }
          int min = Integer.MAX_VALUE;
          int max = Integer.MIN_VALUE;
          for(int i=0;i<n;i++) {
        	  if(a[i]<min)
        		  min = a[i];
        	  if(a[i]>max)
        		  max = a[i];
          }
          System.out.println(min+" "+max);
        
          sc.close();
	}

}
