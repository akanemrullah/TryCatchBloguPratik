import java.util.Scanner;

public class Main {

    static int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {

        int pointer;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen bir deger gir: ");

        pointer = input.nextInt();

        checkError(pointer);

    }

    public static void checkError (int a) throws ArrayIndexOutOfBoundsException {


        try {
            System.out.println(list[a]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Hatali giris");
        }

    }


}