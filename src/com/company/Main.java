package com.company;

public class Main {

    public static void main(String[] args) {
	/*● Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными
	 числами;

● Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого
отрицательного числа и вывести его на экран (8, -2, -4, 2, 3, 6) = 11/3
ДЗ на сообразительность:
● Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать самый
минимальный элемент и смещать его в начало. При этом каждую новую итерацию начинать сдвигаясь вправо, то есть
первый проход — с первого элемента, второй проход — со второго и т.д.
● И при каждой итерации распечатывать текущее состояние массива {-4, -2, 2, 3, 6, 8}*/
        double[] array = new double[15];
        array[0] = 8;
        array[1] = -2;
        array[2] = -4;
        array[3] = 2;
        array[4] = 3;
        array[5] = 6;

        double sum = 0;
        double average = 0;
        boolean isNegative = false;
        int count = 0;

        System.out.print("Array = { ");
        for (double i : array) {
            System.out.print(i + ", ");
            if (i < 0) {
                isNegative = true;
            } else if (isNegative && i > 1) {
                count++;
                sum = sum + i;
            }

        }
        average = sum / count;
        System.out.println("}");
        System.out.println("Кол-во положительных чисел после первого отрицательного: " + count);
        System.out.println("Сумма массива положительных чисел после первого отрицательного =  " + sum);
        System.out.println("Среднее арифметическое = " + average);





        int[][] elements = new int[][]{
                {-4, -2, 2,},

                {3, 6, 8}
        };
        for (int i = 0; i < elements.length ; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                System.out.println( elements[i][j]);

                System.out.println("_______________");


                

            }

        }




    }
}












