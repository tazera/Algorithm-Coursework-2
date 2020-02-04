import java.util.ArrayList;
import java.util.List;

/**
 * @Purpose: The CorrectnessTest class is used to validate the correctness of
 *           the implemented algorithms. You can add additional methods if you
 *           need
 * 
 * @author RYK
 * @since 30/10/2019 extended by @author b7077493
 */

public class CorrectnessTest {
	public static void main(String[] args) {
		
		System.out.println("*********************************************");
		System.out.println("*********** Correctness testing *************");
		System.out.println("*********************************************");
		System.out.println("*********************************************");

		Algorithms algo = new Algorithms();		
	/*	List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Shape(50, 50));
		shapes.add(new Shape(50, 50));
		shapes.add(new Shape(50, 50));
		shapes.add(new Shape(50, 50));
		shapes.add(new Shape(50, 50));
		shapes.add(new Shape(50, 50));
		shapes.add(new Shape(50, 50));
		
		 algo.print(algo.firstFit(shapes));*/
		 
	      for(int i = 1 ;i <= 8;i++) {
	    	  algo.print(algo.firstFit(firstFitTest(i)));
	      }
	      System.out.println("=======================================================================================");
	      System.out.println("                                                                                       ");
	      System.out.println("=======================================================================================");
	      
	      for(int i = 1;i <= 8 ;i++) {
	    	 algo.print(algo.nextFit(nextFitTest(i)));
	    	  
	    	  
	      }
	
	 // algo.nextFit(shapes);
 
		  
		
		/*
		 * Here you will need to validate that your algorithms (nextFit() and
		 * firstFit()) behave as expected on small data sets. 
		 * Think about normal cases and border cases. 
		 * You can use any additional method you created in this class
		 */
	}

	public static List<Shape> firstFitTest(int num) {
		Algorithms algo = new Algorithms();		
		List<Shape> shapes = new ArrayList<Shape>();
		// normal case
		if (num == 1) {
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(30, 20));
			shapes.add(new Shape(40, 40));
			shapes.add(new Shape(40, 25));
			shapes.add(new Shape(50, 50));
			// creating new sheet
		} else if (num == 2) {
			shapes.add(new Shape(299, 249));
			shapes.add(new Shape(299, 249));
			shapes.add(new Shape(299, 249));
			// if all shapes will be on one shelf
		} else if (num == 3) {
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(20, 20));
			// check if shapes will be placed in a shelf after rotated and if there is
			// enought space
		} else if (num == 4) {
			shapes.add(new Shape(30, 30));
			shapes.add(new Shape(30, 40));
			// test if shape will be placed on a new shelf
		} else if (num == 5) {
			shapes.add(new Shape(40, 40));
			shapes.add(new Shape(41, 41));
			// total height of all shelves in a sheet does not exceed h
		} else if (num == 6) {
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			// check if number of shapes placed in a sheet does not 20 shapes per sheet
		} else if (num == 7) {
			for (int i = 0; i < 25; i++) {
				shapes.add(new Shape(1, 1));
			}
		} else if (num == 8) {
			shapes.add(new Shape(2, 2));
			shapes.add(new Shape(2, 2));
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(2, 2));
			shapes.add(new Shape(2, 2));
		}
        
		return shapes;

	}
	public static List<Shape> nextFitTest(int num) {
		List<Shape> shapes = new ArrayList<Shape>();
		// normal case
		if (num == 1) {
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(30, 20));
			shapes.add(new Shape(40, 40));
			shapes.add(new Shape(40, 25));
			shapes.add(new Shape(50, 50));
			// creating new sheet
		} else if (num == 2) {
			shapes.add(new Shape(299, 249));
			shapes.add(new Shape(299, 249));
			shapes.add(new Shape(299, 249));
			// if all shapes will be on one shelf
		} else if (num == 3) {
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(20, 20));
			// check if shapes will be placed in a shelf after rotated and if there is
			// enought space
		} else if (num == 4) {
			shapes.add(new Shape(30, 30));
			shapes.add(new Shape(30, 40));
			// test if shape will be placed on a new shelf
		} else if (num == 5) {
			shapes.add(new Shape(40, 40));
			shapes.add(new Shape(41, 41));
			// total height of all shelves in a sheet does not exceed h
		} else if (num == 6) {
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			shapes.add(new Shape(50, 50));
			// check if number of shapes placed in a sheet does not 20 shapes per sheet
		} else if (num == 7) {
			for (int i = 0; i < 25; i++) {
				shapes.add(new Shape(1, 1));
			}
		} else if (num == 8) {
			shapes.add(new Shape(2, 2));
			shapes.add(new Shape(2, 2));
			shapes.add(new Shape(20, 20));
			shapes.add(new Shape(2, 2));
			shapes.add(new Shape(2, 2));
		}
		

		return shapes;

	}

}
