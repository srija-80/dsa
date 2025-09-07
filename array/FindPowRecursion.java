import java.util.Scanner;
public class FindPowRecursion {
    public static int print(int n1, int n2,int i) {
        if(i>=n2){
            return n1;
        }
        else{
            return n1*print(n1,n2,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1= s.nextInt();
        int n2= s.nextInt();
        System.out.println(print(n1,n2,1));
    }
}
