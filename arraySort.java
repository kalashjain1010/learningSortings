public class arraySort {

        

    public static void main(String[] args) {
        int arr[] = {6,3,5,7,2,1,4};
//bubble sort --> largst k sth swap krte jate h taki largest piche chle jaae or smallest aage aa jae

       /* for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-1-i; j++) {
                    if (arr[j]>arr[j+1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]= temp;
                    }
                }
        }*/

//selection sort --> first value ko smallest maan k baki compare krte fir jo bhi smallest milti us se swap

        /*for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                    if (arr[smallest]> arr[j]) {
                        smallest =j;
                    }
                }
                int temp = arr[smallest];
                arr[smallest]= arr[i];
                arr[i]= temp;
        }*/

//insertion sort --> first element ko sorted maan lete or baki unsorted fir sb se compare krte fir chota vala aage aate jata
    
            for(int i=1; i<arr.length; i++) {
                int current = arr[i];
                int j = i - 1;
                    while(j >= 0 && arr[j] > current) {
                     //Keep swapping
                     arr[j+1] = arr[j];
                     j--;
                    }
                    arr[j+1] = current;
            }

//for printing array
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] +" ");
        }
    }

}
