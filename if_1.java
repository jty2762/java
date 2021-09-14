import java.util.Scanner;

public class if_1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("input score : ");
        int score = scanner.nextInt();
        if(score >= 80)
            System.out.print("pass");

        scanner.close();
    }
}
