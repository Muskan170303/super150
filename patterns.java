package super150_A;

public class patterns {
	public static void main(String args[]) {
		int n=5;
		int star=n;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
		}
	}

}
