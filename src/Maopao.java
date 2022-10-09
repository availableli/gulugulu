public class Maopao {
    public static void main(String[] args) {
        int[] score={3,9,-1,10,-2};
        for (int i = 0; i < score.length-1; i++) {
            for (int j=0;j< score.length-i-1;j++){
                if (score[j]>score[j+1]){
                    int temp=score[j+1];
                    score[j+1]=score[j];
                    score[j]=temp;
                }
                System.out.print(score[j]+" ");
            }
            System.out.print("[");
            for (int j = score.length-i-1; j < score.length; j++) {
                System.out.print(score[j]+" ");
            }
            System.out.println("]");
        }
    }
}
