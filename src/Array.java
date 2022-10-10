import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] int1={1,2,3,4,5,6};//创建
        System.out.println(int1.length);
        int[] ints=new int [100];//创建一个长度100的空数组
        System.out.println(ints[70]);
        System.out.println(ints.length);
        int [] ns=new int[5];//创建一个长度为5的空数组
        int n=5;
        System.out.println(ns[2]);
        int[] nss = { 1, 4, 9, 16, 25 };
        for (int i = 0; i < nss.length; i++) {//for循环遍历数组
            System.out.print(nss[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(nss));
        int[] nsss = {99,100,98,101,97,102 };
        for (int k:nsss){//for each循环遍历数组
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(nsss));
        int[] intss=Arrays.copyOf(ints,ints.length*2);
        System.out.println(intss.length);
    }
}
