import java.util.*;
public class StudentGrades {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        double[] p=new double[n];
        double[] c=new double[n];
        double[] m=new double[n];
        double[] per=new double[n];
        char[] g=new char[n];

        for(int i=0;i<n;i++){
            p[i]=sc.nextDouble();
            c[i]=sc.nextDouble();
            m[i]=sc.nextDouble();

            if(p[i]<0||c[i]<0||m[i]<0){
                i--;
            }
        }

        for(int i=0;i<n;i++){
            per[i]=(p[i]+c[i]+m[i])/3;

            if(per[i]>=90) g[i]='A';
            else if(per[i]>=75) g[i]='B';
            else if(per[i]>=60) g[i]='C';
            else if(per[i]>=40) g[i]='D';
            else g[i]='F';
        }

        for(int i=0;i<n;i++){
            System.out.println(per[i]+" "+g[i]);
        }
    }
}
