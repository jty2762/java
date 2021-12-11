class Person{
    private int age;

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return this.age;
    }

}

public class Exam01 {
    public static void main(String[] args){
        Person aPerson = new Person();
        aPerson.setAge(25);
        System.out.println(aPerson.getAge());
    }
}
