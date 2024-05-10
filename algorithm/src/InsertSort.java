import java.util.ArrayList;
import java.util.Collections;

public class InsertSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        
        for(int idx=0; idx<dataList.size()-1; idx++){
            for(int idx2 = idx+1; idx2>0; idx2--){
                System.out.println("dataList: " + dataList);
                if(dataList.get(idx2) < dataList.get(idx2-1)){
                    Collections.swap(dataList, idx2, idx2-1);
                } else {
                    break;
                }
            }
        }
        
        return dataList;
    }
}
