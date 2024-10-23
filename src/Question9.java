//설명: 배열 1, 2, 3, 4, 5를 다른 배열로 복사한 후, 복사된 배열을 출력하는 프로그램을 작성하세요.
public class Question9 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int[] copy = new int [num.length];

        for (int i = 0; i < num.length; i++) {
            copy[i] = num[i];
        }
        System.out.println("복사된 배열 요소:");
        for(int i= 0; i < num.length; i++) {
            System.out.println(copy[i]);

        }
    }
}
