import java.util.Scanner;

public class if_2 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("input number : ");
        int number = s.nextInt();

        if(number % 3 == 0)
            System.out.println("3의 배수");
        else
        System.out.println("3의 배수가 아님");

        s.close();
    }

}
