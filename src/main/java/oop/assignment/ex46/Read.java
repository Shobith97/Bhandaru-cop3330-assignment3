package oop.assignment.ex46;
/*  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.*;
/*
->String line = "", oldtext = ""

->get_old_text()
   -> Read "line" from file (BufferedReader) : while looped until end of file
   -> append "line" to "oldtext"
   -> return oldtext

 */
public class Read
{
    private String line = "", oldtext = "";

    public String get_old_text() throws IOException
    {
        File file = new File("C:\\Users\\eyeyu\\Desktop\\OOPThree\\exercise46_input.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while((line = reader.readLine()) != null)
        {
            oldtext += line;
        }
        reader.close();
        return oldtext;
    }
}
