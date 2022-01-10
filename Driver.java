// Peanut Butter and Nutella - Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha
// APCS pd6
// Lab04 -- Sort Algorithms
// 2022-01-06
// time spent: 0.6 hrs

import java.util.ArrayList;

public class Driver
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public static void main( String[] args ){
    System.out.println("Testing Bubble Sort:");

    ArrayList nafiz_avg = new ArrayList<Integer>();
    nafiz_avg = populate(20, 1, 100);
    System.out.println("Average case (" + nafiz_avg.size() + " elements): ");
    System.out.println(nafiz_avg);
    Sorts.bubble(nafiz_avg);
    System.out.println("Sorted nafiz_avg:");
    System.out.println(nafiz_avg);

    System.out.println(); //===============================

    ArrayList nafiz_best = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++){ nafiz_best.add(i * 2); }
    System.out.println("Best case (" + nafiz_best.size() + " elements): ");
    System.out.println(nafiz_best);
    Sorts.bubble(nafiz_best);
    System.out.println("Sorted nafiz_best:");
    System.out.println(nafiz_best);

    System.out.println(); //===============================
    
    ArrayList nafiz_best_ee = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++){ nafiz_best_ee.add(i * 2); }
    System.out.println("Best case (" + nafiz_best_ee.size() + " elements): ");
    System.out.println(nafiz_best_ee);
    Sorts.bubble_ee(nafiz_best_ee);
    System.out.println("Sorted nafiz_best_ee:");
    System.out.println(nafiz_best_ee);

    System.out.println(); //===============================

    ArrayList nafiz_worst = new ArrayList();
    for (int i = 20; i > 0; i--){ nafiz_worst.add(i * 2); }
    System.out.println("Worst case (" + nafiz_worst.size() + " elements): ");
    System.out.println(nafiz_worst);
    Sorts.bubble(nafiz_worst);
    System.out.println("Sorted nafiz_worst:");
    System.out.println(nafiz_worst);

    System.out.println(); //===============================

    System.out.println("Testing Selection Sort:");

    ArrayList prattay_avg = new ArrayList<Integer>();
    prattay_avg = populate(20, 1, 100);
    System.out.println("Average case (" + prattay_avg.size() + " elements): ");
    System.out.println(prattay_avg);
    Sorts.selection(prattay_avg);
    System.out.println("Sorted prattay_avg:");
    System.out.println(prattay_avg);

    System.out.println(); //===============================

    ArrayList prattay_presorted = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++){ prattay_presorted.add(i * 2); }
    System.out.println("Pre-sorted case (" + prattay_presorted.size() + " elements): ");
    System.out.println(prattay_presorted);
    Sorts.selection(prattay_presorted);
    System.out.println("Sorted prattay_presorted:");
    System.out.println(prattay_presorted);

    System.out.println(); //===============================

    ArrayList prattay_descending = new ArrayList();
    for (int i = 20; i > 0; i--){ prattay_descending.add(i * 2); }
    System.out.println("Descending-ordered case (" + prattay_descending.size() + " elements): ");
    System.out.println(prattay_descending);
    Sorts.selection(prattay_descending);
    System.out.println("Sorted prattay_descending:");
    System.out.println(prattay_descending);

    System.out.println(); //===============================

    System.out.println("Testing Insertion Sort:");

    ArrayList brian_avg = new ArrayList<Integer>();
    brian_avg = populate(20, 1, 100);
    System.out.println("Average case (" + brian_avg.size() + " elements): ");
    System.out.println(brian_avg);
    Sorts.insertion(brian_avg);
    System.out.println("Sorted brian_avg:");
    System.out.println(brian_avg);

    System.out.println(); //===============================

    ArrayList brian_best = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++){ brian_best.add(i * 2); }
    System.out.println("Best case (" + brian_best.size() + " elements): ");
    System.out.println(brian_best);
    Sorts.insertion(brian_best);
    System.out.println("Sorted brian_best:");
    System.out.println(brian_best);

    System.out.println(); //===============================

    ArrayList brian_worst = new ArrayList();
    for (int i = 20; i > 0; i--){ brian_worst.add(i * 2); }
    System.out.println("Worst case (" + brian_worst.size() + " elements): ");
    System.out.println(brian_worst);
    Sorts.insertion(brian_worst);
    System.out.println("Sorted brian_worst:");
    System.out.println(brian_worst);
  }

}
