package oop.assignment.ex45;
/*  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.*;
/*
->open_file()
  ->get "name" from main()
  ->append ".txt" to name
  ->Uee FileOutputStream for "name" to create output file with that name
  ->convert "replacedtext" to bytes
  ->write "replacedtext" to output file
  ->close file
 */
public class Write
{
    public void open_file(String name, String replacedtext) throws IOException
    {
        name += ".txt";
        FileOutputStream outputStream = new FileOutputStream(name);
        byte[] strToBytes = replacedtext.getBytes();

        outputStream.write(strToBytes);
        outputStream.close();
    }

}
