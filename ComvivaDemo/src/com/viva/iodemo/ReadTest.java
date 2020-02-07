package com.viva.iodemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ReadTest
{
  public static void main(String[] args)
  {
    try
    {
      File fl = new File("myfile.txt");
      BufferedReader br = new BufferedReader(new FileReader(fl)) ;
      String str;
      while ((str=br.readLine())!=null)
      {
        System.out.println(str);
      }	
      br.close();
//      fl.close();
    }
    catch(IOException  e) { 
      e.printStackTrace(); 
    }
  }
}
