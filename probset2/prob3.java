import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       String firstname=s.nextLine();
        String lastname=s.nextLine();
       int x = s.nextInt();
       for(int i=0;i<x;i++){
           System.out.println(firstname+lastname);
       }
       }
}
