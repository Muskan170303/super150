package super150_A;

public class patt3 {
	public static void main(String args[]) {
		int n=5;
		int star=1;
		int row=1;
		int sp=n-1;
		while(row<=n) {
			int i=1;
			while(i<=sp) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
		}
		row++;
		sp--;
		star++;
		System.out.println();
		}
	}

}