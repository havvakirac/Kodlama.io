package PerfectNumber;

public class Main {
    public static void main(String[] args){
        //6=1+2+3
        //28=1+2+4+7+14

        int num=28;
        int total=0;

        for (int i=1;i<num;i++){
            if(num%i==0){
                total=total+i;
            }
        }
        if (total==num){
            System.out.println(num+" =>Perfect Number");
        }
        else System.out.println(num +" =>not perfect number");

    }
}
