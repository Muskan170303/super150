package super150_2Darray;

public class matrix_rotate {
	public static void main(String[] args) {
		int matrix[][]= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int m=matrix.length;
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<m;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<m/2;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][m-j-1];
				matrix[i][m-j-1]=temp;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}