package verticesInTheGivenGraph;

public class ShortestPaths {
	public static final int LEN = 8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 8, 0 },{ 4, 8, 0, 0, 0, 0, 11, 0 },{ 0, 8, 0, 7, 4, 0, 0, 2 },{ 0,7, 0, 9, 14, 0, 0, 0 },{ 0, 0, 9, 0, 10, 0, 0, 0 },{ 0, 0, 14, 10, 0, 2, 0, 0 },{ 0, 0, 0, 0, 2, 0, 1, 6 },{ 8, 11, 0, 0, 0, 1, 0, 7 },{ 0, 2, 0, 0, 0, 6, 7, 0 } };
		dijkstraAlgo(graph,0);

	}
	
	 public static int minDistance(int dic[], Boolean isShrt[]){
	     
	     int minimun = Integer.MAX_VALUE;
	     int index = -1;

	     for (int i = 0; i < LEN; i++)
	         if (isShrt[i] == false && dic[i] <= minimun) {
	        	 minimun = dic[i];
	             index = i;
	         }

	     return index;
	 }
	 

	 public static void dijkstraAlgo(int graph[][], int k){
	     int dic[] = new int[LEN]; 
	     Boolean isShrt[] = new Boolean[LEN];
	     
	     for (int i = 0; i < LEN; i++) {
	    	 dic[i] = Integer.MAX_VALUE;
	    	 isShrt[i] = false;
	     }
	     dic[k] = 0;
	     for (int cnt = 0; cnt < LEN - 1; cnt++) {
	         int l = minDistance(dic, isShrt);
	         isShrt[l] = true;

	         for (int j = 0; j < LEN; j++) {
	        	 boolean cond1= graph[l][j] != 0;
	        	 boolean cond2= !isShrt[j];
	        	 boolean cond3= dic[l] + graph[l][j] < dic[j];
	        	 boolean cond4= dic[l] != Integer.MAX_VALUE;
	        	 
	        	 if (cond1&&cond2&&cond3&&cond4) {
	        		 dic[j] = dic[l] + graph[l][j];
	        	 }
	         }

	     }

	     System.out.println("\s\s\s\s\s Vertex \t Distance from Source");
	     for (int i = 0; i < LEN; i++) {
	    	 System.out.println("\t"+i + " \t\t" + dic[i]);
	     }
	 }


}
