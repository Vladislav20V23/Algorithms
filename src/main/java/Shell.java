public class Shell {

    public static void main(String[] args) {

        int [] arr = new int[]{4, 1, 7, 9, 5, 2, 6, 8, 10};

        sortBySelect(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    public static void sortBySelect(int [] arr){
        int length = arr.length;
        int stepArr = length / 2;

        while (stepArr > 0){

            for (int numberGroup = 0; numberGroup < length - stepArr; numberGroup++){
                int y = numberGroup;

                while (y >=0 && arr[y] > arr[y + stepArr]){
                    int save = arr[y];
                    arr[y] = arr[y + stepArr];
                    arr[y + stepArr] = save;
                    y--;
                }
            }
            stepArr = stepArr / 2;
        }
    }
}
