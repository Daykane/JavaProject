package ReadCsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv implements Datareader {
	
	
	private final char SEPARATOR =';';	
	private List<String> lines;
	private List<String[]> data;
	
	public ReadCsv(){
		super();
	}
	
	private List<String> readLines(File f) throws IOException{
		List<String> result = new ArrayList<String>();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		for (String line = br.readLine(); line != null ; line=br.readLine()){
				result.add(line);
		}
		
		br.close();
		fr.close();
		return result;
	}
		
	public List<String[]> getdata(File f) throws IOException{
		this.lines = this.readLines(f);
		data = new ArrayList<String []>(lines.size());
		String sep = new Character(SEPARATOR).toString();
		for (String line : lines){
			String[] oneline = line.split(sep);
			data.add(oneline);
		}
		return data;
	}


	public File getfile(String fileToRead) {
		String nameFile = fileToRead;
		File f = new File(nameFile);
		return f;
	}

	public void display(List<String[]> data) {
		for (int i = 0 ; i< data.size() ; i++ ){
			for(int j =0 ; j < data.get(i).length ; j++ ){
				System.out.print("| " + data.get(i)[j]+ " ");
			}
			System.out.println("|");
		}
	}
}
