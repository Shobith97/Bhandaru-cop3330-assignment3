package oop.assignment.ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/*
-> getnames()
   -> open input file "exercise41_input.txt"
   -> Arraylist <String> namelist
   -> String st : Store each name
   -> read "st" in while loop until end of file
   -> add "st" to "namelist"
   -> return namelist

-> getcount()
   -> open input file "exercise41_input.txt"
   -> Int count = 0 : to store the number of names
   -> String st : Store each name
   -> read "st" in while loop until end of file
   -> count = count + 1 for each loop iteration
   -> return count
 */

public class Read
{

    public static ArrayList<String> getnames() throws Exception
    {
        File file = new File("C:\\Users\\eyeyu\\Desktop\\OOPThree\\exercise41_input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        ArrayList<String> namelist = new ArrayList<String>();
        while ((st = br.readLine()) != null)
        {
            namelist.add(st);
        }

        return namelist;
    }

    public static int  getcount()throws Exception
    {
        File file = new File("C:\\Users\\eyeyu\\Desktop\\OOPThree\\exercise41_input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int count = 0;
        while ((st = br.readLine()) != null)
        {
            count++;
        }

        return count;
    }

}
