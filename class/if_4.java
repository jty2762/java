import java.util.Scanner;

public class if_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수 입력 : ");
        int score = scanner.nextInt();
        System.out.print("학년 입력 : ");
        int year = scanner.nextInt();

        if (score >= 60){
            if(year != 4)
                System.out.println("합격");
            else if(score >= 70)
                System.out.println("합격");
            else
                System.out.println("불합격");
        }
        else
            System.out.println("불합격");

        scanner.close();
    }
}
