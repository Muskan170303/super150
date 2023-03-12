package divide_and_conquer;

public class merge_sort {

	public static void main(String[] args) {
		int arr[]= {7,5,2,4,3};
		int ans[]=mergesort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] mergesort(int arr[],int si,int ei) {
		if(si==ei) {
			int bs[]=new int[1];
			bs[0]=arr[si];
			return bs;
		}
		int mid=(si+ei)/2;
		int fa[]=mergesort(arr,si,mid);
		int sa[]=mergesort(arr,mid+1,ei);
		return merge_array(fa,sa);
	}
	public static int[] merge_array(int arr1[],int arr2[]){
		int n=arr1.length;
		int m=arr2.length;
		int ans[]=new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]){
				ans[k]=arr1[i];
				i++;
				k++;
			}
			else{
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return(ans);
	}
}
