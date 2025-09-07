import java.util.Scanner;
public class PrintDivisorsUsingRecursion {
    public static void print(int n, int i) {
        if(i>=n){
            System.out.print(i);
        }
        else{
            if(n%i==0){
                System.out.print(i+" ");
                print(n,i+1);
            }
            else{
                print(n,i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
       print(n,1);
    }
}
