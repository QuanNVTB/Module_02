public class NumberMin {
    public static void main(String[] args) {
        int [] arr = {4,12,5,7,2,6};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int [] arrays){
        int index = 0;
        for(int i = 0; i < arrays.length; i++){
            if(arrays[i] < arrays[index]){
                index = i;
            }
        }
        return index;
    }
}
