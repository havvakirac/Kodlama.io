package ReCapDemo1;

public class Main {
    public static void main(String[] args){
        int num1=20;
        int num2=25;
        int num3=200;

        int max=num1;

        if(max<num2){
            max=num2;
        }
        if (max<num3){
            max=num3;
        }

        System.out.println("Max number: "+max);
    }
}
