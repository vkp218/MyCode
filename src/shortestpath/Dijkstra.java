package shortestpath;

public class Dijkstra {
     public static void main(String args[]) {
		int graph[][]=new int[][] {
			{0,1,5,0,0,0},
			{0,0,2,2,1,0},
			{0,0,0,0,2,0},
			{0,0,0,0,3,1},
			{0,0,0,0,0,2},
			{0,0,0,0,0,0}};
	    int visited[]=new int[6];
	    int min=999,nextnode=0;
	    int pred[]=new int[6];
	    int distance[]=new int[6];
	    System.out.println("The minimum edge length from source to the destination");
	    
	    for(int i=0;i<6;i++)
	    {
	    	visited[i]=0;
	    	pred[i]=0;
	    	for(int j=0;j<6;j++)
	    	{
	    		if(graph[i][j]==0)
	    		{
	    			graph[i][j]=999;
	    		}
	    	}		
	    }
	    distance=graph[0];
	    visited[0]=1;
	    distance[0]=0;
	    
	    for(int counter=0;counter<6;counter++)
	    {
	    	min=999;
	    	for(int i=0;i<6;i++)
	    	{
	    		if(min>distance[i]&&visited[i]!=1)
	    		{
	    			min=distance[i];
	    			nextnode=i;
	    			
	    		}
	    	}
	    	visited[nextnode]=1;
	    	for(int i=0;i<6;i++)
	    	{
	    		if(min+graph[nextnode][i]<distance[i])
	    		{
	    			distance[i]=min+graph[nextnode][i];
	    		
	    		}
	    	}
	    }
        
     for(int i=0;i<6;i++)
     {
    	 System.out.println(i+"th vertex distance from source node==" +distance[i]);
    	
    	 }
     }
}
