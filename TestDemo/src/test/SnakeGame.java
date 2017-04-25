package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Simple snake position trace program
 */


public class SnakeGame {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			br.ready();
			String line = br.readLine();
			
			// No. of cases
			int T = Integer.parseInt(line);
			
			for(int i = 0; i < T; i++) {
				line = br.readLine();
				String input[] = line.split(" ");
				
				// Grid Values
				int N = Integer.parseInt(input[0]); 
				int M = Integer.parseInt(input[1]);
				
				// Initial Position
				int x = Integer.parseInt(input[2]);
				int y = Integer.parseInt(input[3]);
				
				if (x > N || y > N) {
					throw new Exception("Wrong initial values given."
							+ " Either correct the grid size or change the initial position of Snake");
				}
				// Length
				int Len = Integer.parseInt(input[4]);
				
				// The given directions/positions
				String seq = br.readLine();
				
				// Setting up the grid
				int plane[][] = new int[N][M];
				
				// Setting up the tail position
				x = x-1;
				y = y-1;
				
				plane[x][y] = 1;
				
				boolean collideWithBody = false;
				int countMoves = 0;
				int j = 0;
				
				if (Len-1 != seq.length()) {
					throw new Exception("Wrong length and corresponding direction values given;"
							+ " Original Length: "+Len+"; Current Length by Direction: "+(seq.length()+1));
				}
				
				
				// Mapping the previous directions/positions of the snake
				for(j = 0; j < Len-1; j++) {
					switch(seq.charAt(j)) {
					case 'U':
						plane[x][y+1] = 1;
						y++;
						break;
					case 'R':
						plane[x+1][y] = 1;
						x++;
						break;
					case 'D':
						plane[x][y-1] = 1;
						y--;
						break;
					case 'L':
						plane[x-1][y] = 1;
						x--;
						break;
					}
				}
				
				// Checking for next each directions/positions where snake can move
				switch(seq.charAt(j-1)) {
				case 'U':
					for(int k = y+1; k < M; k++, countMoves++) {
						if(plane[x][k] == 1) {
							collideWithBody = true;
							break;
						}
					}
					break;
				case 'R':
					for(int k = x+1; k < N; k++, countMoves++) {
						if(plane[k][y] == 1){
							collideWithBody = true;
							break;
						}
					}
					break;
				case 'D':
					for(int k = y-1; k >=0; k--, countMoves++) {
						if(plane[x][k] == 1){
							collideWithBody = true;
							break;
						}
					}
					break;
				case 'L':
					for(int k = x-1; k >=0; k--, countMoves++) {
						if(plane[k][y] == 1){
							collideWithBody = true;
							break;
						}
					}
					break;
				}
				
				
				// Getting the moves and colliding state
				if(collideWithBody) {
					System.out.println("\n BODY "+(countMoves));
				}
				else {
					System.out.println("\n WALL "+(countMoves));
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
