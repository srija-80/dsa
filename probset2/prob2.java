import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter value1: ");
        int x = s.nextInt();
        System.out.println("enter value2: ");
        int y= s.nextInt();
        for(int i=0;i<y;i++){
            System.out.println(x);
        }
    }
}
