package Corejava;

public class JumpStatements {
    public static void main(String[] args) {

        // Break statement:
        int i = 1;
        for (; ; i++) {
            if(i==3){
                break;   //break statement to come out of switch
            }
            else{
                System.out.println(i);
            }
        }

        // Continue statement:
       for(int j=1; j<=10; j++){
           if(j<6){
               continue;
           }
           System.out.println(j);
       }

    }
}
