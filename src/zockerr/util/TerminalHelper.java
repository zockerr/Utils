package zockerr.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * A class to help with various typical tasks used by command line programs
 * @author Marian Stein
 * 
 *
 */
public class TerminalHelper {
	/**
	 * Searches the command line args for -f path_to_file. If it is present, it returns a {@link java.io.FileInputStream}. 
	 * @param args command line args given to the program
	 * @return a {@link java.io.FileInputStream} or {@link System.in}, respectively
	 */
	public static InputStream getInputStream(String[] args){
		
		for(int i = 0; i<args.length-1; i++){
			if("-f".equals(args[i])){
				File f = new File(args[i+1]);
				if(f.exists()&&f.isFile())
					try {
						return new FileInputStream(f);
					} catch (FileNotFoundException e) {
						System.err.println("Something went horribly wrong!");
						e.printStackTrace();
					}
			}
		}
		
		return System.in;
	}
}
