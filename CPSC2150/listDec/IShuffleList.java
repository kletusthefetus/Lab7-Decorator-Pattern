/**
 * Team Names:
 * Christina Foley
 * Sofia Gray
 * James Maner
 * Kenny Nguyen
 */

import package CPSC2150.listDec

import java.util.Random;

/**
 * The interface IShuffleList contains a list of elements to contain data.
 * The interface defines default methods to swap two elements
 * and to shuffle around the elements a certain number of times.
 * @defines myList = a list of elements containing data
 * @constraints
 * @Initialization_ensures A list is created with the ability to populate it with elements.
 *
 */
public interface IShuffleList extends List
{
    /**
     * Method to swap a determined number of elements with eachother
     * @param swaps - the number of swaps to be done
     * @pre swaps > 0
     * @post
     */
    default void shuffle(int swaps)
    {
        Random ranGen = new Random();

    }

    /**
     * A method used to swap the positions of two elements within the list
     * @param i - the index of an element being swapped
     * @param j - the index of the other element to swap with
     * @pre 0 <= i < [size of list] AND 0 <= j < [size of list]
     * @post
     */
    default void swap(int i, int j)
    {

    }


}