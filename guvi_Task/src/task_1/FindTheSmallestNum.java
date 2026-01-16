package task_1;

import java.util.Scanner;

// Write a java program to find the smallest number among the three numbers.

public class FindTheSmallestNum {
    public static void main(String[] args) {
        
        int a = 50;
        int b = 20;
        int c = 30;
        
        if(a <= b && a <= c){
            System.out.println(+a+ " is the smallest number");
        }else if(b <= a && b <= c){
            System.out.println(+b+ " is the smallest number");
        }else{
            System.out.println(+c+ " is the smallest number");
        }
    }
}

