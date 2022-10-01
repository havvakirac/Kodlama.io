package loopDemo;

public class Main {
public static void main(String[] args){

    //For
    System.out.println("Started for loop");
    for (int i=0;i<=10; i+=2){
        System.out.println(i);
    }
    System.out.println("Finished for loop");

    //While
    int i=0;
    System.out.println("\nStarted While loop ");
    while (i<10){
        System.out.println(i);
        i++;
    }
    System.out.println("Finished While loop ");


    //doWhile
    int j=1;
    System.out.println("\nStarted DoWhile loop");
    do {
        System.out.println(j);
        j+=2;
    }while (j<=10);
    System.out.println("Finished DoWhile loop");

}
}

