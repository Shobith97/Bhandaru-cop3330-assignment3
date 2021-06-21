package oop.assignment.ex45;
/*  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.*;
/*
->String line = "", oldtext = ""
->String replaced

->get_old_text()
   -> Read each line from file (BufferedReader) : while looped until end of file
   -> save this to oldtext
   -> append newline to oldtext
   -> return oldtext

->get_replaced_text()
    -> use replaceAll() to replace "utilize" with "use"  from oldtext
    -> save this to replaced
    -> return replaced
 */
public class Read
{
    private String line = "", oldtext = "";
    private String replaced;

    public String get_old_text() throws IOException
    {
        File file = new File("C:\\Users\\eyeyu\\Desktop\\OOPThree\\exercise45_input.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while((line = reader.readLine()) != null)
        {
            oldtext += line + "\r\n";
        }
        reader.close();
        return oldtext;
    }

    public String get_replaced_text(String word)
    {
        replaced  = oldtext.replaceAll("utilize", "" + word);
        return replaced;
    }
}
