package oop.assignment.ex46;
/*  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */

import java.util.Map;
import java.util.TreeMap;
/*
-> count_freq()
   ->Hash Map : mp
   ->split "str" into words using space " "
   ->save these words into String arr[]

   ->for loop in arr[] (int i)
     ->if: "mp" contains arr[i]
         -> add arr[i] to "mp" along with freq = freq + 1
     ->else:
         -> put arr[i] to "mp" with freq = 1

   ->for loop in "mp" Hash Map
     ->print word
      -> for loop (as number of times as frequency)
         ->print star
      ->print newline

 */

public class Frequency_Of_String_Words
{
    public static void count_freq(String str)
    {
        Map<String,Integer> mp = new TreeMap<>();

        String arr[] = str.split(" ");


        for(int i = 0; i < arr.length; i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        for(Map.Entry<String,Integer> entry: mp.entrySet())
        {
            System.out.print(entry.getKey() + " - ");

            for (int i = 0; i < entry.getValue(); ++i)
            {
                System.out.print("*");
            }

            System.out.print("\r\n");
        }
    }

}
