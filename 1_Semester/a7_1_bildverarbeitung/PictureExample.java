package a7_1_bildverarbeitung;
import static prog.Picture.*;

public class PictureExample {
	public static void rechteck(String args[]) {
		int[][] p = loadResource("a7_1_bildverarbeitung/MyPicture.jpg");
		for (int i= 30; i < 250; i++)
			for(int j= 70; j < 160; j++)
				p[i][j] = 0;
		show(p);
	}
	public static void spiegeln(String args[]) {
		int[][] p = loadResource("a7_1_bildverarbeitung/MyPicture.jpg");
		int height = p.length;
	    int width = p[0].length; 
	    
	    for (int i = 0; i < height / 2; i++) {
	        for (int j = 0; j < width; j++) {
	            
	            int a = p[i][j];
	            p[i][j] = p[height - i - 1][j];
	            p[height - i - 1][j] = a;
	        }
	    }
	    show(p);
	}
	
	public static void kreis(String args[]) {
		int[][] p = loadResource("a7_1_bildverarbeitung/MyPicture.jpg");
		int height = p.length;
	    int width = p[0].length;
	    
	    int PositionX = 150;
	    int PositionY = 150;
	    int Radius = 100;
	    int Radiuskreis = Radius * Radius;
	    
	    for (int i = 0; i < height; i++) {
	        for (int j = 0; j < width; j++) {

	        	double distance = (i - PositionY) * (i - PositionY) + (j - PositionX) * (j - PositionX);
		        	if(distance <= Radiuskreis) {
		        		p[i][j] = 0;
	        	}    
	        }
	    }
	    show(p);
	}
	
	public static void kreisspiegeln(String args[]) {
		int[][] p = loadResource("a7_1_bildverarbeitung/MyPicture.jpg");
		int height = p.length;
	    int width = p[0].length; 
	    
	    int PositionX = 150;
	    int PositionY = 150;
	    int Radius = 100;
	    int Radiuskreis = Radius * Radius;
	    
	    for (int i = 0; i < height; i++) {
	        for (int j = 0; j < 150; j++) {
	        	
	            double distance = (i - PositionY) * (i - PositionY) + (j - PositionX) * (j - PositionX);
	            if (distance < Radiuskreis) {
	            	
	            	int a = p[i][j];
	            	p[i][j] = p[i][2* PositionY - j - 1];
		            p[i][2* PositionY - j - 1] = a;
	            }
	        }
	    }
	    
	    show(p);
	}
	
	public static void verschieben(String args[]) {
	    int[][] p = loadResource("a7_1_bildverarbeitung/MyPicture.jpg");
	    int height = p.length;
	    int width = p[0].length;

	    int shift = 180;

	    int[][] temp = new int[shift][width];

	    for (int i = 0; i < shift; i++) {
	        for (int j = 0; j < width; j++) {
	            temp[i][j] = p[height - shift + i][j];
	        }
	    }

	    for (int i = height - 1; i >= shift; i--) {
	        for (int j = 0; j < width; j++) {
	            p[i][j] = p[i - shift][j];
	        }
	    }

	    for (int i = 0; i < shift; i++) {
	        for (int j = 0; j < width; j++) {
	            p[i][j] = temp[i][j];
	        }
	    }
	    show(p);
	}



}