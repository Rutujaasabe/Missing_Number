import java.util.Scanner;

public class missingNumber {
    public static void main(String rt[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 = sum1 + i;
        }
        int missNumber = sum1 - sum;
        System.out.println(missNumber);

    }
}
