//This program prints all the alphabets between two characters in Java

public class StringPrintAlphabets {
    public static void main(String args[])
    {
        char c1 = 'c';
        char c2 = 'w';

        for(int i=c1;i<=c2;i++)
        {
            if(c1>='a' && c2<='z' || c1>='A' && c2<='Z')
            {
                System.out.print(i+" ");
            }
        }
    }
}