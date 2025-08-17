class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] data={20,56,7,89,80};
        System.out.println("Before sorting");
        for(int num:data){
            System.out.print(num+" ");
        }
        bubbleSort(data);
        System.out.println("After sorting");
        for(int num:data){
            System.out.print(num+" ");
        }



    }

}