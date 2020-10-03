import java.util.Scanner;
import java.util.Vector;

public class Coin_Change {
    private static void min(int v,int arr[]) {

        int len = arr.length;


        Vector<Integer> a = new Vector<>();
        for (int i = len - 1; i >= 0; i--) {
            while (v >= arr[i]) {
                v = v - arr[i];
                a.add(arr[i]);
            }
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(" "+ a.elementAt(i));
        }

    }


    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount for change");
        int a = scanner.nextInt();
        System.out.print("Minimum coin change required:");
        min(a,coins);

    }
}


