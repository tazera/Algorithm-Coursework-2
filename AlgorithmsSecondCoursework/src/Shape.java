/**
 * @Purpose: The shape class represents a single shape. DO NOT MODIFY THE
 *           SIGNITURE OF EXISTING METHODS, You may add additional methods if
 *           you wish
 * 
 * @author RYK
 * @since 30/10/2019 
 * extended by @author  b7077493
 * 
 **/

public class Shape implements Comparable<Shape> {

	private int sWidth;   // width of the shape
	private int sHeight;  // height of the shape

	/**
	 * A Shape constructor to set the width and height of a shape. 
	 * @param width of a shape
	 * @param height of a shape
	 **/
	public Shape(int width, int height) {

		// Shape width and height should not be greater than the sheet width and height
		if (width > Sheet.SHEET_WIDTH || height > Sheet.SHEET_HEIGHT) {
			throw new IllegalArgumentException("Shape width or height is not valid");
		}

		this.sWidth = width;
		this.sHeight = height;
	}
	
	


	
	/**
	 * @return height of a shape
	 **/
	public int getHeight() {
		return sHeight;
	}

	/**
	 * @return width of a shape
	 */
	public int getWidth() {
		return sWidth;
	}

	
	// Override comperaTo have to be checked not sure if it work
	
	public void setsWidth(int sWidth) {
		this.sWidth = sWidth;
	}




	public void setsHeight(int sHeight) {
		this.sHeight = sHeight;
	}




	@Override
	public int compareTo(Shape o) {				
		  if (o.getHeight() > sHeight) {;
		  return 1;
		}else if(o.getHeight() == sHeight) {
	          return 0;
		}else {
			return -1;
		}
	}
	
	@Override
	public String toString(){
		return "\nThe Width of the shape is:" + sWidth + " "+ "The Heigth of the shape is:" + sHeight;
	}
	
	public void rotate() {
		int temp = sWidth;
		sWidth = sHeight;
		sHeight = temp;
	}
	
	
	
}
