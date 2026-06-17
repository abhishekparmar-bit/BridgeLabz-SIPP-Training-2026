import java.util.*;
public class ReverseNumberArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int t=n;
        int c=0;

        while(t!=0){
            c++;
            t=t/10;
        }

        int[] d=new int[c];

        for(int i=0;i<c;i++){
            d[i]=n%10;
            n=n/10;
        }

        for(int i=c-1;i>=0;i--){
            System.out.print(d[i]);
        }
    }
}
