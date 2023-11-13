import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;

// Homework 6
public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] arr = {1, 3, 4, 1, 5, 5};
        double average = 0.0;

        for (int i = 0; i < arr.length; ++i) {
            average += (double) arr[i];
        }
        System.out.println("Среднее значение = " + average / arr.length);
        System.out.println("------");

        // Task 2
        int[] ints = {1, 3, 4, 1, 5, 5};

        System.out.print("Дубоикаты = ");
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    System.out.print(ints[i] + (ints[j] == ints.length - 1 ? "" : ", "));
                }
            }
        }
        System.out.println();
        System.out.println("------");

        // Task 3.1
        int[] mas1 = {1, 3, -6, 23, 14, 2};
        int x1 = 23;
        boolean f1 = false;

        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == x1) {
                f1 = true;
            }
        }
        System.out.println(f1);
        System.out.println("------");

        // Task 3.2
        int[] mas2 = {1, 3, -6, 23, 14, 2};
        int x2 = 0;
        boolean f2 = false;

        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] == x2) {
                f2 = true;
            }
        }
        System.out.println(f2);
        System.out.println("------");

        // Task 4.1
        int[] mas3 = {1, 3, -6, 23, 14, 2};
        int x3 = 23;
        int f3 = 0;

        for (int i = 0; i < mas3.length; i++) {
            if (mas3[i] == x3) {
                f3 = i;
            }
        }
        if (f3 == 0) {
            System.out.println("Не найдено");
        } else {
            System.out.println("Индекс = " + f3);
        }
        System.out.println("------");

        // Task 4.2
        int[] mas4 = {1, 3, -6, 23, 14, 2};
        int x4 = 5;
        int f4 = 0;

        for (int i = 0; i < mas4.length; i++) {
            if (mas4[i] == x4) {
                f4 = i;
            }
        }
        if (f4 == 0) {
            System.out.println("Не найдено");
        } else {
            System.out.println("Индекс = " + f4);
        }
        System.out.println("------");

        // Task 5.1
        int[] array1 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3, m = 8;

        System.out.print("[");
        for (int i = n; i <= m; i++) {
            System.out.print(array1[i] + (i == m ? "" : ", "));
        }
        System.out.print("]");
        System.out.println();
        System.out.println("------");

        // Task 5.2
        int[] array2 = {1, 3, -6, 23, 14, 2};
        int n2 = 1, m2 = 3;

        System.out.print("[");
        for (int i = n2; i <= m2; i++) {
            System.out.print(array2[i] + (i == m2 ? "" : ", "));
        }
        System.out.print("]");
        System.out.println();
        System.out.println("------");

        // Task 6
        int[] arrMinMax = {1, 3, -6, 23, 14, 2};
        int max = arrMinMax[0], min = arrMinMax[0];

        for (int i = 0; i < arrMinMax.length; i++) {
            if (arrMinMax[i] > max) {
                max = arrMinMax[i];
            }
            if (arrMinMax[i] < min) {
                min = arrMinMax[i];
            }
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
        System.out.println("------");

        // Task 7
        int[] arrMin = {1, 3, -6, 23, 14, 2};
        int min1 = arrMin[0], min2 = arrMin[0];

        for (int i = 0; i < arrMin.length; i++) {
            if (arrMin[i] < min1) {
                min1 = arrMin[i];
            }
        }
        for (int i = 0; i < arrMin.length; i++) {
            if (arrMin[i] < min2 && arrMin[i] != min1) {
                min2 = arrMin[i];
            }
        }
        System.out.println("Наименьший элемент = " + min1);
        System.out.println("Второй наименьший элемент = " + min2);
        System.out.println("------");

        // Task 8
        int[] mass = {1, 2, 3, 0, 4, 6};

        Arrays.sort(mass);
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i]);
        }
        System.out.println();
        System.out.println("------");

        // Homework 6.2
        // Task 9.1
        int[][] myIntsFrom = {{10, 20, 30}, {40, 50 ,60}};
        int[][] myIntsTo = new int[3][2];

        for (int i =0; i < myIntsFrom.length; i++) {
            for (int j = 0; j < myIntsFrom[1].length; j++) {
                myIntsTo[j][i] = myIntsFrom[i][j];
            }
        }
        for (int i = 0; i < myIntsTo.length; i++ ) {
            for (int j = 0; j < myIntsTo[1].length; j++) {
                System.out.print(myIntsTo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------");

        // Task 9.2
        int[][] myArrayFrom = {{4, 2, 1}, {2, 7, 2}};
        int[][] myArrayTo = new int[3][2];

        for (int i =0; i < myArrayFrom.length; i++) {
            for (int j = 0; j < myArrayFrom[1].length; j++) {
                myArrayTo[j][i] = myArrayFrom[i][j];
            }
        }
        for (int i = 0; i < myArrayTo.length; i++ ) {
            for (int j = 0; j < myArrayTo[1].length; j++) {
                System.out.print(myArrayTo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------");

        // Task 10
        int[][] arrayForSum = {{10, 20, 30}, {40, 50, 60}};
        int sum = 0;

        for (int i = 0; i < arrayForSum.length; i++) {
            for (int j = 0; j < arrayForSum[1].length; j++) {
                sum += arrayForSum[i][j];
            }
        }
        System.out.println(sum);
        System.out.println("------");

        // Task 11.1
        int[][] myArr = {{10, 20, 30}, {40, 50, 60}};
        int rows = myArr.length;
        int columns = myArr[0].length;
        boolean square = rows == columns;

        System.out.println(square);
        System.out.println("------");

        // Task 11.2
        int[][] myMas = {{10, 20}, {40, 50}};
        int r = myMas.length;
        int c = myMas[0].length;
        boolean sq = r == c;

        System.out.println(sq);
        System.out.println("------");

        // Task 12
        int k = 5;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        System.out.println("------");

        // Task 13
        int[][] myArrayMinMax = {{10, 20, 30}, {40, 50, 60}};
        int mn = myArrayMinMax[0][0];
        int mx = myArrayMinMax[0][0];

        for (int i = 0; i < myArrayMinMax.length; i++) {
            for (int j = 0; j < myArrayMinMax[1].length; j++) {
                if (myArrayMinMax[i][j] < mn) {
                    mn = myArrayMinMax[i][j];
                }
                if (myArrayMinMax[i][j] > mx) {
                    mx = myArrayMinMax[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент = " + mx);
        System.out.println("Минимальный элемент = " + mn);
        System.out.println("------");

        // Task add 1
        int[][] massiv = {{50, 80, 10},{20, 90, 30}};
        int search = 30;

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[1].length; j++) {
                if (massiv[i][j] == search) {
                    System.out.println("Координаты элемента (строка и столбец): " + i + " " + j);
                }
            }
        }
        System.out.println("------");

        // Task add 2
        int[][] myArrAverage = {{5, 7, 9, 4}, {8, 1, 3, 2}, {4, 2, 7, 9}};
        double avr = 0.0;

        for (int i = 0; i < myArrAverage.length; i++) {
            avr = 0;
            for (int j = 0; j < myArrAverage[1].length; j++) {
                avr += myArrAverage[i][j];
            }
            System.out.println(avr / myArrAverage[1].length);
        }
        System.out.println("------");

        // Task add 3
        int arrOrig[][] = {{1,2,3,4}, {5,6,7,8}};
        int row = arrOrig.length;
        int column = arrOrig[0].length;
        int[][] arrTranspose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrTranspose[j][i] = arrOrig[i][j];
            }
        }

        for (int i = 0; i < arrTranspose.length; i++) {
            for (int j = 0; j < arrTranspose[1].length; j++) {
                System.out.print(arrTranspose[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("------");

        // Task add 4
        int[][] myArrMinMax = {{56, 34, 78}, {94, 37, 99}};
        int minm = myArrMinMax[0][0];
        int maxm = myArrMinMax[0][0];

        for (int i = 0; i < myArrMinMax.length; i++) {
            for (int j = 0; j < myArrMinMax[1].length; j++) {
                if (myArrMinMax[i][j] < minm) {
                    minm = myArrMinMax[i][j];
                }
                if (myArrMinMax[i][j] > maxm) {
                    maxm = myArrMinMax[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент = " + maxm);
        System.out.println("Минимальный элемент = " + minm);
        System.out.println("------");

        // Task add 5
        /*int[][]  arrSort = {{5, 8, 9}, {4, 1, 3}};

        Arrays.sort(arrSort);
        for (int i = 0; i < arrSort.length; i++) {
            for (int j = 0; j < arrSort.length; j++) {
                System.out.print(Arrays.toString(arrSort));
            }
            System.out.println();
        }*/

        // Task add 6
        int[][] matrix = {{0, 1, 2}, {1, 5, 3}, {2, 3, 4}};
        boolean symmetric = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if(i != j && matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                }
            }
        }
        System.out.println(symmetric);
        System.out.println("------");

        // Task add 7

    }
}