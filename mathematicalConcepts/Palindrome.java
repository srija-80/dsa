import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int temp=n;
        int res=0;
       while (n>0){
           int last=n%10;
           res= res*10+last;
           n=n/10;
       }
        if(res==temp){
          System.out.println("true");
    }
      else{
        System.out.println("false");
    }
}
