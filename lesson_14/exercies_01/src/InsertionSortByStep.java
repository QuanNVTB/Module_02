public class InsertionSortByStep {
    public static void insertionSortByStep(int[] array){
        for(int i = 1; i < array.length; i++){
            int currentValue =  array[i];
            int pos = i;

            System.out.println("Chen " + currentValue + " vao vi tri thich hop");

            while (pos > 0 && array[pos - 1] > currentValue){
                array[pos] = array[pos - 1];
                pos--;
            };
            array[pos] = currentValue;

            System.out.print("Sau buoc " + i + ": ");
            for(int num : array){
                System.out.println(num + "\t");
            }
            System.out.println();
        }
    }
}
