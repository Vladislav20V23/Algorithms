public class Insert {

    public static void main(String[] args) {

        int [] arr = new int[]{55, 60, 43, 67, 94, 23, 54};

        insertion(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }

    }


    public static void insertion(int[] arr) {

        for (int i = 1; i < arr.length; i++){
            int save = arr[i];
            int y = i;

            while (y > 0 && arr[y - 1] >= save){
                arr[y] = arr[y-1];
                --y;
            }

            arr[y] = save;
        }
    }



    }
