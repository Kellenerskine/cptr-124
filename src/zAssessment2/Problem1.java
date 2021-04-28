//Kellen Erskine

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter some numbers: ");
        int userInput = 0;
        int counter = 0;
        int evenNumsSum = 0;
        int nonNegsEntered = 0;


        while(userInput >= 0){
            userInput = scn.nextInt();
            if(userInput < 0){
                break;
            }
            if(userInput >= 0){
                nonNegsEntered = nonNegsEntered + userInput;
                if(userInput % 2 == 0){
                    evenNumsSum = evenNumsSum + userInput;
                }
                counter++;
            }
        }


        if(counter % 2 == 0 && counter >= 0){
            System.out.println(nonNegsEntered);
        }else if(counter == 0){
            System.out.println(-1);
        }else{
            System.out.println(evenNumsSum);
        }
        scn.close();
    }
}


                            //DONEif numcount is even: print sum of all non-negative numbers
                            //DONEif numcount is odd: print the sum of the even nums entered = numsAdded
                            //DONEif user enters negative num first, program should print -1
                            //need to exclude the negative numbers