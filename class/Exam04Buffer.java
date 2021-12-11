public class Exam04Buffer {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("우리는");
        sb.append(" 자바를 배운다.");
        System.out.println(sb);
        sb.insert(7," 2학년 2학기에");
        System.out.println(sb);
        sb.replace(8,10,"2018");
        System.out.println(sb);
        sb.delete(8,13);
        System.out.println(sb);
    }
}
