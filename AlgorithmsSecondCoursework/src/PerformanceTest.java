import java.util.ArrayList;
import java.util.List;

/**
 * @Purpose: The PerformanceTest class is used to compare the implemented
 *           algorithms in term of time and the number of sheets used
 *
 *           You can add additional methods if you need to in this class
 * 
 * @author RYK
 * @since 30/10/2019
 * extended by @author
 */

public class PerformanceTest {
	
	
 
	

	public static void main(String[] args) {
		
		Algorithms algo = new Algorithms();
		Generator gen = new Generator();
		System.out.println("***********************************************");
		System.out.println("*********** Performance analysis **************");
		System.out.println("***********************************************");
		System.out.println("***********************************************");
	 
		
				int noOfTests = 5;

				// number of repetitions for each test - you need to CHANGE this value
				int noOfRep = 1;

				// number of shapes needed for the first run - you need to CHANGE this
				// value
				int noOfShapes = 100000;

				// the increment in the number of shapes - you need to CHANGE this value
				int increment = 100000;
				
				//StringBuilder stringBuilder = new StringBuilder(); 
				

				int placedSheets2 = 0;
				int placedSheets = 0;
				long duration = 0;
				long duration2 = 0;
				long seconds = 1_000_000_000;
				
		for (int i = 1; i <= noOfTests; i++) {
			placedSheets = 0;
			placedSheets2 = 0;
			for (int b = 1; b <= noOfRep; b++) {

				List<Shape> shapes = gen.generateShapeList(noOfShapes);

				long startTime = System.nanoTime();

				List<Sheet> sheets = algo.nextFit(shapes);

				long endTime = System.nanoTime();
				
				duration = (endTime - startTime);
				placedSheets += sheets.size();
			
				
				 long startTime2 = System.nanoTime(); 
				 
				 List<Sheet> sheets2 = algo.firstFit(shapes); 
				 
				 long endTime2 = System.nanoTime(); 
				 
				 duration2 =(endTime2 - startTime2);
				 placedSheets2 += sheets2.size();
				 
				 
			}
			double back =(double) duration / seconds;
			System.out.println("Number of used sheets for firstFit for test "+i+" is " + placedSheets2/noOfRep +" for" +" "+ noOfShapes + " "+ "shapes");
			
			System.out.println("The time for firstFit in seconds is :" + (double)duration2 / seconds);
			System.out.println(
					"\nNumber of used sheets for nextFit: for test  "+i+" is "+ placedSheets/noOfRep + " " + "for" + " " + noOfShapes + " " + "shapes");
			System.out.println("The time for nextFit for test "+i+" in seconds is :" + back+"\n");
			noOfShapes = noOfShapes + increment;
		
		}		

		/**
		 * Remember: You need to calculate the time and number of sheets used
		 * for each run of each algorithm.
		 * 
		 * You are expected to run several tests (e.g. noOfTests=5) of your
		 * programs for, 10000, 20000, 30000, 40000, 50000 shapes
		 * (noOfShapes=10000, increment=10000) so that one can see how the
		 * algorithms perform for large datasets.
		 * 
		 * You are expected to run the same test a number of times to ensure
		 * accurate result (noOfRep=4). In this case, you need to calculate the
		 * average time and sheets needed for each run
		 **/

	
	}
}
