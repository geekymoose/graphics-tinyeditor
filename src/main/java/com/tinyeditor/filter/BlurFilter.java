package main.java.com.tinyeditor.filter;

import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;


/**
 * Blur filter
 *
 * @since	Mar 9, 2016
 * @author	Constantin MASSON
 */
public class BlurFilter extends ConvolutionFilter{
	/**
	 * Create a new Blur Filter
	 */
	public BlurFilter(){
		int[][] m = {{1,1,1},{1,1,1},{1,1,1}}; //@TODO Allow general rule
		//int[][] m = {{0,0,0},{0,1,0},{0,0,0}}; //@TODO Allow general rule
		this.matrix		= m;
		this.offset		= 0;
		this.divisor	= 9;
	}
}


