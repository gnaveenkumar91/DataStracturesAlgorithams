package com.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS17 {

	public static void main(String args[]) {
           int v=5;
           List<List<Integer>> graph=new ArrayList<>();
           
           for(int i=0;i<v;i++) {
        	   graph.add(new ArrayList<>());
           }
            
           graph.get(0).add(1);
           graph.get(0).add(2);
           graph.get(0).add(3);
           graph.get(1).add(4);
           
           bfs(0,graph);
	}

	private static void bfs(int start, List<List<Integer>> graph) {
		boolean[] visited=new boolean[graph.size()];//false false false false false
		
		Queue<Integer> queue=new LinkedList<Integer>();
		
		visited[start]=true;
		      queue.add(start);
		while(!queue.isEmpty()) {
			int node=queue.poll();
			System.out.println(node + " ");
			
			for(int neghbor:graph.get(node)) {
				if(!visited[neghbor]) {
					visited[neghbor]=true;
					queue.add(neghbor);
				}
			}
		}
		
	}

}
