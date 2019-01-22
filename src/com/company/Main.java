package com.company;

public class Main {
    public static void main(String[] args) {
/*
        Problem #1
        Create an array to hold the numbers 1-10.
 */
        // Declaring an array to hold ten test scores
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;
        //or
        // int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Print the elements of an array
        for (int i = 0;
             i < 10; i++) {

            System.out.printf("Element # %d value is %d\n", i, numbers[i]);
        }
/*
        Problem #2
        Loop through that array and sum the numbers 1-10, then print that total to the screen.
 */
        //Initialize elements of an array
        // int[] x = new int[10];
        //Initialize new Variable: Sum = Summation of all the numbers
        int sum = 0;

        for (int i = 0;
             i < 100; i++) {

            //x[i] = x[i] + numbers[i];
            sum += numbers[i];//x[i];
        }

/*
        Problem #3
        Create an array to hold 10 number inputs from the user and print that total to the screen.
 */
        // Initialize an Array
         int[] x = new int[10];
         println("Input 10 numbers to Hold in the Array..");







/*
        Problem #4
        Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
 */





/*
        Problem #5
        Create an array to store 3 names, loop through that array to print out the names.
 */







/*
        Problem #6
        Create an array with the following values: [2,5,9,0,2,1,8,5,4]
        Loop through the array and print out the index each time the value equals 5.
 */






/*
        Problem #7
        Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
 */





/*
        Problem #8
        Given the following array: ['w','t','y','h','k']
Loop        through the array and replace the the letter 't' with the word "hello" once it's found.

 */






/*
        Problem #9
        Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
            Write a program that will print out all matching pairs from arrays 1 and 2.
            Expected output:          (7,7) and (6,6)
 */


        System.out.println("The Sum of all the numbers is " + sum);


    }
}