import java.util.*;
public class FrequencyOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        long t=n;

        int c=0;

        while(t!=0){
            c++;
            t=t/10;
        }

        int[] d=new int[c];

        for(int i=0;i<c;i++){
            d[i]=(int)(n%10);
            n=n/10;
        }

        int[] f=new int[10];

        for(int i=0;i<c;i++){
            f[d[i]]++;
        }

        for(int i=0;i<10;i++){
            if(f[i]>0){
                System.out.println(i+" -> "+f[i]);
            }
        }
    }
}
