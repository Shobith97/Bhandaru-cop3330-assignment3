package oop.assignment.ex44;
/*  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.*;
import java.util.*;
import org.json.simple.*;
/*
 ->String input;
 ->int flag;

 ->get_product_name()
   ->prompt user for product name a.k.a "input"
   ->return input

 ->get_iterator()
   -> return iterator to main()

 ->print_and_set_flag()
    ->print details of product to be found
    ->flag = 1
    ->return flag

  ->print_sorry()
     ->print sorry message because product not found

 */

public class JSON
{
    private String input;
    private int flag;

    public String get_product_name(BufferedReader bufferedReader) throws IOException
    {
        System.out.print("What is the product name? ");
        input = bufferedReader.readLine();
        return input;
    }

    public Iterator get_iterator(JSONArray subjects)
    {
        Iterator iterator = subjects.iterator();
        return iterator;
    }

    public int print_and_set_flag(JSONObject json, String name)
    {
        System.out.println("Name: " + name);
        System.out.println("Price: " + json.get("price"));
        System.out.println("Quantity: " + json.get("quantity"));
        flag = 1;
        return flag;
    }

    public static void print_sorry()
    {
        System.out.println("Sorry, that product was not found in our inventory");
    }
}
