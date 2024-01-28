// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        for (int i = 1; i <= 55; i+=2){
            System.out.println(i);
        }
        System.out.println("____________");

        System.out.println("Task2");
        for (int i = 90; i >= 0; i-=5){
            System.out.println(i);
        }
        System.out.println("____________");

        System.out.println("Task3");
        for (int i = 2; i <= 1048576; i*=2){
            System.out.println(i);
        }
        System.out.println("____________");

        System.out.println("Task4");
        for (int i = -29; i <= 10; i++){
            if (i%5 == 0){
                System.out.println(i);
            }
        }
        System.out.println("____________");

        System.out.println("Task5");
        int sum = 0;
        for (int i = 50; i <= 150; i++){
            sum+=i;
                System.out.println(sum);
        }
        System.out.println("____________");

        int[] arr = {34, 21, 47, 4, 15};
        System.out.println("Task6");
        max(arr);

        int[] arr2 = {5,-3,-2,16,55,0};
        System.out.println("Task7");
        max2(arr2);
    }
    public static void max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
        if (max < arr[i]) {
            max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
    public static void max2(int[] arr2){
        int sum = 0;
        for (int i = 0; i < arr2.length; i++){
            if (arr2[i] >= 0) {
                sum += arr2[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}