package main.java.com.visa.Occurre;

import main.java.com.visa.WordCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OccurreApplication {

    public static void main(String[] args) {

        WordCount wordCounts=new WordCount();
        String s1 ="    I love exploring new thing!";
      System.out.println(wordCounts.senetCount(s1) + " words.");
        ;

        ArrayList<String> list = new ArrayList<String>();
        list.add("Mahesh");
        list.add("Hewage");
        list.add("Mahesh");
        countWord(list);
    }

    public static void countWord(ArrayList<String> list)
    {

        Map<String, Integer> wlist = new HashMap<String, Integer>();

        for (String i : list) {
            Integer j = wlist.get(i);
            wlist.put(i, (j == null) ? 1 : j + 1);
        }


        for (Map.Entry<String, Integer> wlist2 : wlist.entrySet()) {
            System.out.println("Words " + wlist2.getKey() + " "
                    + "occurs"
                    + ": " + wlist2.getValue() );
        }
    }

}
