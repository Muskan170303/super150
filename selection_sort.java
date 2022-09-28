package super150_A;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,5,7,1,4,3};
		sort(arr);
	}
	public static void sort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}

}
