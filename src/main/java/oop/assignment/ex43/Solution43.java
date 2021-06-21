package oop.assignment.ex43;
/*  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.io.*;
import java.util.Scanner;

/*
->String author, siteName
->char js, css
->new Read() object
->get author and siteName from Read()
->get js and css from Read()

->New CreateDirectory() object: cd
->set path from cd.set_path() method
->create file directory using cd.create_files() method

 */

public class Solution43
{
    public static void main(String[] args)
    {

        String author, siteName;
        char js = 'N';
        char css = 'N';

        Read r = new Read();
        siteName = r.get_sitename();
        author = r.get_author();
        js = r.ask_for_js();
        css = r.ask_for_css();

        CreateDirectory cd = new CreateDirectory();
        cd.set_path(siteName,author,js,css);
        cd.create_files(siteName,author,js,css);

    }
}
