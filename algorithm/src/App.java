import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            
            ArrayList<Integer> dataSet = new ArrayList<Integer>();
            
            // 요구사항1: 사용자로터 10개의 숫자를 입력 받는다.
            for ( int i=0; i<10; i++) {
                System.out.println(i+1 + "번째 숫자를 입력해 주세요");

                // 요구사항2: 입력 받은 숫자는 리스트나 배열에 저장된다.
                dataSet.add(sc.nextInt());
            }
            System.out.println("--- 정렬 전: " + dataSet);

            // // quick sort
            // QuickSort qSort = new QuickSort();
            // System.out.println("--- quick sort(정렬 후): " + qSort.sort(dataSet));

            // Insert sort
            InsertSort iSort = new InsertSort();
            System.out.println("--- quick sort(정렬 후): " + iSort.sort(dataSet));
        }

    }
}
