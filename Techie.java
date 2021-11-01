 /*-------------------------------------------------------------------------
// AUTHOR: Arvin Edouard
// FILENAME: Assignment5.java
// SPECIFICATION:  This is the class Techie for Assignment 5
// FOR: CSE 110- Assignment 5 Monday Wedsnesday Friday 2:30 to 3:20
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

public class Techie {

    private String techieName;
    private int questionAsked;

    public Techie(String name){ // Construtor
        techieName = name;
        questionAsked = 0;
    }

    public String getName(){
        return techieName; // returns the Techie's name
    }

    public int getNumberOfQuestions(){
        return questionAsked; // Returns how many questions asked
    }
    
    public boolean isOdd(int num){
        questionAsked++; // increases questions asked
        if(num % 2 == 0){ // checks if number is even
            return false; // returns false if even
        }else{
            return true; // returns true if odd
        }
    }

   public String reverse(String text){
        questionAsked++; // increases questions asked
        String reverseText = ""; // string to keep the reversed texted in
        int q = text.length();
        for( int i = text.length() - 1; i >= 0; i--){
            reverseText = reverseText + text.substring(i, q); // takes the last letter adds it to reverse text then repeats with the next letter until no letters are left
            q--;
        }
        return reverseText; //returns revesed text
    }

    public int factorial(int num){
        questionAsked++; // increases questions asked
        for(int i = num - 1; i >= 1; i--){
            num = num * i; // multiples the number give by 1 less than that number and repeats until the multipler hits 0
        }
        return num; // returns factoral

    }
    public boolean isAlpha (char letter){
        questionAsked++;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // Alphabet stored
        int match = 0; // to keep track of matched match
        for(int i = 0; i < alphabet.length(); i++){
            if(letter == alphabet.charAt(i)){ // checks the given letter with every letter in the alphabet until it find a match or goes through every letter
                match++; // increases counter if there is a match
            }
        }
        if(match == 1){
            return true; // if there is a match return true
        }else{
            return false; // if there is no match return false
        }

    }

    public int smallest(int num1, int num2, int num3){
        questionAsked++;
        int smallestNumber;
        if(num1 < num2){
            if(num1 < num3){
                smallestNumber = num1;
            }else{
                smallestNumber = num3;
            }
        }else{
            if(num2 < num3){
                smallestNumber = num2;
            }else{
                smallestNumber = num3;
            } // compares the numbers to each other to find the smallest and stores the smallest
        }
        return smallestNumber; // returns the smallest number
    }

    public boolean isPrime(int num){
        questionAsked++;
        int zeros = 0; // counter for how many zeros there are after computing
        for(int i = 2; i < num; i++){ // checks if the numbers between 1 and the given number return a whole number
            if(num % i == 0){
                zeros++; // increases counter if it equals zero
            }
        }
        if(zeros == 0){
            return true; // if the are no zeros it is prime
        }else{
            return false;// if the are any zeros it is not prime
        }
    }
}
