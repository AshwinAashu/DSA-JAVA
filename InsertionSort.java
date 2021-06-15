public class InsertionSort{

    void sort(int[] arr){
        int i, j , key, n;
        n = arr.length;
        for(i=1; i < n;i++){
            j = i-1;
            key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                arr[j] = key;
                j -= 1;
            }
            arr[j+1]= key;
        }
    }

    static void printRes(int[] arr){

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){

        int[] arr = {15,22,11,6,9,36};
        InsertionSort obj = new InsertionSort();
        obj.sort(arr);
        printRes(arr);
    }
}