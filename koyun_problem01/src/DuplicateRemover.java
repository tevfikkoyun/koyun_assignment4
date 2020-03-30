import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;

public class DuplicateRemover {

Set<String> uniqueWords = new HashSet<String>();
	
public void remove(String dataFile) {
	File file = new File(dataFile);
		try(Scanner in = new Scanner(file);){
			if(in.hasNextLine() == false){
				throw new IOException("Invalid directory");
				}
			while(in.hasNextLine()){
				uniqueWords.add((in.nextLine().toLowerCase()));
			}
		}
		
		catch(IOException xe){
			System.err.printf("No data found at that directory or directory doesnt exist");
		}			

	}
	public void write(String outputFile){
		
		File myFile = new File("unique_words.txt");
		try (FileWriter writer  = new FileWriter("unique_words.txt", true);){
			
				myFile.createNewFile();
				writer.write(uniqueWords.toString());

			}
		catch(IOException xe){
			
			System.err.printf("data could not be written to that directory");
			
		}
	}
}

