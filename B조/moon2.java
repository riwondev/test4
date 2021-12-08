import java.util.Scanner;

public class moon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        System.out.println("세 정수 입력");
        num = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if (num < num2)
            if (num < num3) {
                System.out.println("최소값은" + num + "임");
            }
        sc.close();

    }
}