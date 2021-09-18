package main.java.com.visa;

public class WordCount {

    public static int senetCount(String s)
    {
        int count=0;

        char ch[]= new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }
}
