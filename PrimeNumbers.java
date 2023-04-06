package com.bridgelabz.Review1;

import java.util.Scanner;

//problem-1Prime Number
//Just like the Perfect number, the Prime number is also a special type of number. When
//the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
//number. 0 and 1 are not counted as prime numbers. All the even numbers can be
//divided by 2, so 2 is the only even prime minister.
public class PrimeNumbers {

    static boolean checkForPrime(int data){
        int temp = data/2;
        boolean flag = false;

        if(data == 0 || data == 1){
            System.out.println(data + " is not counted as prime numbers");
        } else if (data == 2) {
            System.out.println(data + " is the only even prime number");
        }else {
            for (int i = 2; i < temp; i++) {
                if (data % i == 0) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int data = sc.nextInt();

        boolean resultFlag = checkForPrime(data);
        if(resultFlag == false && data >= 3){
            System.out.println(data + " is prime number");
        }else{
            System.out.println(data + " not prime number");
        }
    }
}
