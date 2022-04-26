public class InsertionSort {

        public static void main(String[] args) {
// time complexity = o(n^2);
            int [] arr = {8,9,7,2,4,5,3,1};

            for (int i = 1; i<arr.length; i++){
                int current = arr[i];
                int j = i-1;
                while (j >= 0 && current<arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
            }

            for (int k=0; k<arr.length; k++){
                System.out.print(arr[k]);
            }

        }
    }


