import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("What's your name?");
        Scanner keyboard = new Scanner(System.in);
        String name=keyboard.nextLine();
        System.out.println("Bonjour "+name+"!");
    }
}
