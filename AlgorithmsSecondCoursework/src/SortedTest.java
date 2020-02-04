import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Purpose: The SortedTest class is used to compare the implemented algorithms
 *           in term of the number of sheets used WHEN the list of
 *           shapes is SORTED
 *	
 *           You can add additional methods if you need to in this class
 * 
 * @author RYK
 * @since 30/10/2019
 * extended by @author  b7077493
 */

public class SortedTest {
	public static void main(String[] args) {
		System.out.println("*********************************************");
		System.out.println("**************** Sorted Test ****************");
		System.out.println("*********************************************");
		System.out.println();

		Algorithms algo = new Algorithms();
		Generator gen = new Generator();
		
		
		List<Shape> shapes = gen.generateShapeList(10000);
		List<Sheet> sheets = algo.nextFit(shapes);
		
		
		List<Shape> checkNFsortedIncreasing = new ArrayList<>(shapes);
		List<Shape> checkNFsortedDecreasing = new ArrayList<>(shapes);
		quickSort(checkNFsortedIncreasing,0,checkNFsortedIncreasing.size() - 1);
		quickSortDecrease(checkNFsortedDecreasing,0,checkNFsortedDecreasing.size() - 1);
	    List<Sheet> usedSheetsforIncreasing = algo.nextFit(checkNFsortedIncreasing);
	    List<Sheet> usedSheetsforDecreacing = algo.nextFit(checkNFsortedDecreasing);
				 
		
		
		List<Sheet> sheets2 = algo.firstFit(shapes);
		
		List<Shape> checkFFsortedIncreasing = new ArrayList<>(shapes);
		List<Shape> checkFFsortedDecreasing = new ArrayList<>(shapes);
		quickSort(checkFFsortedIncreasing,0,checkFFsortedIncreasing.size() - 1);
		quickSortDecrease(checkFFsortedDecreasing,0,checkFFsortedDecreasing.size() - 1);
	    List<Sheet> usedSheetsforIncreasingFF = algo.firstFit(checkFFsortedIncreasing);
	    List<Sheet> usedSheetsforDecreacingFF = algo.firstFit(checkFFsortedDecreasing);
		
		
		
		
		
		System.out.println("Unsorted rusults for nextFit:" + sheets.size() + " " +"Unsorted results for firstFit:" + sheets2.size());		 
		System.out.println("Sorted in increasing order for nextFit:" + usedSheetsforIncreasing.size() + " " + "Sorted in increasing order for firstFit:" + usedSheetsforIncreasingFF.size());	
		System.out.println("Sorted in decreasing order for nextFit:" + usedSheetsforDecreacing.size() + " " + "Sorted in decreasing order for firstFit:" + usedSheetsforDecreacingFF.size());	

	
		
		
		
		
		
		/*
		 * Generate a random shape list and then check the number of sheets used
		 * when
		 ** this shape list is passed un-sorted
		 ** the list is sorted based on different criteria as set in the speciication document.
		 * 
		 * run several tests for different sizes of the "list of shapes" 
		 */

		/*
		 * HINT: you might want to implements the comparTo method in the Shape
		 * class or implement the Comparator Interface to do the sorting
		 */

		 			

	}
	
	public static void quickSortDecrease(List<Shape> shapes, int L, int R) {

		if (R > L) {
			int p = partition2(shapes, L, R);
			quickSortDecrease(shapes, L, p - 1);
			quickSortDecrease(shapes, p + 1, R);

		}

	}
	/** Partition method Increase **/
	public static int partition2(List<Shape> A, int L, int R) {
		int p = A.get(R).getHeight();
		int i = L - 1;
		for (int j = L; j < R; j++) {
			if (A.get(j).getHeight() >= p) {
				i++;
				Collections.swap(A, i, j);
			}
		}
		
		Collections.swap(A, i + 1, R);
		return i + 1;
	}

	
	
	
	

	/** Quick sort method Increase **/
	public static void quickSort(List<Shape> shapes, int L, int R) {

		if (R > L) {
			int p = partition(shapes, L, R);
			quickSort(shapes, L, p - 1);
			quickSort(shapes, p + 1, R);

		}

	}
	/** Partition method Increase **/
	public static int partition(List<Shape> A, int L, int R) {
		int p = A.get(R).getHeight();
		int i = L - 1;
		for (int j = L; j < R; j++) {
			if (A.get(j).getHeight() <= p) {
				i++;
				Collections.swap(A, i, j);
			}
		}
		
		Collections.swap(A, i + 1, R);
		return i + 1;
	}

}
