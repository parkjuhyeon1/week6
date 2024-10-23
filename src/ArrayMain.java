public class ArrayMain {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40 ,50};
        System.out.println(numbers[0]); //10출력
        System.out.println(numbers[1]); //20출력
        System.out.println(numbers[2]); //30출력
        System.out.println(numbers[3]); //40출력
        System.out.println(numbers[4]); //50출력

        System.out.println("numbers의 길이는" + numbers.length);

        int[] oldArray = {1, 2, 3}; //기존배열
        System.out.println("oldArray의 길이는"+numbers.length);

        int[] newArray = new int[5]; //새로운 배열생성
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);//배열 복사
        System.out.println(newArray[4]);

        for( int i = 0 ; i < numbers.length ; i++) {
            System.out.println(numbers[i]); // 0,1,2,3,4
        }

    }
}
