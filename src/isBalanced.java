public class isBalanced {
    public static int isBalanced(int himal[]) {
        //Initial supposition : the array is balanced
        int balanced = 1;
        for (int i = 0; i < himal.length - 1; ) {
            //If number at odd place is even or number at odd place is even return false
            if (himal[i] % 2 == 0 || himal[i + 1] % 2 != 0) {
                balanced = 0;
                break;
            }
            //Increase size of loop by 2 ,so we can check 3rd and 4th item in second loop after checking
            //1st and second element in  first loop
            i = i + 2;
        }
        //Return the method call
        return balanced;
    }

    public static void main(String[] args) {
        //Defining an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        //Calling the is isBalanced function we defined earlier and passing the array to the method
        int balanced = isBalanced(numbers);
        //printing the value returned from the method
        System.out.println("Is the List balanced?  " + balanced);
    }
}
