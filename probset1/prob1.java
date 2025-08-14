import java.util.Scanner;
class Helloworld {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        String str= s.next();
        char c= s.next().charAt(0);
        System.out.println(n);
        System.out.println(str);
        System.out.println(c);
    }
}
