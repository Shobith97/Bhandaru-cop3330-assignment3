package oop.assignment.ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/*
-> ArrayList<String> fname, lname, money
-> int: count

-> get_firstnames()
   -> BufferedReader , String st to read each line from .txt
   -> while loop until end of file
   -> split st by space " "
   -> store st into "linearray" (index 0: lnme, index 1: fname, index 2: money)
   -> count = count + 1
   -> return fname

->get_lastnames()
   -> return lname

->get_salary()
   -> return money

->get_count()
   -> return count
 */
public class Read
{
    private ArrayList<String> fname = new ArrayList<String>();
    private ArrayList<String> lname = new ArrayList<String>();
    private ArrayList<String> money = new ArrayList<String>();
    private int count = 0;

    public ArrayList<String> get_firstnames() throws Exception
    {
        File file = new File("C:\\Users\\eyeyu\\Desktop\\OOPThree\\exercise42_input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        while ((st = br.readLine()) != null)
        {
            String[] linearray = st.split(",");
            lname.add(linearray[0]);
            fname.add(linearray[1]);
            money.add(linearray[2]);
            count++;
        }

        return fname;
    }
    public ArrayList<String> get_lastnames()
    {
        return lname;
    }
    public ArrayList<String> get_salary()
    {
        return money;
    }
    public int get_count()
    {
        return count;
    }

}
