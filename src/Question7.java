//설명: 배열 5, 10, 15, 20, 25를 역순으로 출력하는 프로그램을 작성하세요.
public class Question7 {
    public static void main(String[] args) {
        int[] num = {5,10,15,20,25};
        for(int i=num.length-1; i>=0; i--) {
            System.out.println(num[i]);
        }
    }
}

