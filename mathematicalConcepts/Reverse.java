import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int res=0;
       while (n>0){
           int last=n%10;
           res= res*10+last;
           n=n/10;
       }
        System.out.println(res);
    }
}
