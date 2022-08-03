//bubble sort compares the element and pushes the bigger element to the right side

public class bubbleSort {

        public static void main(String[] args) {
            int arr[]={3,4,5,9,2,8};

            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j <arr.length -i-1; j++) {
                    if (arr[j]>arr[j+1]) {
                        //swap
                        int temp= arr[j];
                        
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            //print array

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
}