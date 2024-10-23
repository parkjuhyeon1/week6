//설명: 배열 20, 30, 50, 70, 90의 요소들의 평균을 구하고 출력하는 프로그램을 작성하세요.
public class Question10 {
    public static void main(String[] args) {
        int[] num = {20,03,50,70,90};
        int sum = 0;
        for(int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double avg = (double) sum / num.length;
        System.out.println(avg);
    }
}
