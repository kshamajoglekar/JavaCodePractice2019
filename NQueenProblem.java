package practice1;

public class NQueenProblem {
	
	static int [][]result;
	static int n;
//	public static void findNQueen(int n) {
//		result=new int[n][n];
//		NQueenProblem.n=n;
//
//		if(n==1) {
//			result[0][0]=1;
//			printResult();
//			return;
//		}
//
//		
//		int col=0;
//		for(int row=0;row<n;row++) {
//			int[][]attackingMat=markAttackingPos(row,col,new int[n][n]);
//			recurse(row,col+1,attackingMat);
//		}
//		
//		printResult();
//	}
//	
//	public static void recurse(int row,int col,int[][]attMat){
//		int[][]matR;
//		for(int rowLoc=0;rowLoc<n;rowLoc++) {
//			//if not attacking
//			if(attMat[rowLoc][col]==0) {
//				//if last col
//				if(col==n-1) {
//					result[rowLoc][col]=1;
//				}else {
//					//
//					matR=markAttackingPos(rowLoc, col, attMat);
//					recurse(rowLoc, col+1, matR);
//				}
//			}	
//		}
//	}

	
	
	public static void findNQueen(int n) {
		result=new int[n][n];
		NQueenProblem.n=n;

		if(n==1) {
			result[0][0]=1;
			printResult();
			return;
		}

		
		int col=0;
		for(int row=0;row<n;row++) {
			int[][]attackingMat=markAttackingPos(row,col,new int[n][n]);
			recurse(row,col+1,attackingMat);
		}
		
		printResult();
	}
	
	public static void recurse(int row,int col,int[][]attMat){
		
		if(mat[row][col]==0) {
		mat[row][col]=1;
		for(int ,)
			recurse()
		}
		
	}

	public static int[][] markAttackingPos(int row, int col,final int[][]mat){
		
		int[][] matR=new int[mat.length][mat.length];
		//logic
		matR[row][col]=1;
		
		for(int i=0;i<n;i++) {
			for(int j=col+1;j<n;j++) {
				//vertical
				if(i==row) matR[i][j] =1;
				//horizontal
				if(j==col) matR[i][j] =1;
				//diagonal --- hold for now
				//if(i==j) matR[i][j] =1;			
			}
		}
		
		return matR;
	}
	
	public static void printResult(){
		for(int i=0;i<n;i++) {
			System.out.print("\n");
			for(int j=0;j<n;j++) {
				System.out.print(" "+result[i][j]+" ");	
			}
		}
	}
	public static void main(String[] args) {

		System.out.println("hello world");
	
		
		findNQueen(2);
//		System.out.println(findNQueen(2));
//		System.out.println(findNQueen(3));
//		System.out.println(findNQueen(4));
		
		
	}

}
