import java.util.Scanner;



public class ArrayClone {
    static int[] arrayClone(int[] a) {
        int[] c = new int[a.length];
        for(int i=0; i<c.length; i++) {
            c[i] = a[i];
        }
        return c;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("요소수: ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for(int i=0; i<num; i++) {
            System.out.print("x[" + i + "]");
            x[i] = sc.nextInt();
        }
        int[] y = arrayClone(x);
        System.out.println("배열x를 복사하여 배열y생성:");

        for(int i=0; i<num; i++) {
            System.out.println("y[" + i + "]-" + y[i]);
        }

    }
}
