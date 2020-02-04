/**
 * @Purpose: The Shelf class represents a shelf with a list of shapes.
 * DO NOT MODIFY THE EXISTING METHODS, You may add additional methods if you wish
 * 
 * @author  RYK 
 * @since   30/10/2019
 * extended by @author  b7077493
 */

import java.util.ArrayList;
import java.util.List;

public class Shelf {

	// The used width: the width of all the shapes placed in the shelf
	private int usedWidth;

	// Shelf height: Equals to the height of the first shape placed in the shelf
	private int shelfHeight;
	
	//List of shapes stored in the shelf
	List<Shape> shapes = new ArrayList<Shape>();

	/**
	 * empty constructor
	 */
	public Shelf() {

	}

	/**
	 * @return Height of the shelf
	 */
	public int getHeight() {

		if (shapes.size() != 0) {
			// equals to the height of shape placed at the left
			this.shelfHeight = shapes.get(0).getHeight();
			return this.shelfHeight;
		} else
			return 0;
	}
	
// added method 
	public void setShelfHeight(int shelfHeight) {
		this.shelfHeight = shelfHeight;
	}

	/**
	 * This method is used to place a shape on a shelf
	 * @param shape: a shape
	 */
	public void place(Shape shape) {

		// add shape width to the shelf width
		usedWidth += shape.getWidth();
		shapes.add(shape);
	}

	/**
	 * @return list of all shapes placed in the shelf
	 */
	public List<Shape> getShapes() {
		return shapes;
	}

	 
	/**
	 * @return the used width of the shelf
	 */
	public int getWidth() {
		return usedWidth;
	}
	
	// get the remaining width of the shelf
	public int getShelfRemainingWidth(Shelf shelf) {
		int remaining = Sheet.SHEET_WIDTH;
      
		for(int i = 0 ;i < shelf.getShapes().size();i++) {
			remaining -= shelf.getShapes().get(i).getWidth();
		}
		
		//remaining -= shelf.getWidth();

		return remaining;
	}
	public Shelf getLastShelf(List<Sheet> sheets) {
		Shelf shelf = new Shelf();
		Sheet sheet = new Sheet();
	for (int i = 0; i < sheet.getLastSheet(sheets).getShelves().size(); i++) {
			shelf = sheets.get(sheets.size() - 1).getShelves().get(i);
			// return sheets.get(sheets.size() - 1).getShelves().get(sheets.get(sheets.size() - 1).getShelves().size() - 1);
		}
		return shelf;
	}
	
	
	//should get the last used shelf of the last used sheet yet to be tested
	
	
	@Override
	public String toString(){
		
		for(int i = 0;i < shapes.size();i++) {
			System.out.print(shapes.get(i) + " ");
		}
		return "\nThe Width of the shelf is:"  + usedWidth + " "+ "The Heigth of the shelf is:" + shelfHeight;
	}
	

}
