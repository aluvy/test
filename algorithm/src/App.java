import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            // 랜덤 숫자 생성
            ArrayList<Integer> dataSet = new ArrayList<Integer>();
            
            // 숫자 입력받기
            for ( int i=0; i<10; i++) {
                System.out.println(i+1 + "번째 숫자를 입력해 주세요");
                dataSet.add(sc.nextInt());
            }
            System.out.println("--- 정렬 전: " + dataSet);

            // quick sort
            QuickSort qSort = new QuickSort();
            System.out.println("--- quick sort(정렬 후): " + qSort.sort(dataSet));
        }

    }
}
