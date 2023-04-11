package SortingAlgorithmsAndImpl;

public class SelectionSort {
    public static void main(String[] args) {
        int [] intArray = { 20, 35, -15, 7, 55, 1, -22};

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swapIndex(int [] array, int a, int b){

        if (a==b){
            return;
        }

        int temp = array[a];
        array[a] = array[b];
        array[a] = temp;
    }


}
