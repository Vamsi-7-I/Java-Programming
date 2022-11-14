public class Maxwealth {
    // https://leetcode.com/problems/richest-customer-wealth/
    // You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer
    // has in the jth bank. Return the wealth that the richest customer has.
    // A customer's wealth is the amount of money they have in all their bank accounts.
    // The richest customer is the customer that has the maximum wealth.

    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {4,5,6}
        };
        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
    }
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int row = 0;row < accounts.length;row++){
            int sum = 0;
            for(int col = 0;col < accounts[row].length;col++){
                sum += accounts[row][col];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
