import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        int temp=0;
        // 倒序打印数组元素:
        for (int i=0;i<ns.length-1;i++) {
            for (int j = 0; j < ns.length-i-1; j++) {
                if (ns[j]<ns[j+1]){
                    temp=ns[j+1];
                    ns[j+1]=ns[j];
                    ns[j]=temp;
                }
            }
            System.out.println(Arrays.toString(ns));
        }
    }
}
