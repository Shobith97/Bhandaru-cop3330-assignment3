package oop.assignment.ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.util.*;
import java.util.ArrayList;

/*
->Arraylist <String> names
->object of class Read()
-> int count
->Call getnames()
->Store returned Arraylist into "names"
->Call getcount()
->Store returned number of names into "count"
->sort "names"
->object of class Write()
->Call write_to_file(names,count)
*/

public class Solution41
{
    public static void main(String[] args) throws Exception
    {

        Read obj = new Read();
        ArrayList<String> names = new ArrayList<String>();
        names = obj.getnames();

        int count = obj.getcount();
        Collections.sort(names);

        Write w = new Write();
        w.write_to_file(names,count);


    }
}
