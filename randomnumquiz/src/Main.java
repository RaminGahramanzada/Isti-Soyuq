import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber= randomGenerate(100,0);
        System.out.println("Find number this number will be between 0 to 100");
        int counter=1;
        while (true) {
            System.out.println("write a number");
            int input = scan.nextInt();

            if(input== randomNumber){
                System.out.println(counter+"chanc you find this number "+randomNumber);
                break;
            }else if(input<randomNumber){
                System.out.println("cold");

            }else{
                System.out.println("hot");
            }
           counter++;

        }

    }
    static int randomGenerate(int max,int min){
        return new Random().nextInt(max-min)+min;

    }
}