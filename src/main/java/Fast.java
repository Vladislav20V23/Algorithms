public class Fast {

    public static void main(String[] args) {

        int [] arr = new int[]{4, 1, 7, 9, 5, 2, 6, 8, 10};

        fastSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    public static void fastSort(int[] arr){
        recursionFastSort(arr, 0, arr.length - 1);
    }

    public static void recursionFastSort(int[] arr, int min, int max){
        if(arr.length == 0){
            return;
        }

        if(min >= max){
            return;
        }

        int middle = min + (max - min) / 2;
        int middleElement = arr[middle];

        int x = min, y = max;
        while (x <= y){
            while (arr[x] < middleElement){
                x++;
            }
            while (arr[y] > middleElement){
                y--;
            }

            if(x <= y) {
                int save = arr[x];
                arr[x] = arr[y];
                arr[y] = save;
                x++;
                y--;
            }

            if(min < y)
                recursionFastSort(arr, min, y);

            if(max > x)
                recursionFastSort(arr, x, max);
        }

    }
}
