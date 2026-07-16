import java.util.*;
public class EmployeeBonus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double[] sal=new double[10];
        double[] yr=new double[10];
        double[] bon=new double[10];
        double[] ns=new double[10];

        double tb=0,os=0,ts=0;

        for(int i=0;i<10;i++){
            sal[i]=sc.nextDouble();
            yr[i]=sc.nextDouble();

            if(sal[i]<=0||yr[i]<0){
                i--;
            }
        }

        for(int i=0;i<10;i++){
            if(yr[i]>5){
                bon[i]=sal[i]*0.05;
            }else{
                bon[i]=sal[i]*0.02;
            }

            ns[i]=sal[i]+bon[i];

            tb+=bon[i];
            os+=sal[i];
            ts+=ns[i];
        }

        System.out.println("Total Bonus = "+tb);
        System.out.println("Old Salary = "+os);
        System.out.println("New Salary = "+ts);
    }
}
