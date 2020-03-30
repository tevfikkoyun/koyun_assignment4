import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {

	Map<String, Integer> wordCounter = new HashMap<>();
	
public void count (String dataFile){
	File file = new File(dataFile);
		try(Scanner in = new Scanner(file);){
			if(in.hasNextLine() == false){
				throw new IOException("Invalid directory");
				}
			while(in.hasNextLine()){
				String input = in.next();
				if(wordCounter.containsKey(input.toLowerCase())){
					int value = wordCounter.get(input.toLowerCase());
					value++;
					wordCounter.put(input.toLowerCase(), value);
				}
				else{
					wordCounter.put(input.toLowerCase(), 1);
				}
			}
		}
		catch(IOException xe){
			System.err.printf("No data found at that directory or directory doesnt exist");
		}	
	}
	public void write(String outputFile)
	{
		File myFile = new File("unique_words_count.txt");
		try (FileWriter writer  = new FileWriter("unique_words_count.txt", true);){
				myFile.createNewFile();//Creates new file if needed
				writer.write(wordCounter.toString());

			}
		catch(IOException xe){
			System.err.printf("data could not be written to that directory");
		}
	}
}

