package oop.assignment.ex42;

import java.util.ArrayList;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */

/*
-> ArrayList<String> firstnames, lastnames, salary
-> Use Read() class to get the data for above lists
-> Get "count" from Read()
-> For loop to print every persons details
    -> "x": space between last and first
    -> "y": Space between first and salary
    -> use this spaces to align and print details
 */
public class Solution42
{
    public static void main(String[] args) throws Exception
{

    Read obj = new Read();
    ArrayList<String> firstnames = new ArrayList<String>();
    firstnames = obj.get_firstnames();

    ArrayList<String> lastnames = new ArrayList<String>();
    lastnames = obj.get_lastnames();

    ArrayList<String> salary = new ArrayList<String>();
    salary = obj.get_salary();

    int count = obj.get_count();

    System.out.println("Last      First     Salary");
    System.out.println("--------------------------");
    for(int i = 0 ; i < count ; i++)
    {
        int x = 10 - lastnames.get(i).length();
        int y = 11 - firstnames.get(i).length();

        String space1="";
        String space2="";

        for(int j = 0 ; j < x ; j++)
        {
            space1 += " ";
        }

        for(int j = 0 ; j < y ; j++)
        {
            space2 += " ";
        }

        System.out.printf("%s%s%s%s%s\r\n", lastnames.get(i), space1, firstnames.get(i), space2, salary.get(i));
    }

}

}
