import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Enter some text");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            System.out.println(str);
            System.out.println("_________________________________________");
        }
    }
}