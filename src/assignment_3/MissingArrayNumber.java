package assignment_3;

public class MissingArrayNumber {
    public static void main(String[] args) {

        //sample array
        int[] array = {1, -3, 4, -9, 3, 4, 70, -10, 0, 7, 2};

        System.out.println(notContains(array));


    }

    //this method finds the missing number which is greater than 0 from a given array.
    static int notContains(int[] array) {
        int n = array.length;

        for (int i = 0; i < array.length; i++) {
            int num1 = array[i];
            array[i] = 0;

            while (num1 >= 1 && num1 <= n && num1 != array[num1 - 1]) {
                int num2 = array[num1 - 1];
                array[num1 - 1] = num1;
                num1 = num2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i + 1;
            }

        }
        return n + 1;
    }
}

