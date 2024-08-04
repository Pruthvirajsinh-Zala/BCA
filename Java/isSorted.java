import java.util.Scanner;

public class isSorted {

    public static Boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //Array is Sorted till Now
            return isSorted(arr,idx+1);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Numbers");
        for(i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
}
