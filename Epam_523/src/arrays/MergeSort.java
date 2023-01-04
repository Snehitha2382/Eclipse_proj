package arrays;
import java.util.*;
public class MergeSort {
	public static void mergeSort(int[] a,int l,int mid,int r) {
		int m = mid-l+1;
		int n = r-mid;
		int[] b = new int[m];
		for(int i=0;i<m;i++) {
			b[i]=a[l+i];
		}
		int[] c = new int[n];
		for(int i=0;i<n;i++) {
			c[i]=a[mid+1+i];
		}
		int i=0,j=0;
		int k=l;
		while(i<m && j<n) {
			if(b[i]<=c[j]) {
				a[k]=b[i];
				i++;
			}
			else {
				a[k]=c[j];
				j++;
			}
			k++;
		}
		while(j<n) {
			a[k]=c[j];
			j++;
			k++;
		}
		while(i<m) {
			a[k]=b[i];
			i++;
			k++;
		}
	}
    public static void merge(int[] a,int l,int r) {
    	if(l<r) {
    		int mid = l+(r-l)/2;
    		merge(a,0,mid);
    		merge(a,mid+1,r);
    		mergeSort(a,l,mid,r);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        merge(a,0,n-1);
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
        System.out.println("");
	}

}
