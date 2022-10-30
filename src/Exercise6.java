import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        int[] storage;
        storage = new int[10];


        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write ten numbers");

        storage[0] = inputValue.nextInt();
        storage[1] = inputValue.nextInt();
        storage[2] = inputValue.nextInt();
        storage[3] = inputValue.nextInt();
        storage[4] = inputValue.nextInt();
        storage[5] = inputValue.nextInt();
        storage[6] = inputValue.nextInt();
        storage[7] = inputValue.nextInt();
        storage[8] = inputValue.nextInt();
        storage[9] = inputValue.nextInt();

        System.out.println("Mostrar numeros");

        for (int i =9; i >=1; i--) {
            System.out.println(storage[i]);
        }




    }
}