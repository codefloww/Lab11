package ua.edu.ucu.apps.images;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProxyImage realImage = new ProxyImage("image.jpg");
        System.out.println("To show the image, answer true or false (t/f):");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("false") || answer.equalsIgnoreCase("f")) {
            realImage.display();
        } else {
            System.out.println("You are not allowed to see the image");
        }
    }
}

