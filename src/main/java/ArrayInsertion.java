public class ArrayInsertion{
    static int size = 0;
    public static int [] insert(int [] array, int numbertoinsert, int indextoinsertat)
    {
        //check if array is full or not.
        if(size>=array.length)
        {
            System.out.println("Array Full!");
            return array;
        }

        //shift elements towards right from indextoinsertat.
        for(int i=size+1; i>indextoinsertat; i--){
            array[i] = array[i-1];
        }

        //insert the given element.
        array[indextoinsertat]=numbertoinsert;

        // increase the size of the array.
        size++;

        //display array
        System.out.println("After Inserting " + numbertoinsert + " at index " + indextoinsertat + ": ");
        display(array);
        return array;
    }

    //function to display the array.
    public static void display(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}