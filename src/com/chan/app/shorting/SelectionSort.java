/**
 * 
 */
package com.chan.app.shorting;

import java.util.Arrays;

/**
 * @author chandra.sharma
 *
 */
public class SelectionSort {

	/**
	 * 
	 */
	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
		public static void main(String[] args) {
	        // This is unsorted array
	        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
	 
	        // Let's sort using selection sort
	        selectionSort(array, 0, array.length);
	 
	        // Verify sorted array
	        System.out.println(Arrays.toString(array));

	}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public static void selectionSort(Object[] array, int fromIndex, int toIndex) 
    {
        Object d;
        for (int currentIndex = fromIndex; currentIndex < toIndex; currentIndex++) 
        {
            int indexToMove = currentIndex;
            for (int tempIndexInLoop = currentIndex + 1; tempIndexInLoop < toIndex; tempIndexInLoop++) 
            {
                if (((Comparable) array[indexToMove]).compareTo(array[tempIndexInLoop]) > 0) 
                {
                    //Swapping
                    indexToMove = tempIndexInLoop;
                }
            }
            d = array[currentIndex];
            array[currentIndex] = array[indexToMove];
            array[indexToMove] = d;
        }
    }

}
