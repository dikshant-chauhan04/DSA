public class SelectionSort {
    public static void main(String[] args) {
// time complexity = o(n^2);
  int [] arr = {8,9,7,2,4,5,3,1};

  for (int i =0; i< arr.length-1; i++){
      int smallest = i;
      for(int j =i+1; j< arr.length; j++){
          if(arr[smallest] > arr[j]){
              smallest = j;
          }
      }
      int temp = arr[i];
      arr[i] = arr[smallest];
      arr[smallest] = temp;
  }

  for (int k =0; k<arr.length; k++){
      System.out.print(arr[k]);
  }
    }
}
