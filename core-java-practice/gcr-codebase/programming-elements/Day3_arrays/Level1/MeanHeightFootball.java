import java.util.*;
public class MeanHeightFootball {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double[] h=new double[11];
        double s=0;

        for(int i=0;i<11;i++){
            h[i]=sc.nextDouble();
            s+=h[i];
        }

        System.out.println("Mean height = "+(s/11));
    }
}
