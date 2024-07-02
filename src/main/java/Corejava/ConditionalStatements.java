package Corejava;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an input");
        int age=input.nextInt();
        if(age<18) {
            System.out.println("You are a minor");
        }
        if(age>=18){
            System.out.println("You are eligible to vote");
        }

        else{
            System.out.println("You are a senior citizen");

        }
            }

    }

