import java.util.Scanner;

public class StdinAndStdout{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        int num = sn.nextInt();
        double decimal = sn.nextDouble();
        sn.nextLine();
        String line = sn.nextLine();

        System.out.println("String: " + line);
        System.out.println("Double: " + decimal);
        System.out.println("Int: " + num);
    }
}