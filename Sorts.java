// Peanut Butter and Nutella - Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha
// APCS pd6
// Lab04 -- Sort Algorithms
// 2022-01-06
// time spent: 0.6 hrs

import java.util.ArrayList;

public class Sorts
{
  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubble( ArrayList<Comparable> data )
  {
    int totalPasses = 0;
    int totalComparisons = 0;
    int totalSwaps = 0;

    // outside for loop allowing for maximum traversal in ascending order
    // (a value at index 0 can move all the way to the largest index in the dataset)
    for (int pass = 0; pass < data.size() - 1; pass++){

      // from the last index, sorts until reaching index i in descending order
      // (because after pass 0, the value at index 0 will be correct.
      // it becomes pointless to search for a potential sort at that index again.)
      for (int n = data.size() - 1; n > pass; n--){
        totalComparisons += 1;

        // if the value at index n is less than the value at index n-1, swap
        if ((data.get(n)).compareTo(data.get(n-1)) < 0){
          Comparable temp = data.get(n);
          data.set(n, data.get(n-1));
          data.set(n-1, temp);
          totalSwaps += 1;
        }
      }
      totalPasses += 1;
    }

    System.out.println("total number of passes: \t" + totalPasses);
    System.out.println("total number of comparisons: \t" + totalComparisons);
    System.out.println("total number of swaps: \t\t" + totalSwaps);
  }


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selection( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    int totalPasses = 0;
    int totalComparisons = 0;
    int totalSwaps = 0;

    // iterates until pass is 0
    for(int pass = data.size() - 1; pass > 0; pass--) {
      // System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      maxPos = 0;

      // iterates until i <= pass, because the value at index pass+1 will already
      // have the correct value in it, as a result of the previous iteration of the
      // above for loop.
      for(int i = 0; i <= pass; i++) {

        // if the value at index maxPos < value at index i, update maxPos
        if ((data.get(maxPos)).compareTo(data.get(i)) < 0){
          maxPos = i;
        }
        totalComparisons += 1;

        // System.out.println( "maxPos: " + maxPos );//diag
        // System.out.println( data );//diag

      }

      // swap
      Comparable temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);
      totalSwaps += 1;

      // System.out.println( "after swap: " +  data );//diag
      totalPasses += 1;
    }

    System.out.println("total number of passes: \t" + totalPasses);
    System.out.println("total number of comparisons: \t" + totalComparisons);
    System.out.println("total number of swaps: \t\t" + totalSwaps);
  }//end selection



  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertion( ArrayList<Comparable> data )
  {
    int totalPasses = 0;
    int totalComparisons = 0;
    int totalSwaps = 0;

    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region

      // System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      // System.out.println( data );

      //traverse sorted region from right to left
      for(int i = partition; i > 0; i--) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items

        // if index i < index i-1, swap
        if ((data.get(i)).compareTo(data.get(i-1)) < 0) {
          totalComparisons += 1;

          // System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

          // swap
          Comparable temp = data.get(i);
          data.set(i, data.get(i-1));
          data.set(i-1, temp);
          totalSwaps += 1;

        }
        else{
          totalComparisons += 1;
          break;
        }
      }
      totalPasses += 1;
    }

    System.out.println("total number of passes: \t" + totalPasses);
    System.out.println("total number of comparisons: \t" + totalComparisons);
    System.out.println("total number of swaps: \t\t" + totalSwaps);
  }//end insertion


}
