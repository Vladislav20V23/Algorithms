public class Selection {

    public static void main(String[] args) {

        int [] arr = new int[]{55, 60, 43, 67, 94, 23, 54};

        sortSelect(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void sortSelect(int[] arr){

        for(int i = 0; i < arr.length -1; i++){
            int min = i;

            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int save = arr[i];
            arr[i] = arr[min];
            arr[min] = save;
        }

    }
}
