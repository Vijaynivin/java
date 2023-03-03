public class Reverse {
    public static void reverse(int arr[],int start,int end){
        int temp;
        while(start<end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    }
    public static void rotation(int arr[],int d){
        int l = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, l-1);
        reverse(arr, 0, l-1);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8};
        rotation(arr, 3);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }

    
}