package a8_1;

import static prog.Picture.*;

public class Bildbearbeitung {

	public static void schwarzweisfilter(String[] args) {

		int[][] p = loadResource("a8_1/Foto.jpg");

		for (int y = 0; y < p.length; y++) {
			for (int x = 0; x < p[0].length; x++) {
				int c = p[y][x];
				int grau = (red(c) + green(c) + blue(c)) / 3;
				p[y][x] = color(grau, grau, grau);
			}
		}
		show(p);
	}

	public static void aufhellung(int k) {

		int[][] p = loadResource("a8_1/Foto.jpg");

		for (int y = 0; y < p.length; y++) {
			for (int x = 0; x < p[0].length; x++) {
				int c = p[y][x];
				p[y][x] = color(k * red(c) , k* green(c) , k* blue(c));
			}
		}
		show(p);
	}
	
	public static void aufmischung(int c1) {

		int[][] p = loadResource("a8_1/Foto.jpg");
		

		for (int y = 0; y < p.length; y++) {
			for (int x = 0; x < p[0].length; x++) {
				int c = p[y][x];
				double k = 0.7;
				double rotmischung = (k * red(c))+ ((1-k) * red(c1));
				double grünmischung = (k * green(c))+ ((1-k) * green(c1));
				double blaumischung = (k * blue(c))+ ((1-k) * blue(c1));
				p[y][x] = color(rotmischung, grünmischung, blaumischung);
			}
		}
		show(p);
	}
	
	public static void sepiafilter() {
	    int[][] p = loadResource("a8_1/Foto.jpg");

	    for (int y = 0; y < p.length; y++) {
	        for (int x = 0; x < p[0].length; x++) {
	        	 int c = p[y][x];

	            double helligkeit = (red(c) + green(c) + blue(c)) / 3;
	            double normalizedBrightness = helligkeit / 255.0 * 2;
	            p[y][x] = color(normalizedBrightness * 158, normalizedBrightness * 91, normalizedBrightness * 64);
	        }
	    }
	    show(p);
	}
	
	public static void übergangsfilter() {
	    int[][] p = loadResource("a8_1/Foto.jpg");

	    for (int y = 0; y < p.length; y++) {
	        for (int x = 0; x < p[0].length; x++) {
	        	 int c = p[y][x];
	        	 int d = p[y][x];
	        	 
	        	 double l = p.length;
	        	 double k = y/p.length;

	            double helligkeit = (red(c) + green(c) + blue(c)) / 3;
	            p[y][x] = color(k * helligkeit + red(d), k * helligkeit + green(d) , k  * helligkeit + blue(d));
	        }
	    }
	    show(p);
	}
}
