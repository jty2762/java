class Car_2{
    int speed = 0;

    void upSpeed(int speed){
        this.speed += speed;
        System.out.println("현재속도(슈퍼클래스): "+this.speed);
    }
}

class Sedan_2 extends Car_2{
    void upSpeed(int speed){
        this.speed += speed;
        if(this.speed > 150) this.speed = 150;
        System.out.println("현재속도(서브클래스) : "+this.speed);
    }
}

class Truck_2 extends Car_2{
}

public class Ex12_06 {
    public static void main(String[] args){
        Truck_2 truck1 = new Truck_2();
        Sedan_2 sedan1 = new Sedan_2();

        System.out.print("트럭 -> ");
        truck1.upSpeed(200);

        System.out.print("승용차 -> ");
        sedan1.upSpeed(200);
    }    
}
