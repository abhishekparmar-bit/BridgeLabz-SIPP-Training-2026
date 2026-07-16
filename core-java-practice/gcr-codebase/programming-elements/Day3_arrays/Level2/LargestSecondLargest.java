import java.util.*;
public class LargestSecondLargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();

        int max=10;
        int[] d=new int[max];
        int idx=0;

        while(n!=0){
            d[idx]=(int)(n%10);
            idx++;

            if(idx==max){
                break;
            }

            n=n/10;
        }

        int l=0,s=0;

        for(int i=0;i<idx;i++){
            if(d[i]>l){
                s=l;
                l=d[i];
            }else if(d[i]>s&&d[i]!=l){
                s=d[i];
            }
        }

        System.out.println("Largest = "+l);
        System.out.println("Second Largest = "+s);
    }
}
