package super150_A;

public class pascal_triangle {
	public static void main(String args[]) {
		int n=7;
		int star=1;
		int row=0;
		while(row<n) {
			int i=0;
			int val=1;
			while(i<star) {
				System.out.print(val+" ");
				val=((row-i)*val)/(i+1);
				i++;
			}
			row++;
			star++;
			System.out.println();
		}
	}
}
