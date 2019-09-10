package FibonacciRecursively;

public class Test {
    public static void main(String[] args) {
        int n = 2;
        climbStairs(n);
    }

    public static int climbStairs(int n) {
        int data = fio(n+1);
        System.out.println(data);
        return data;
    }

    public static int fio(int n) {
        if (n < -1) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int data = 0;
        int temp = 1;
        int temp1 = 1;
        for (int i = 2; i < n; i++) {
                data = temp + temp1;
                temp1 = temp;
                temp = data;

        }
        return data;
    }
}
