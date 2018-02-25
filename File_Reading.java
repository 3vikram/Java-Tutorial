import java.io.*;

public class File_Reading {

	public static void main(String[] args) {
		File file = new File("test.txtd");
		BufferedReader br = null;
		FileReader fr;
		try {
			fr = new FileReader(file); // to read the file contents
			br = new BufferedReader(fr); // to buffer the file contents
			String read_line;
			while ( (read_line = br.readLine()) != null ) { // reading contents of file line by line and validating against null
				System.out.println(read_line); // print line by line
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("Unable to read file");
		}
		finally {
			try {
				br.close();
			} catch (IOException e) { 
				System.out.println("File Not Closed");
			}
			catch (NullPointerException e) {
				System.out.println("Ohh! Something went wrong");
			}
		}
	}

}
