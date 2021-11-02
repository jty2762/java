/*5. 다음은 2차원 배열로 학년별(4년간) 로 1,2학기 성적을 저장하고, 평점 평균을 출력하는 자바 소스이다. 
아래 빨간색 빈 칸에 들어갈 라인에 코드를 이차원 배열 형태로 쓰라. (1점)
그리고, score.length, score[year].length 는 값이 얼마인가? (각 1점 총 2점)*/

public class ScoreAverage {
    public static void main(String[] args) {
        double score[][] = {{3.3, 3.4},	// 1학년 1, 2학기 평점
            {3.5, 3.6},	// 2학년 1, 2학기 평점
            {3.7, 4.0},	// 3학년 1, 2학기 평점
            {4.1, 4.2}};	// 4학년 1, 2학기 평점
        double sum=0;

        int year, term;
        for(year=0; year<score.length; year++){// 각 학년별로 반복
            for(term=0; term<score[year].length; term++)
                sum += score[year][term]; // 각 학년의 학기별로 반복
        }// 전체 평점 합
                
        int n = score.length; // 배열의 행 개수, 4
        int m = score[0].length; // 배열의 열 개수, 2
        System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
    }
}
