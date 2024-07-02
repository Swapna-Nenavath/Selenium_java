package Corejava;

public class Arrays {
    public static void main(String[] args){

        // Single Dimensional Array:
        int age[]={12,18,23};
        for(int i=0; i<age.length; i++){
            System.out.println(age[i]);
        }

        // Multi Dimensional Array:
        int[][] nums={{5,3,8},{4,6,9},{1,8,2}};
        for(int j=0; j<nums.length; j++){
            for(int k=0; k<nums.length; k++){
                System.out.print(nums[j][k] +" ");
            }
            System.out.println(" ");
        }






    }
}
