import java.util.Scanner;

public class FindArmstrongNumber {
    static boolean checkEqual(int x, int y){
        if(x==y){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to be checked.");
        int input = sc.nextInt();
        int x = input;

        int sum = 0;
        while(input !=0){
            int r = input%10;
            input = input/10;

            sum +=(int) Math.pow(r,3);

        }
        System.out.println("Result of the number tested is: " + checkEqual(x,sum));

        System.out.printf("Output from the entered number is: " + sum);




    }
}
