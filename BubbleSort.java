public class BubbleSort {
    public static void bubbleSort(int arr[]){
       for (int i = 0; i < arr.length-1; i++) {//no of turns (outer loop)
        for (int j = 0; j < arr.length-1-i; j++) {//inner loop
            if(arr[j]>arr[j+1]){
                //Swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            } 
        }
       }
     }
    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) { 
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        PrintArray(arr);
    }
}
