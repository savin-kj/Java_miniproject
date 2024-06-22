import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Mini project : Number Guesser !

        int mynumber = (int) (Math.random()*100); // Actual Number
        Scanner sc= new Scanner(System.in);    // User Input
        int usernumber;

        do {
            System.out.print("Guess The Number : ");
            usernumber=sc.nextInt();

            // Condition Checker

            if(usernumber==mynumber){
                System.out.println("Hoorayy! You found the Number :)");
                break;              // If Guessed right, exit.
            }
            else if(usernumber > mynumber){
                System.out.println("Your Number is too Large");
            }
            else {
                System.out.println("Your Number is too Small");
            }

        }while (usernumber >= 0);  // Do loop works till user input is +ve .

        System.out.print("The Number was : ");
        System.out.println(mynumber);

    }
}
