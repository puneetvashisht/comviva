package com.viva.iodemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyInput
{
  public static void main(String[] args)
  {
    String text;
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    try {
		text = br.readLine();
		System.out.println(text);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    //Reading String
    
  }
}