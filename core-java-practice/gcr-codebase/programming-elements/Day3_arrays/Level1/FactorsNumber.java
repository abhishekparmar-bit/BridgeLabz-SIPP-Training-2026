import java.util.*;
public class FactorsNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int m=10;
        int[] f=new int[m];
        int idx=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){

                if(idx==m){
                    m=m*2;
                    int[] t=new int[m];

                    for(int j=0;j<idx;j++){
                        t[j]=f[j];
                    }

                    f=t;
                }

                f[idx++]=i;
            }
        }

        System.out.println("Factors:");
        for(int i=0;i<idx;i++){
            System.out.print(f[i]+" ");
        }
    }
}
