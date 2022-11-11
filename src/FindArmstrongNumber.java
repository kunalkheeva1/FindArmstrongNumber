import java.util.Scanner;

public class FindArmstrongNumber {
    //helping method to check the validity
    static boolean checkEqual(int x, int y){
        if(x==y){
            return true;
        }
        return false;
    }

    //for a number to be armstrong take cube of every single digit in it
    // and then add them, if the resultant is same as the input then the number is an armstrong number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to be checked.");
        int input = sc.nextInt();

        //storing the input in x to compare afterwards
        // as after the while loop calculations input will become 0
        int x = input;

        int sum = 0;

        while(input !=0){
            //r= 125%10 = 5, then input= 125/10 = 12,
            // then r=12%10 =2, input= 12/10=1, 1%10 =1, and input=1/10 = 0
            int r = input%10;
            input = input/10;

            sum +=(int) Math.pow(r,3);

        }
        // used the helping method to compare the results, and print true and false accordingly
        System.out.println("Result of the number tested is: " + checkEqual(x,sum));

        System.out.printf("Output from the entered number is: " + sum);




    }
}
