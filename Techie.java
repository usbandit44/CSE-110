public class Techie {

    private String techieName;
    private int questionAsked;

    public Techie(String name){
        techieName = name;
        questionAsked = 0;
    }

    public String getName(){
        return techieName;
    }

    public int getNumberOfQuestions(){
        return questionAsked;
    }
    
    public boolean isOdd(int num){
        questionAsked++;
        if(num % 2 == 0){
            return false;
        }else{
            return true;
        }
    }

   public String reverse(String text){
        questionAsked++;
        String reverseText = "";
        int q = text.length();
        for( int i = text.length() - 1; i >= 0; i--){
            reverseText = reverseText + text.substring(i, q);
            q--;
        }
        return reverseText;
    }

    public int factorial(int num){
        for(int i = num - 1; i >= 1; i--){
            num = num * i;
        }
        return num;

    }public boolean isAlpha (char letter){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int match = 0;
        for(int i = 0; i < alphabet.length(); i++){
            if(letter == alphabet.charAt(i)){
                match++;
            }
        }
        if(match == 1){
            return true;
        }else{
            return false;
        }

    }



    public int smallest(int num1, int num2, int num3){
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
            }
        }
        return smallestNumber;
    }

    public boolean isPrime(int num){
        int zeros = 0;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                zeros++;
            }
        }
        if(zeros == 0){
            return true;
        }else{
            return false;
        }
    }
}
