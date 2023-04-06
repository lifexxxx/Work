package untitled;

import java.util.Scanner;

public class test{
    public static void main(String[]args) {
        double a,b,c;
        while(true) {
            System.out.println("请输入a:");
            try (Scanner sc = new Scanner(System.in)) {
                a=sc.nextDouble();
                System.out.println("请输入b:");
                b=sc.nextDouble();
                System.out.println("请输入c:");
                c=sc.nextDouble();
            }
            if(b*b-4*a*c<0) {
                System.out.println("该方程无解");
                break;
            }
            else if(a==0&&b==0)
            {
                System.out.println("x任意解");
                break;
            }
            else {
                if(a==0) {
                    System.out.println("x无解");
                    break;
                }
                else {
                    double X1=(-b+Math.sqrt(b*b-4*a*c))*1/(2*a);
                    double X2=(-b-Math.sqrt(b*b-4*a*c))*1/(2*a);
                    System.out.println("方程的根为："+X1);
                    System.out.println("方程的根为："+X2);
                    break;
                }
            }
        }
    }
}


