class Solution
{
     
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                
                // swap (arr[i], arr[j])
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        // swap (arr[i+1], arr[high])
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        
        return i+1;
    } 
}
