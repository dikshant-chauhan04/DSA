public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {7,8,3,1,4,55,23,2,1,3,6};

        //bubble sort
        for(int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
          }
        }

        for(int k =0; k<arr.length; k++){
                System.out.print(arr[k] + " ");
            }

        }

}
