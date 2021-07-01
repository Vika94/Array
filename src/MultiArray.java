import java.util.Random;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        // 1)Почитать сумму четных элементов стоящих на главной диагонали.
        /*System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        int[][] mas = new int[n][n];
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = random.nextInt(50);
            }
        }
        for (int[] numb : mas) {
            for (int i : numb) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i][i] % 2 == 0) {
                sum += mas[i][i];
            }
        }
        System.out.println(sum);

         */


        //2)Вывести нечетные элементы находящиеся под главной
        //диагональю(включительно).
       /* System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        int[][] mas = new int[n][n];
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = random.nextInt(50);
            }
        }
        for (int[] numb : mas) {
            for (int i : numb) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (mas[i][j] % 2 == 1) {
                    System.out.print(mas[i][j] + " ");
                }
            }
        }

        */


        //3)Проверить произведение элементов какой диагонали больше
       /* System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        int[][] mas = new int[n][n];
        int multiply1 = 1;
        int multiply2 = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = random.nextInt(50);
            }
        }
        for (int[] numb : mas) {
            for (int i : numb) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            multiply1 = multiply1 * mas[i][i];
        }
        System.out.println("Произведение элементов главной диагонали = " + multiply1);
        for (int i = 0; i < mas.length; i++) {
            for (int j = mas.length - 1 - i; j >= 0; j--) {
                multiply2 *= mas[i][j];
                break;
            }
        }
        System.out.println("Произведение элементов побочной диагонали = " + multiply2);
        if (multiply1 > multiply2)
            System.out.println("Произведение элементов главной диагонали больше побочной");
        else if (multiply1 < multiply2)
            System.out.println("Произведение элементов главной диагонали меньше побочной");
        else if (multiply1 == multiply2)
            System.out.println("Произведение элементов главной диагонали = побочной");

        */
        //4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
        //включительно)
       /* System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        int[][] mas = new int[n][n];
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = random.nextInt(50);
            }
        }
        for (int[] numb : mas) {
            for (int i : numb) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mas.length-1; i++) {
            for (int j = 0; j < mas.length-1-i; j++) {
                if (mas[i][j]%2==0){
                    sum+=mas[i][j];
                }
            }

        }
        System.out.println(sum);

        */
        //5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
        //строкой и т. д.)
        /*System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        int[][] mas = new int[n][n];
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = random.nextInt(50);
            }
        }
        for (int[] numb : mas) {
            for (int i : numb) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = temp;
            }
        }
        for (int[] numb : mas) {
            for (int i : numb) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

         */
    }
}










