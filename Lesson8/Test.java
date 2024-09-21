package Lesson8;


public class Test {
    public static void main(String[] args) {
        Test l = new Test();
        System.out.println(l.fac(5));
        System.out.println(l.facR(5));
        System.out.println(l.fib(6));

    }

    public int fac(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public int facR (int n) {
        if (n ==0 || n ==1 ) {
            return 1;
        }
        return n * fac(n-1);
    }


    // 1 1 2 3 5 8 13
    public int fib(int n) {
        if (n == 1 || n ==2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
