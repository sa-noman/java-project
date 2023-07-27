import java.util.Scanner;

public class SumOfSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range of number:");
        int n = sc.nextInt();

        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum += i;
            i += 2;
        }

        System.out.println("The sum of series = " + sum);

        sc.close();
    }
}
