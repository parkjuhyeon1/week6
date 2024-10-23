//설명: 배열 12, 3, 19, 7, 5에서 가장 작은 값을 찾고 출력하는 프로그램을 작성하세요.
public class Question5 {
    public static void main(String[] args) {
        int[] num = {12,3,19,7,5};

        int min = num[0];

        for(int i = 1; i<num.length; i++) {

            if (num[i] < min) {
                min = num[i];
            }
            System.out.println();


        }
        System.out.println(min);
    }
}
