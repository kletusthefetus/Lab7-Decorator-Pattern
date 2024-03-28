/**
 * Team Names:
 * Christina Foley
 * Sofia Gray
 * James Maner
 * Kenny Nguyen
 */

package cpsc2150.listDec;

import java.util.Random;
import java.util.List;

/**
 * The interface IShuffleList contains a list of elements to contain data.
 * The interface defines default methods to swap two elements
 * and to shuffle around the elements a certain number of times.
 *
 * @defines self = a list of elements containing data
 *
 * @constraints |self| >= 0
 *
 * @Initialization_ensures A list is created with the ability to populate it with elements.
 *
 */
public interface IShuffleList<T> extends List<T> {
    /**
     * Method to swap a determined number of elements with eachother
     *
     * @param swaps - the number of swaps to be done
     *
     * @pre swaps > 0
     *
     * @post |self| = |self| AND self = [all the same elements in the list but at different places within the list]
     */
    public default void shuffle(int swaps) {
        Random rand = new Random();
        int randPos1, randPos2;
        for (int i = 0; i < swaps; i++) {
            randPos1 = rand.nextInt(size());
            randPos2 = rand.nextInt(size());
            T temp = get(randPos1);
            set(randPos1, get(randPos2));
            set(randPos2, temp);
        }
    }

    /**
     * A method used to swap the positions of two elements within the list
     *
     * @param i - the index of an element being swapped
     * @param j - the index of the other element to swap with
     *
     * @pre 0 <= i < [size of list] AND 0 <= j < [size of list]
     *
     * @post |self| = |self|
     * AND self = [all the same elements in the list but the elements at i and j are swapped]
     */
   public default void swap(int i, int j) {
        T temp = get(i);
        set(i, get(j));
        set(j, temp);
    }
}
