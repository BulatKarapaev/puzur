import javax.print.DocFlavor;

public class BubbleSort {

    public static void main(String[] params) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        PrintArray(array);
        bubbleSort(array);
      //  System.out.println();
       // System.out.println(arrayToString(array));
        PrintArray(array);
    }

    public static void bubbleSort(int[] array1) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array1.length; i++) {
                System.out.print(array1[i]+", ");
                if (array1[i - 1] > array1[i]) {
                    int tmp = array1[i];
                    array1[i] = array1[i - 1];
                    array1[i - 1] = tmp;
                    isSorted = false;

                }

            }
       System.out.println();
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static void PrintArray(int array[]){
        System.out.println("//////////////////////");
        System.out.print("[");
        for (int num = 0; num <array.length ; num++) {
            System.out.print(array[num]);
            if (num != array.length -1){
                System.out.print(", ");

            }

        }
        System.out.println("]");
        System.out.println("//////////////////////");

    }



    }


