package a9_1;

import static prog.Picture.*;
import prog.Picture;

public class Film {
	
	public static void clear(int[][] p) {
		for (int x = 0; x< p.length; x++)
		for (int y = 0; y<p[0].length; y++)
		p[x][y] = color(255,255,255);
	}
	
	public static void kreis(int[][]p, Picture picture, double radius) {
		
		int PositionX = 180;
	    int PositionY = 90;
	    double Radiuskreis = radius * radius;
	    for (int j = 0; j < 300; j++) {
	        for (int i = 0; i < 300; i++) {

	        	double distance = (j - PositionY) * (j - PositionY) + (i - PositionX) * (i - PositionX);
		        	if(distance <= Radiuskreis) {
		        		 p[i][j] = color(255,0,0);
		        		
	        	}    
	        }
	    }
	}
	
	public static void viereck(int[][]p, Picture picture, int position) {
	    
	    for (int j = 50; j < 80; j++) {
	        for (int i = 70; i < position; i++) {
	        	
	        	p[i - 30][j] = color(255,255,255);
		        p[i][j] = color(60,60,60);
		     
	        }
	    }
	}
	
	public static void main(String[] args) throws   
    
		InterruptedException {
		int [][] p = new int [300][200];
		clear(p);
		double radius = 0;
		int position = 100;
		Picture picture = createPicture(p);	
		for(int i = 0; i <= 150; i++) {
			sleep(50);
			clear(p);
			position++;
			viereck(p, picture, position);
			radius = 10 +i/5.0;
				kreis(p, picture, radius);
			picture.update(p);
		}
		System.out.println("fertig");
	}
	
	
	
}
