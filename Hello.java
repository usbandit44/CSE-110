public class Hello
{
    public static void main(String[] args)
    {
        String text = "Java";
        String revesed = "";
        int q = text.length();
        for( int i = text.length() - 1; i >= 0; i--){
            revesed = revesed + text.substring(i, q);
            q--;
        }
        System.out.println(revesed);
    }
}