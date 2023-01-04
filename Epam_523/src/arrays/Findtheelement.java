package arrays;
import java.util.*;
public class Findtheelement {
    public static int binarySearch(int[] a,int l,int r,int x) {
         if(l<=r) {
        	 int mid = l+(r-l)/2;
        	 if(a[mid]==x)
        		 return mid;
        	 else if(a[mid]>x)
        	     return binarySearch(a,l,mid-1,x);
        	 else
        	     return binarySearch(a,mid+1,r,x);
         }
         return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("Enter the search element: ");
        int x = sc.nextInt();
        int index=binarySearch(a,0,n-1,x);
        if(index==-1)
        	System.out.println("-1");
        else
        	System.out.println(index);
	}

}
