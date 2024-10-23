//설명: 배열 2, 4, 6, 8, 10에서 사용자가 입력한 값이 배열에 있는지 확인하고, 있으면 "존재합니다", 없으면 "존재하지 않습니다"를 출력하는 프로그램을 작성하세요.
import java.util.Scanner;
public class Question8 {
     public static void main(String[] args) {
         int[] num={2,4,6,8,10};
    Scanner sc = new Scanner(System.in);
         System.out.println("값을 입력해 주세요");
         int target = sc.nextInt();

         boolean flag = false;

         for (int i = 0; i <num.length; i++) {
             if(num[i]==target){
                 flag = true;
                 break;
             }
         }
         if(flag){
             System.out.println("존재합니다");
         }else{
             System.out.println("존재하지 않습니다");
         }
     }
}
