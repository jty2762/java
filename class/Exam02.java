class StaticExam{
    public int age;
    public int getAge(){
        return age;
    }
}

public class Exam02 {
    public static void main(String[] args){
        StaticExam se = new StaticExam();
        
        se.age = 5;
        System.out.println(se.getAge());
    }
}
