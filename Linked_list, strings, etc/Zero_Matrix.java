//import java.util.ArrayList;
//import java.util.Arrays;
public class Zero_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zero_Matrix Zero_Matrix1 = new Zero_Matrix();
		Zero_Matrix1.setzeros();
	}

	void setzeros() {
		int[][] mat = {
				{1, 2, 3},
				{4, 5, 0}
				};
		int[][] mat1 = new int[mat.length][mat[0].length];
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
//				System.out.println("original matrix:" + mat[i][j]);
//				System.out.println("Copied matrix:" + mat1[i][j]);
				mat1[i][j] = mat[i][j];
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 0) {
					System.out.println("Found Element:" + mat[i][j]);
					count++;
					int k = i;
					int p = j;
					System.out.println("Row Index of Element:" + k);
					System.out.println("Column Index of Element:" + p);
//					System.out.println("Matrix Row Length:" + mat.length);
//					System.out.println("Matrix Col Length:" + mat[0].length);
					for (int t = 0; t < mat1[0].length; t++) {
						mat1[k][t] = 0;
					}
					for (int t = 0; t < mat1.length; t++) {
						mat1[t][p] = 0;
					}
				}
			}
		}
		System.out.println("Count:" + count);
		System.out.println("Reduced Matrix:");
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[0].length; j++) {
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
