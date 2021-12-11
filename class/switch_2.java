import java.util.Scanner;

public class switch_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("무슨 커피 드릴까요? : ");
        String order = scanner.next();
        int price = 0;

        switch (order){
            case "a":
            case "c":
            case "cl":
                price = 3500;
                break;
            case "aa":
                price = 2000;
                break;
            default:
                System.out.println("없는 메뉴");
        }
        if(price != 0)
            System.out.println(order+"는 "+price+"원 입니다.");
        
        scanner.close();
    }
}
