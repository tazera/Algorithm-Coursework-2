/**
 * @Purpose: The Sheet class represents a sheet with a list of shelves.
 * DO NOT MODIFY THE EXISTING METHODS SIGNITURE, You may add additional methods if you wish
 * 
 * @author  RYK 
 * @since   30/10/2019
 * extended by @author 
 */
import java.util.ArrayList;
import java.util.List;

public class Sheet {

	public static final int SHEET_HEIGHT = 250; // sheet height

	public static final int SHEET_WIDTH = 300; // sheet width

	public static final int SHAPE_LIMIT = 20; // maximum number of shapes that can be placed in each sheet (rule F)

	private List<Shelf> shelves = new ArrayList<Shelf>(); // list of shelves

	/**
	 * empty constructor
	 */
	public Sheet() {
	}

	/**
	 * This method is used to add a shelf to a sheet
	 * @param a shelf
	 */
	public void addShelf(Shelf shelf) {
		shelves.add(shelf);
	}

	/**
	 * @return height of all shelves in a sheet
	 */
	public int allShelvesHeight() {

		int total = 0;

		for (Shelf shelf : this.shelves) {

			// has a shelf with at least 1 shape
			if (!shelf.getShapes().isEmpty()) {

				// add all shelf height to total
				total += shelf.getHeight();
			}
		}
		return total;
	}

	/**
	 * @return list of all shelves in a sheet
	 */
	public List<Shelf> getShelves() {
		return this.shelves;
	}

	/**
	 * @return height
	 */
	public int getHeight() {
		return SHEET_HEIGHT;
	}

	/**
	 * @return width
	 */
	public int getWidth() {
		return SHEET_WIDTH ;
	}
	
	//get the remaining height of the sheet
	/*public int getSheetRemainingHeigth(Sheet sheet) {
	      int remaining = Sheet.SHEET_HEIGHT;
		for (Shelf shelf: sheet.getShelves()) {
			remaining -= shelf.getHeight();
		}

		return remaining;
	}*/
	
	// get the last used sheet yet to be tested !
	public Sheet getLastSheet(List<Sheet> sheets) {
		//return sheets.get(sheets.size() - 1);
		Sheet sheet = new Sheet();
		for(int i = 0;i < sheets.size();i++) {
			sheet = sheets.get(i);
		}
		return sheet;
	}
	public void createNewShelf() {
		Shelf newShelf = new Shelf();
		shelves.add(newShelf);
	}
	
	public void printShelf() {
		for(Shelf shelf: shelves) {
			shelf.toString();
		}
	}
	public int sheetCountShapes(Sheet sheet) {
		int count = 0;
		for(int i = 0;i < sheet.getShelves().size();i++) {
			count += sheet.getShelves().get(i).getShapes().size();
		}
		return count;
	}

	
	
	@Override
	public String toString(){
		
		for(int i = 0; i < shelves.size();i++) {
                System.out.println(shelves.get(i) + " ");}
		return "The Width of the sheet is:"  +SHEET_WIDTH+ " " + "The Height of the sheet is:" + SHEET_HEIGHT ;
	}
	
	
	

}
