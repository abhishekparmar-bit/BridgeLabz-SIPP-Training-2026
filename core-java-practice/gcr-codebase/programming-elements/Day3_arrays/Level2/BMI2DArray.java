import java.util.*;
public class BMI2DArray {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        double[][] p=new double[n][3];
        String[] st=new String[n];

        for(int i=0;i<n;i++){
            p[i][0]=sc.nextDouble();
            p[i][1]=sc.nextDouble();

            if(p[i][0]<=0||p[i][1]<=0){
                i--;
            }
        }

        for(int i=0;i<n;i++){
            p[i][2]=p[i][0]/(p[i][1]*p[i][1]);

            if(p[i][2]<18.5){
                st[i]="Underweight";
            }else if(p[i][2]<25){
                st[i]="Normal";
            }else if(p[i][2]<30){
                st[i]="Overweight";
            }else{
                st[i]="Obese";
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(p[i][0]+" "+p[i][1]+" "+p[i][2]+" "+st[i]);
        }
    }
}
