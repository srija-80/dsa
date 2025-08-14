import java.util.Scanner;
class Helloworld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("angle1");
        int a1 = s.nextInt();
        System.out.println("angle2");
        int a2 = s.nextInt();
        System.out.println("angle3");
        int a3 = s.nextInt();
        if ((a1 + a2 + a3) == 180) {
            System.out.println("triangle can be formed");
        } else {
            System.out.println("triangl cant be formed");
        }
    }
}
