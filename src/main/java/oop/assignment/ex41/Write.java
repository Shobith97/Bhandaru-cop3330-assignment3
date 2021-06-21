package oop.assignment.ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
->write_to_file(namelist,count)
   ->Try
      -> open output file "exercise41_output.txt"
      -> write "count" to file
      -> for loop
         -> write each name from "namelist" to file
      -> File successfull
      -> Close File

    ->Catch
       -> File not successfull

 */
public class Write
{
    public static void write_to_file(ArrayList<String> namelist, int count) throws Exception
    {

        try {

            BufferedWriter f_writer = new BufferedWriter(new FileWriter("C:\\Users\\eyeyu\\Desktop\\OOPThree\\exercise41_output.txt"));
            String newline = "\r\n";
            String ct = Integer.toString(count);
            String firstline = "Total of "+ ct +" names \r\n";
            f_writer.write(firstline);
            f_writer.write("----------------- \r\n");

            for(String counter: namelist){
                System.out.println(counter);
                f_writer.write(counter);
                f_writer.write(newline);
            }

            System.out.print("File is created successfully with the content.");
            f_writer.close();
        }

        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
