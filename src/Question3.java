//- **설명**: 정수형 배열 `10, 20, 30, 40, 50`의 합을 계산하여 출력하는 프로그램을 작성하세요.
public class Question3 {
    public static void main(String[] args) {
    int[] num = {10,20,30,40,50};
    int sum = 0;
    for(int i = 0; i< num.length; i++) {
        sum += num[i];
    }
    System.out.println(sum);
    }
}
