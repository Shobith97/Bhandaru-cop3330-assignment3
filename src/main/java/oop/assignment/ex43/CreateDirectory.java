package oop.assignment.ex43;

/*  UCF COP3330 Summer 2021 Assignment 3 Solution
        *  Copyright 2021 Shobith Bandaru
        */

import java.io.*;
import java.util.Scanner;
/*
->String: currentPath
->boolean: websiteCreated

->set_path()
   -> currentPath: path of project directory from System
   -> currentPath: add siteName to path
   -> create new file using currentPath
   -> websiteCreated: y/n from system

->create_files()
   -> if: website folder created
      ->create "index.html" file
      ->write details to .html file
      ->if: user wants js
         -> create js folder
         -> check if js folder created
      ->if: user wants css
         -> create css folder
         -> check if css folder created

   -> else: website folder not created
      ->print msg
 */
public class CreateDirectory
{
    private String currentPath;
    boolean websiteCreated;

    public void set_path(String siteName, String author, char js, char css)
    {
        currentPath = System.getProperty("user.dir");
        currentPath += "\\" + siteName;
        File website = new File(currentPath);
        websiteCreated = website.mkdir();
    }

    public void create_files(String siteName, String author, char js, char css)
    {
        if(websiteCreated)
        {
            System.out.println("Created " + currentPath);
            try
            {
                FileWriter skeletonWriter = new FileWriter(new File(currentPath+"\\index.html"));
                skeletonWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                skeletonWriter.write("\t<meta author=\""+author+"\">\n");
                skeletonWriter.write("\t<title>"+siteName+"</title>\n");
                skeletonWriter.write("</head>\n<body>\n\n</body>\n</html>");
                skeletonWriter.close();

                System.out.println("Created " + currentPath+"\\index.html");

                if(js == 'y' || js == 'Y')
                {
                    File jsFolder = new File(currentPath+"\\js");
                    boolean jsCreated = jsFolder.mkdir();

                    if(jsCreated)
                    {
                        System.out.println("Created " + jsFolder+"\\");
                    }

                    else
                    {
                        System.out.println("Js folder not created!!");
                    }
                }

                if(css == 'y' || css == 'Y')
                {
                    File cssFolder = new File(currentPath+"\\css");
                    boolean cssCreated = cssFolder.mkdir();

                    if(cssCreated)
                    {
                        System.out.println("Created " + cssFolder+"\\");
                    }

                    else
                    {
                        System.out.println("CSS folder not created!!");
                    }
                }
            }
            catch(IOException e)
            {
                System.out.println("index.html not created as required!!");
            }
        }
        else
        {
            System.out.println("Website folder not created!!");
        }
    }


}
