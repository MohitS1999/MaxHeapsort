
import java.util.*;
public class MaxHeapsort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		a[0]=0;
		for(int i=1;i<=n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("INSERTION");
		for(int i=2;i<=n;i++){
			Insert(a,i);
		}
		for(int i=1;i<=n;i++)
			System.out.println(a[i]);
		System.out.println("Deletion");
		for(int i=n;i>=1;i--){
			delete(a,i);
		}
		for(int i=1;i<=n;i++)
			System.out.println(a[i]);
	}
	public static void Insert(int a[],int n){
		int temp;
		int i=n;
		temp=a[n];
		while(i>1&&temp>a[i/2]){
			a[i]=a[i/2];
			i=i/2;
		}
		a[i]=temp;
	}
	public static void delete(int a[],int n){
		int x=a[1];
		a[1]=a[n];
		int i=1;
		int j=2*i;
		while(j<n-1){
			if(a[j+1]>a[j])
				j=j+1;
			if (a[i]<a[j]){
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
				i=j;
				j=2*j;
			}
			else
				break;
		}
		a[n]=x;
		
	}
}