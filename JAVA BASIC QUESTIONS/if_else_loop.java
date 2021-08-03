import java.util.Scanner;
//type Solution instead of if_else_loop if your are copy and pasting it in hackerrank text editor 😀
public class  if_else_loop{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        int num = sn.nextInt();
        if(num % 2 != 0){
            System.out.println("Wierd");
        } else if(num % 2 == 0 && num > 2 && num < 5){
            System.out.println("Not Wierd");
        } else if(num % 2 == 0 && num > 6 && num < 20){
            System.out.println("Wierd");
        } else if(num % 2 == 0 && num > 20){
            System.out.println("Not Wierd");
        }
    }
}
