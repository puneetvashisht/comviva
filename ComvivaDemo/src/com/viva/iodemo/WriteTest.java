package com.viva.iodemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class WriteTest {
	public static void main(String[] args) {
		try {
			File fl = new File("test/myfile.txt");
			String str = "Write this string to my file";
			FileWriter fw = new FileWriter(fl);
			fw.write(str);
			fw.close();
//			fl.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}