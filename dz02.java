package lesson02;

import java.util.Arrays;

public class dz02 {
    public static void main (String[] args){

        //проверка 1ого задания
        int[] zeroOne = {0, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrTest(zeroOne)));

        //проверка 2ого задания
        int[] step = new int[8];
        arrStep(step);
        System.out.println(Arrays.toString(step));

        //проверка 3его задания
        int[] sixMin = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrMod(sixMin);
        System.out.println(Arrays.toString(sixMin));

        //проверка 4ого задания
        int[] maxMinArr = {112, 3, 25, 158, 41, 845, 2, 26, 13};
        System.out.println(minNumArr(maxMinArr));
        System.out.println(maxNumArr(maxMinArr));

        //проверка 5ого задания
        squsareArr(9);

        //проверка 6ого задания
        int [] halfArr = {2,4,5,6,7,10};
        System.out.println(halfSum(halfArr));

        //проверка 7-8ого задания
        int [] shift = {1,2,3,4,5,6};
        arrShift(shift, -4);
        System.out.println(Arrays.toString(shift));
    }

    //1ое задание
    public static int[] arrTest (int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                arr[i] = 1;
            }else arr[i] = 0;
        }
        return arr;
    }

    //2ое задание
    public static void arrStep (int[] arr){
        for(int i = 0; i < 8; i++){
            arr[i] = 1 + i * 3;
        }
    }

    //3е задание
    public static void arrMod (int[] arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
    }

    //4ое задание
    public static int minNumArr(int [] arr){
        int min = arr[0];
        for(int i  = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxNumArr(int [] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //5ое задание
    public static void squsareArr (int size){
        int[][] arrArr = new int[size][size];
        for (int i = 0; i < arrArr.length; i++ ){
            for (int y = 0, x = arrArr.length; y < arrArr.length; y++, x--){
                if (i == y || i == (x - 1)){
                    arrArr[i][y] = 1;
                }
                System.out.print(arrArr[i][y] + " ");
            }
            System.out.print("\r\n");
        }
    }

    //6ое задание
    public static boolean halfSum(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int leftSum = 0;
            int rigthSum = 0;
            for(int j = 0; j < i; j++){
                leftSum += arr[j];
            }
            for(int j = i; j < arr.length; j++){
                rigthSum += arr[j];
            }
            if (leftSum == rigthSum)
                return true;
        }
        return false;
    }

    //7-8ое задание
    public static void arrShift (int [] arr, int n){
        if(n > 0){
            for(int i = 0; i < n;i++){
                int temp = arr[arr.length - 1];
                if(arr.length - 1 > 0){
                    System.arraycopy(arr, 0, arr, 1, arr.length -1 );
                }
                arr[0] = temp;
            }
        }
        if(n < 0){
            for (int i = 0; i > n; i--){
                int temp = arr[0];
                System.arraycopy(arr, 1, arr, 0, arr.length -1);
                arr[arr.length - 1] = temp;
            }
        }
    }
}
