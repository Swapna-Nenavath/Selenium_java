package Corejava;

public class LoopStatements {
    public static void main(String[] args){

        // for loop:
        int sum=0;
        int i;
        for(i=1; i<=10; i++){
            sum=sum+i;
        }
        System.out.println("The sum of first 10 natural numbers is:" + sum);

        // for each loop:
        String[] colors={"White","Black","Pink","Orange","Red"};
        for(String k:colors){
            System.out.println(k);
        }

        // while loop:
        int j=0;
        while(j<=8){
            System.out.println(j);
            j++;
        }

        // do while loop:
        int a=1;
        do{
            System.out.println("Java");
            a++;
        }
        while(a<=5);

    }
}
