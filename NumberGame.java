import java.util.*;
class NumberGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        //r=random num
        boolean playagain=true;
        while(playagain){
            int num=r.nextInt(100)+1;
            //num=number need to guess
            int attempt=0;
            int maxattempt=10;
            boolean g=false;
            //g=guessedcorrectly
            System.out.println("Guess the number between 1 and 100.You have "+maxattempt+" attempts.");
            while(attempt<maxattempt && !g){
                System.out.print("Enter your guess: ");
                int userguess=sc.nextInt();
                attempt++;
                if(userguess<num){
                    System.out.println("Too low ! Try again.");
                }
                else if(userguess>num){
                    System.out.println("Too high ! Try again.");
                }
                else{
                    System.out.println("Congrats! You guessed the number in "+attempt+" attempt.");
                    g=true;
                }
            }
            if(!g){
                System.out.println("Sorry, you have user all your attempts. The number was: "+num);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String userResponse=sc.next();
            playagain=userResponse.equalsIgnoreCase("yes");
        }
        System.out.println("Thank you for playing !");
    }
}