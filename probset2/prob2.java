import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int x = s.nextInt();
       int i=1;
       while(i<=10){
            System.out.println(x*i);
            i++;
       }
    }
}
