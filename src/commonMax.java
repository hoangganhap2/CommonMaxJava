import java.util.Scanner;

public class commonMax {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("Input a: ");
        a=input.nextInt();
        System.out.println("Input b: ");
        b=input.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if(a==0 || b==0){
            System.out.println("No greatest common factor");
        }
        while (a != b){
            if(a>b){
                a-=b;
            }else {
                b-=a;
            }
        }
        System.out.println("Greatest common factor: "+a);
    }
}
