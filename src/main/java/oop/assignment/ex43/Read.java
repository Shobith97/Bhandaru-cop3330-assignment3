package oop.assignment.ex43;
/*  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shobith Bandaru
 */
import java.util.Scanner;

/*
->String author, site
->char js, css
->get_sitename() , get_author(), ask_for_js(), and ask_for_css()
  -> user enters data for site, author, js, and css respectively
  -> these values returned to main()
 */
public class Read
{
    Scanner input = new Scanner(System.in);
    private String author, site;
    private char js = 'N';
    private char css = 'N';

    public String get_sitename()
    {
        System.out.print("Site name: ");
        site = input.nextLine();
        return site;
    }

    public String get_author()
    {
        System.out.print("Author: ");
        author = input.nextLine();
        return author;
    }

    public char ask_for_js()
    {
        System.out.print("Do you want a folder for JavaScript? ");
        js = input.next().charAt(0);
        return js;
    }

    public char ask_for_css()
    {
        System.out.print("Do you want a folder for CSS? ");
        css = input.next().charAt(0);
        return css;
    }

}
