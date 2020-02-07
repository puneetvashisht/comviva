package com.viva.iodemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CharRead
{
  public static void main( String args[])
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
		char c = (char)br.read();
		System.out.println(c);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   //Reading character
  }
}