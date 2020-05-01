
public class Main {
	public static void main(String[] args) {
	    
	    int[][] x = new int[2][3];
	    int n = x.length;
	    for (int i=1; i<=n; i++) {
	        int counts = 0;
	        for (int j=1; j<=n; j++) {
	            if(x[i][j]==0);
	            counts++;
	        }
	        if (counts == n){
	            System.out.println("\n First all-zero row is " + i);
                break;
	        }
	    }
	}
}
