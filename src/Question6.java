//설명: 배열 1, 2, 3, 4, 5, 6, 7, 8, 9, 10에서 짝수만 출력하는 프로그램을 작성하세요.
public class Question6 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }
    }
}
