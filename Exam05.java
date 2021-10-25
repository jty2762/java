class Plant{
    public Plant(){
        System.out.println("Plant");
    }
    public Plant(int x){
        System.out.println("Plant"+x);
    }
}
class Tree extends Plant{
    public Tree(){
        super(33);
        System.out.println("Tree");
    }
    public Tree(int x){
        System.out.println("Tree"+x);
    }
}
public class Exam05 {
    public static void main(String[] args){
        new Tree();
    }
}