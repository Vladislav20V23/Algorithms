public class Bubble {

    public static void main(String[] args){

        int [] arr = new int [] {55, 60, 43, 67, 94, 23, 54};

        bubbleSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] array){

        for(int i = array.length - 1; i > 1; i --){
            for (int y = 0; y < i; y++){
                if(array[y] > array[y+1]){
                    int save = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = save;
                }
            }
        }
    }


}
