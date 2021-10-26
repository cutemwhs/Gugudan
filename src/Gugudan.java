import java.util.Scanner;

public class Gugudan{
	
	public static void main(String[] args) {
		int[][] result = new int[8][9];
		int i,j;
		for(i=0; i<result.length; i++) {
			for(j=0; j<result[i].length; j++) {
				result[i][j] = (i+2)*(j+1);
			}
		}
		
		for(i=0; i<result.length; i++) {
			for(j=0; j<result[i].length; j++) {
				System.out.println(result[i][j]);
			}
			
		}
	}
}

