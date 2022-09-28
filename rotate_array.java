package super150_A;

public class rotate_array {

	public static void main(String[] args) {
		int[]arr= {1,3,1,3,2,4,422,-99};
		int a=2;
		int b=6;
		reverse_algo(arr,a,b);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"	");
		}
		
	}
	public 
	public static void reverse(int arr[],int i,int j) {
		int n=arr.length;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
