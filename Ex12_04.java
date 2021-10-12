class Car_1{
    private String color;
    int speed;
}

class Sedan_1 extends Car_1{
    void setSpeed(int speed){
        this.speed = speed;
    }
}
/*
    void setColor(String color){
        this.color = color;           2행의 color는 상속 받지 못하므로 오류가 발생
    }
*/

public class Ex12_04 {
    public static void main(String[] args){

        Sedan_1 sedan1 = new Sedan_1();

        sedan1.setSpeed(300);
        System.out.println("승용차 속도 ==> "+sedan1.speed);
    }
}
