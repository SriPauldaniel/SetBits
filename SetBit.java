import java.util.Scanner;
public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 0;
        num = num | (1<<n);
        num = num | (1<<m);
        System.out.println(num);
        sc.close();
    }
}