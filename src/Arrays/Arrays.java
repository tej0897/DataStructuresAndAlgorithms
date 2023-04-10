package Arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 1;
        intArray[1] = 33;
        intArray[2] = 3;
        intArray[3] = -4;
        intArray[4] = 90;
        intArray[5] = 121;
        intArray[6] = 56;

        // to print the elements of the array
        for (int i : intArray){
            System.out.println(i);
        }

        // to find the -4 in the array
        int index = -1;
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == -4){
                index = i;
                break;
            }
        }
        System.out.println("Index of -4 is: " +index);

        // delete 121 from array
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == 121){
                intArray[i] = 0;
            }
        }

        System.out.println("Post deletion: ");
        for (int i : intArray){
            System.out.println(i);
        }
    }
}
