import java.util.Scanner;

public class moon3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comNum = (int) (Math.random() * 3);
        System.out.println("0=가위,1=바위,2=보");
        int myNum = sc.nextInt();
        System.out.print("컴퓨터가 ");

        if (comNum == 0) {
            System.out.print("가위");
        } else if (comNum == 1) {
            System.out.print("바위");
        } else if (comNum == 2) {
            System.out.print("보");
        }
        System.out.println("를 냈습니다. ");

        System.out.print("사용자가 ");
        if (myNum == 0) {
            System.out.print("가위");
        } else if (myNum == 1) {
            System.out.print("바위");
        } else if (myNum == 2) {
            System.out.print("보");
        }
        System.out.println("를 냈습니다.");

        if (comNum == myNum) {
            System.out.println("비겼어.");
        } else if ((comNum == 0 && myNum == 1) || (comNum == 1 && myNum == 2) || (comNum == 2 && myNum == 0)) {
            System.out.println("이겼어.");
        } else if ((comNum == 0 && myNum == 2) || (comNum == 1 && myNum == 0) || (comNum == 2 && myNum == 1)) {
            System.out.println("졌어");

            sc.close();

        }

    }

}
