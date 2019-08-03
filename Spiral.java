//program to create N x N Spiral order matrix.
import java.util.*;
public class Spiral {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int Arr[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++)
				Arr[i][j] = 0;
		}
		int spiral_row = 0, spiral_col = 0, constant_row = n, constant_col = (n - 2);
		int spiral = 0;
		spiral = (n / 2);
		int ele = 0;
		while(spiral_col < spiral && spiral_row < spiral) {
		int row_loop = 0, col_loop = 0;
		int toprow_col = 0, rightcol_row = 0, bottomrow_col = 0, leftcol_row = 0;
		//top row
		for(toprow_col = spiral_col; row_loop < constant_row; toprow_col++) {
			ele++;
			row_loop++;
			//System.out.println(toprow_col+", "+row_loop+", "+constant_row);
			Arr[spiral_row][toprow_col] = ele;
			//System.out.println(toprow_col+", "+row_loop+", "+constant_row);
		}
		row_loop = 0;
		//right col
		for(rightcol_row = spiral_row + 1; col_loop < constant_col; rightcol_row++) {
			ele++;
			col_loop++;
			//System.out.println(toprow_col+", "+col_loop+", "+constant_col);
			Arr[rightcol_row][toprow_col - 1] = ele;
			//System.out.println(toprow_col+", "+col_loop+", "+constant_col);
		}
		col_loop = 0;
		//bottom row
		for(bottomrow_col = rightcol_row; row_loop < constant_row; bottomrow_col--) {
			ele++;
			row_loop++;
			//System.out.println(bottomrow_col+", "+row_loop+", "+constant_row);
			Arr[toprow_col - 1][bottomrow_col] = ele;
		} 
		//left col
		for(leftcol_row = rightcol_row - 1; col_loop < constant_col; leftcol_row--) {
			ele++;
			col_loop++;
			//System.out.println(leftcol_row+", "+col_loop+", "+constant_col+", "+ele);
			Arr[leftcol_row][spiral_row] = ele;
		}
		
		spiral_row++;
		spiral_col++;
		constant_row -= 2;
		constant_col -= 2;
		

		}
		if((n % 2) != 0) {
			ele++;
			Arr[(n / 2)][(n / 2)] = ele;
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++)
				System.out.print(Arr[i][j] + " ");
			System.out.println();
		}
	}
}
