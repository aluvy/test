import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        if(dataList.size() <= 1){
            return dataList;
        }

        int pivot = dataList.get(0);
        // System.out.println(" | pivot: " + pivot + " | dataList: " + dataList);

        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        for(int idx=1; idx<dataList.size(); idx++){
            if(dataList.get(idx) > pivot) {
                rightArr.add(dataList.get(idx));
            } else {
                leftArr.add(dataList.get(idx));
            }
        }
        // System.out.println(" || left: " + leftArr + " | right: " + rightArr);

        ArrayList<Integer> mergeArr = new ArrayList<Integer>();
        mergeArr.addAll(this.sort(leftArr));
        mergeArr.addAll(Arrays.asList(pivot));
        mergeArr.addAll(this.sort(rightArr));
        // System.out.println(" ||| mergeArr: " + mergeArr);

        return mergeArr;
    }
}
