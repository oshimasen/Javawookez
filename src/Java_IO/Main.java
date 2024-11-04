package Java_IO;
import java.util.Scanner;
//import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.io.ObjectOutputStream;
import java.io.PrintWriter;


public class Main {
	public static void main(String[]args)   {
		
		File file = new File("D:\\ACTION\\Java exercises\\notepad.txt");
		
		
		
//		try {
//		ObjectOutputStream obj = new ObjectOutputStream();
//		}
		
		
		try {
			FileWriter writer = new FileWriter(file, true);
			FileReader reader = new FileReader(file);
			Scanner scanner = new Scanner(file);
			PrintWriter print = new PrintWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			
			print.println("dafafadfafasfa\n");
			print.append("fadfafasfa\n");
			print.flush();
//			writer.flush();
			writer.write("halu madamada\n");
			writer.write("halu madamadaf\n");
			writer.flush();
			
			bw.write("hello pelepens");
			bw.newLine();
			bw.flush();
			
			
			
			
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}






//File f =  new File("D:\\ACTION\\Java exercises\\file.txt");
//
//Scanner scanner = null;
//try {
//	scanner = new Scanner(f);
//} catch (FileNotFoundException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//FileWriter fw = null;
//try {
//	fw = new FileWriter(f);
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//
//FileReader fr = null;
//try {
//	fr = new FileReader(f);
//} catch (FileNotFoundException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//
//try {
//	fw.write("HELLO");
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//try {
//	fw.flush();
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//
//BufferedReader br = new BufferedReader(fr);
//
//while(scanner.hasNextLine()) {
//	System.out.println(scanner.nextLine());
//}