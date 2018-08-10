package recursionex;

/**
 * Created by expert on 20/6/18.
 */
public class FactRecursive {

    public static int fact(int n) {
        int f;
        if (n == 1)
            return 1;
        else
            f = n * fact(n - 1);
        return f;
    }

    public static void main(String[] args) {
        int n = 4;
        int f1 = fact(4);
        System.out.println(f1);
    }
}


