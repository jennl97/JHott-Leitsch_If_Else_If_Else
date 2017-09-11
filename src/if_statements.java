import java.util.Scanner;

public class if_statements {
    public static void main(String[] args) {



    double currentTemp;

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your current temperature?");

    currentTemp = scanner.nextDouble();

    if (currentTemp < 97.5 ) {
        System.out.println("You are cold! Bundle up!");
    } else if (currentTemp >= 97.5 && currentTemp <= 99.5){
        System.out.println("You are just right!");
    } else {
        System.out.println("Yea, you are hot!");
    }
}
}