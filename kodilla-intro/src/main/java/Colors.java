import java.util.Scanner;

public class Colors {

    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);                 // [1]
        while (true) {                                            // [2]
            System.out.println("Enter first letter:");                // [3]
            String letter = scanner.nextLine().trim();               // [4]
            if (letter.length() <= 1) {                              // [5]
                return letter;                                        // [6]
            }
            System.out.println("Only one letter allowed");
        }
    }

    public String guessColor (){
        String newLetter = getLetter();
        switch (newLetter){
            case "g":return "green";

            case "y":return "yellow";

            case "b":return "black";

            case "w":return "white";

            default: System.out.println("Unknown color");
        }
    return guessColor();
    }

    public static void main(String[] args) {
        Colors c = new Colors();

        System.out.println(c.guessColor());


    }


}
