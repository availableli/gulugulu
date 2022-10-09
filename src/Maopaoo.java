import java.util.Arrays;

public class Maopaoo {
    public static void main(String[] args) {
        int arr []={105,104,106,103,107};
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
            }
        }
    }
