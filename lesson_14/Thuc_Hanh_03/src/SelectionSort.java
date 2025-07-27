public class SelectionSort {

    public static  void selectionSort(double[] list){
        for(int i = 0; i < list.length - 1; i++){
            double currenMin = list[i];
            int currenMinIndex = i;
            for(int j = i + 1; j < list.length; j++){
                if(currenMin > list[j]){
                    currenMin = j;
                }
            }
            if(currenMinIndex != i ){
                list[currenMinIndex] = list[i];
                list[i] = currenMin;
            }
        }
    }
}
