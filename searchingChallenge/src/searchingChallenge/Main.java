package searchingChallenge;
import java.util.Scanner;
public class Main {
	public static String SearchingChallenge(String[] strArr) {
		int var=0;
		char[][] matrix=new char[strArr.length][strArr[0].length()];
		for(int i=0;i<strArr.length;i++) {
			matrix[i]=strArr[i].toCharArray();
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]=='0') {
					var++;
					dfs(matrix,i,j);
				}
			}
		}
		return String.valueOf(var);
	}
	public static void dfs(char[][] matrix, int i, int j) {
		if(i<0 || i>=matrix.length||j<0 || j>=matrix[0].length||matrix[i][j]=='1') {
			return;
		}
		matrix[i][j]='1';
		dfs(matrix,i+1,j);
		dfs(matrix,i-1,j);
		dfs(matrix,i,j+1);
		dfs(matrix,i,j-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(SearchingChallenge(new String[]{"01111","01101","00011","11110"}));

	}

}