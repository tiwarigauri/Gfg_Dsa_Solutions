import java.util.Scanner;

class sumOfNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}