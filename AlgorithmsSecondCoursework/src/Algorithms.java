
/**
 * @Purpose: The Algorithms class contains the two algorithms you have to implement  
 * Do NOT modify the names and signatures of the two algorithm methods
 * 
 * @author  RYK
 * @since   30/10/2019
 * extended by @author  b7077493
 *
 **/

import java.util.ArrayList;
import java.util.List;

public class Algorithms {

	/**
	 * This method is used to implement the next fit algorithm
	 * 
	 * @param shapes:a list of shapes representing customer requests(shapes to be
	 *        cut/placed)
	 * @return a list of the sheets used to fulfil all customer requests (i.e. place
	 *         all the shapes). e.g. if you pass a "shapes" list that has two shapes
	 *         {(w=200,h=200),(w=50,h=100)}, then the returned list of sheets should
	 *         show us all the information needed (e.g. that one sheet is used, this
	 *         sheet has one shelf and this shelf has two shapes in it). In the test
	 *         program, you can use the returned list to retrieve the total number
	 *         of sheets used.
	 **/
	/*
	 * Start with an empty list of sheets (remember each sheet has a width of 300
	 * and a height of 250 as specified in the Sheet class)
	 */
	/**
	 * @param shapes
	 * @return
	 */
	public List<Sheet> nextFit(List<Shape> shapes) {
		List<Sheet> usedSheets = new ArrayList<Sheet>();	
		   Sheet a = new Sheet();
	        Shelf b = new Shelf();
	        usedSheets.add(a);
	         a.addShelf(b);
	         
		
		int count = 0;
		for(int i = count; i < shapes.size() ;i++) {	
			   boolean sorted = false;
			   Shape shape = shapes.get(i);						
				  Sheet sheet = new Sheet();
					   if(sheet.getLastSheet(usedSheets).sheetCountShapes(sheet.getLastSheet(usedSheets)) < sheet.SHAPE_LIMIT) {	
					   Shelf shelf = new Shelf();
					   Shelf lastShelf = shelf.getLastShelf(usedSheets);
						
		      // check if it fits in the sheet and place only if it is the first shape in the sheet else
					   
					   
					   if(sorted == false && lastShelf.getShapes().isEmpty()) {	
						     lastShelf.place(shape);
							 lastShelf.getHeight();
							 sorted = true;
							 count++;
						 }else if(sorted == false && lastShelf.getHeight() >= shape.getHeight() && lastShelf.getShelfRemainingWidth(lastShelf) >= shape.getWidth()) {
							 lastShelf.place(shape);
							 lastShelf.getHeight();			
						    sorted = true;
						    count++;
						  // check if it will fits after it is rotated and place else shelf
						 }else if (sorted == false && lastShelf.getHeight() >= shape.getWidth() && lastShelf.getShelfRemainingWidth(lastShelf) >= shape.getHeight()) {
							shape.rotate();
							lastShelf.place(shape);
							lastShelf.getHeight();		
							sorted = true;
							count++;
							 // check if the shape does not fit in the last shelf and if there is enough space in the sheet for new shelf that can hold the shape else 					
						}
						
						 if (sorted == false && getSheetRemainingHeigth(sheet.getLastSheet(usedSheets)) >= shape.getHeight() && sheet.getLastSheet(usedSheets).getWidth() >= shape.getWidth()) {
							      Shelf newShelf = new Shelf();
							      sheet.getLastSheet(usedSheets).addShelf(newShelf);
							      newShelf.place(shape);
							      newShelf.getHeight();
							      sorted = true;
							      count++;
							 //  // check if the shape does not fit in the last shelf and if check of there is enough space in the sheet if we rotate the shape for a shelf where we can place it
						 } else if (sorted == false  && getSheetRemainingHeigth(sheet.getLastSheet(usedSheets)) >= shape.getWidth() && sheet.getLastSheet(usedSheets).getWidth() >= shape.getHeight()) {
							  Shelf newShelf = new Shelf();
							  sheet.getLastSheet(usedSheets).addShelf(newShelf);
						      shape.rotate();
						      newShelf.place(shape);				     
						      newShelf.getHeight();
						      sorted = true;
						      count++;
						 }else if (sorted == false ){
							 Sheet newSheet = new Sheet();
							 Shelf newShelf = new Shelf();
							 usedSheets.add(newSheet);
							 newSheet.addShelf(newShelf);
							 newShelf.place(shape);
							 newShelf.getHeight();
							 sorted = true;
							 count++;
						 }
						 
			}
			if (sorted == false) {
				Sheet newSheet = new Sheet();
				Shelf newShelf = new Shelf();
				usedSheets.add(newSheet);
				newSheet.addShelf(newShelf);
				newShelf.place(shape);
				newShelf.getHeight();
				sorted = true;
			}
		}

		/*
		 * Add in your own code so that the method will place all the shapes according
		 * to NextFit under ALL the assumptions mentioned in the specification
		 */
		// print(usedSheets);
		return usedSheets;
	}

	/**
	 * This method is used to implement the first fit algorithm
	 * 
	 * @param shapes:a list of shapes representing customer requests (shapes to be
	 *        cut/placed)
	 * @return a list of the sheets used to fulfil all customer requests (i.e. place
	 *         all the shapes). e.g. if you pass a "shapes" list that has two shapes
	 *         {(w=200,h=200),(w=50,h=100)}, then the returned list of sheets should
	 *         show us all the information needed (e.g. that onn e sheet is used,
	 *         this sheet has one shelf and this shelf has two shapes in it). In the
	 *         test program, you can use the returned list to retrieve the total
	 *         number of sheets used
	 **/

	
	

	// mai pomishnite metodi da ne rabotqt ili printa ne go izkarva pravilno 
	public List<Sheet> firstFit(List<Shape> shapes) {
		List<Sheet> usedSheets = new ArrayList<Sheet>();
		   Sheet a = new Sheet();
	        Shelf b = new Shelf();
	        usedSheets.add(a);
	         a.addShelf(b);
	         
	      
			for(int i = 0; i < shapes.size() ;i++) {
				 boolean sorted = false;
				 Shape shape = shapes.get(i);
				for(int j = 0;j < usedSheets.size();j++) {	
					   Sheet sheet = usedSheets.get(j);
					   if(sheet.sheetCountShapes(sheet) < sheet.SHAPE_LIMIT) {	
				for(int k = 0; k < usedSheets.get(j).getShelves().size();k++) {
					   Shelf shelf = usedSheets.get(j).getShelves().get(k);
				//	   Shelf lastShelf = shelf.getLastShelf(usedSheets);
						  
						 
						
					
							
				   
				  
			      // check if it fits in the sheet and place only if it is the first shape in the sheet else
				 if(sorted == false && shelf.getShapes().isEmpty()) {	
					 shelf.place(shape);
					 shelf.getHeight();
					 sorted = true;
					
				 }else if(sorted == false && shelf.getHeight() >= shape.getHeight() && shelf.getShelfRemainingWidth(shelf) >= shape.getWidth()) {
					shelf.place(shape);
					shelf.getHeight();			
				    sorted = true;
				 
				  // check if it will fits after it is rotated and place else shelf
				 }else if (sorted == false && shelf.getHeight() >= shape.getWidth() && shelf.getShelfRemainingWidth(shelf) >= shape.getHeight()) {
					shape.rotate();
					shelf.place(shape);
					shelf.getHeight();		
					sorted = true;
				
					 // check if the shape does not fit in the last shelf and if there is enough space in the sheet for new shelf that can hold the shape else 					
				}
				}
				 if (sorted == false && getSheetRemainingHeigth(sheet) >= shape.getHeight() && sheet.getWidth() >= shape.getWidth()) {
					      Shelf newShelf = new Shelf();
					      sheet.addShelf(newShelf);
					      newShelf.place(shape);
					      newShelf.getHeight();
					      sorted = true;
					     
					 //  // check if the shape does not fit in the last shelf and if check of there is enough space in the sheet if we rotate the shape for a shelf where we can place it
				 } else if (sorted == false  && getSheetRemainingHeigth(sheet) >= shape.getWidth() && sheet.getWidth() >= shape.getHeight()) {
					  Shelf newShelf = new Shelf();
				      sheet.addShelf(newShelf);
				      shape.rotate();
				      newShelf.place(shape);				     
				      newShelf.getHeight();
				      sorted = true;
				      
				 }else if (sorted == false ){
					 Sheet newSheet = new Sheet();
					 Shelf newShelf = new Shelf();
					 usedSheets.add(newSheet);
					 newSheet.addShelf(newShelf);
					 newShelf.place(shape);
					 newShelf.getHeight();
					 sorted = true;
				 }
			   
				   
					}

				

			}

			if (sorted == false) {
				Sheet newSheet = new Sheet();
				Shelf newShelf = new Shelf();
				usedSheets.add(newSheet);
				newSheet.addShelf(newShelf);
				newShelf.place(shape);
				newShelf.getHeight();
				sorted = true;
			}
			}
			
			
		// print(usedSheets);
		return usedSheets;
	}
	
	
	
	
	
	public void print(List<Sheet> usedSheets) {
		for (Sheet sheet : usedSheets) {			
					System.out.println(  sheet + "\n");			
		}
	}
	
	public int getShelfRemainingWidth(Shelf shelf) {
		int remaining = shelf.getWidth();
      
		for(int i = 0 ;i < shelf.getShapes().size();i++) {
			remaining -= shelf.getShapes().get(i).getWidth();
		}
		
		//remaining -= shelf.getWidth();

		return remaining;
	}
	
	public int getSheetRemainingHeigth(Sheet sheet) {
	      int remaining = Sheet.SHEET_HEIGHT;
		for (Shelf shelf: sheet.getShelves()) {
			remaining -= shelf.getHeight();
		}

		return remaining;
	}
	
	/*
	 * Start with an empty list of sheets (remember each sheet has a width of 300
	 * and a height of 250 as specified in the Sheet class)
	 */
	
	
}
