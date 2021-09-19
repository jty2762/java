public class report {
    public static void main(String[] args){
        // char[][] grade = new char[2][20];

        int[][] score = {{70,88,91,-1,78,61,-1,52,70,99,80,100,64,53,-1,-1,55,-1,80,90},
                        {90,80,66,55,-1,67,89,44,77,82,87,93,92,90,100,88,71,91,-1,50}};
        //각각의 배열은 자바, 이산 수강생의 점수(단, -1은 수강하지 않는 학생)
        //ex) 1번 학생의 자바 점수는 70, 이산 점수는 90 

        int java_sum = 0; //자바 총 점수를 구하기 위한 변수
        int esan_sum = 0; //이산 총 점수를 구하기 위한 변수
        int count_1 = 0, count_2 = 0; // 수강하지 않은 학생 수를 세기 위한 변수
        int[][] grade = new int[2][20]; //자바, 이산의 평점을 넣기 위한 배열

        for(int i = 0; i < 20; i++){ // i, 0부터 19까지 for문
            if(score[0][i] == -1){   // score[0][i]가 -1이면 (수강생이 아니면)
                count_1 += 1;        // 자바 수강하지 않은 학생 수 count
                continue;            // for문 한 개 건너 뛰기
            }                           
            java_sum += score[0][i]; // 자바 총 점수에 더하기
        }
        for(int i = 0; i < 20; i++){ // i, 0부터 19까지 for문
            if(score[1][i] == -1){   // score[1][i]가 -1이면 (수강생이 아니면)
                count_2 += 1;        // 이산 수강하지 않은 학생 수 count
                continue;            // for문 한 개 건너 뛰기
            }
            esan_sum += score[1][i]; // 이산 총 점수에 더하기
        }

        System.out.printf("자바 평균 : %.1f%n", (float)(java_sum)/(score[0].length - count_1));
        // 자바 평균 출력 : 자바 총 점수 / ((배열 길이(20)) - (수강하지 않은 학생 수(count_1))
        System.out.printf("이산 평균 : %.1f%n", (float)(esan_sum)/(score[1].length - count_2));
        // 이산 평균 출력 : 이산 총 점수 / ((배열 길이(20)) - (수강하지 않은 학생 수(count_2))
        
        for(int i = 0; i < 2; i++){        // i, 0 ~ 1 for문
            for(int j = 0; j < 20; j++){   // j, 0 ~ 19 for문
                if(score[i][j] == -1){     // score[i][j]가 -1 이면 (수강생이 아니면)
                    grade[i][j] = 88;      // grade[i][j]에 88 넣기 (아스키코드로 나중에 88을 X로 변환시킴)
                    continue;              // for문 한 개 건너 뛰기
                }
                if(score[i][j] >= 90)      // score[i][j]가 90 이상이면 
                    grade[i][j] = 65;      // grade[i][j]에 65 넣기(아스키코드 : A)
                else if(score[i][j] >= 80) // score[i][j]가 80 이상이면
                    grade[i][j] = 66;      // grade[i][j]에 66 넣기(아스키코드 : B)
                else if(score[i][j] >= 70) // score[i][j]가 70 이상이면
                    grade[i][j] = 67;      // grade[i][j]에 67 넣기(아스키코드 : C)
                else                       // 위 조건과 일치하는게 없다면
                    grade[i][j] = 68;      // grade[i][j]에 68 넣기(아스키코드 : D)
            }
        }
        for(int i = 0; i < 20; i++){       // i, 0 ~ 19까지 for문
            System.out.println((i+1)+"번 학생 점수 : 자바 "+(char)grade[0][i]+", 이산 "+(char)grade[1][i]);
            // i번 학생의 자바 이산 평점 출력, grade를 char로 변경해 알파벳으로 출력
        }
    }
}
