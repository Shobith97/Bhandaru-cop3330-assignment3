package oop.assignment.ex44;
/*  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

/*
 ->JSONParser parser
 -> BufferedReader, JSONObject, JSONArray to read from input file
 -> JSON() class object "j"
 -> String product_name
 -> int flag = 0
 -> while loop until product found
    -> get "product_name" from JSON()
    -> get Iterator from JSON()
    -> while loop to check if "product_name" found in file
      ->if: found product
        ->print details from JSON()
        -> flag = 1
      ->else:
        ->print sorry from JSON()
 */
public class Solution44
{
    public static void main(String[] args)
    {

        JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader("exercise44_input.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray subjects = (JSONArray)jsonObject.get("products");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String product_name;
            int flag = 0;

            JSON j = new JSON(); //Class object

            while(flag == 0)
            {
                product_name = j.get_product_name(bufferedReader);
                Iterator iterator = j.get_iterator(subjects);

                while (iterator.hasNext())
                {

                    JSONObject json = (JSONObject) iterator.next();
                    String name = (String) json.get("name");

                    if (product_name.toLowerCase().equals(name.toLowerCase()))//if product found
                    {
                       flag = j.print_and_set_flag(json,name); //flag is set to 1
                    }
                }//loop checks every product name in file to that of the "user entered name"

                if (flag == 0)//not found then go again
                    j.print_sorry();

            }//loop runs until the product is found

        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
