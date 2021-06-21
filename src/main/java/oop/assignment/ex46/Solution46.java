package oop.assignment.ex46;
/*  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.*;
/*
->Read() object: r
->String str

-> get text from file using Read() class method: r.get_old_text()
->save this to "str"

->Frequency_Of_String_Words() object: o
->send "str" to o.count_freq() to find frequency of each word in the file

 */
public class Solution46
{
    public static void main(String[] args) throws IOException
    {
        Read r = new Read();
        String str = r.get_old_text();

        Frequency_Of_String_Words o = new Frequency_Of_String_Words();
        o.count_freq(str);
    }
}
