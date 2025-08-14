import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter mark: ")
        int mark= s.nextInt();
        if(mark>=90){
            System.out.println("grade A");
        }
        else if(mark>=80){
            System.out.println("grade B");
        }
        else if(mark>=60){
            System.out.println("grade C");
        }
       else if(mark>=35){
            System.out.println("grade D");
        }
        else{
            System.out.println("fail");
        }
    }
}
