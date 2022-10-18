package assignment_2;

import java.util.Scanner;

public class ChangeCalculator {

    public static void main(String[] args) {

        //user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in Georgian Tetri: ");

        int amount = input.nextInt();

        int[] coins = minSplit(amount);

        //printing array of coins
        System.out.print("Your amount " + amount + " tetri consists of: ");
        if (coins[0] != 0) {
            System.out.print("(" + coins[0] + " x 50 tetri) , ");
        }
        if (coins[1] != 0) {
            System.out.print("(" + coins[1] + " x 20 tetri) , ");
        }
        if (coins[2] != 0) {
            System.out.print("(" + coins[2] + " x 10 tetri) , ");
        }
        if (coins[3] != 0) {
            System.out.print("(" + coins[3] + " x 5 tetri) , ");
        }
        if (coins[4] != 0) {
            System.out.print("(" + coins[4] + " x 1 tetri)");
        }
    }

    //method calculates minimum amount of coins
    static int[] minSplit(int amount) {
        int money = amount;
        int[] ans = new int[5];

        int numberOf_50s = money / 50;
        ans[0] = numberOf_50s;
        money %= 50;

        int numberOf_20s = money / 20;
        ans[1] = numberOf_20s;
        money %= 20;

        int numberOf_10s = money / 10;
        ans[2] = numberOf_10s;
        money %= 10;

        int numberOf_5s = money / 5;
        ans[3] = numberOf_5s;
        money %= 5;

        int numberOf_1s = money;
        ans[4] = numberOf_1s;

        return ans;
    }
}
