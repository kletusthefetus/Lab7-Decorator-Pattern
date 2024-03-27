import package CPSC2150.listDec



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