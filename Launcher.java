package ReadCsv;

import java.io.File;

import java.io.IOException;
import java.util.List;

/*
 * initialisation du launcher
 */

public class Launcher {

	public static void main(String[] args) throws IOException {
		Datareader file = new ReadCsv();
		File f = file.getfile("Readcsv.csv");
		List<String[]> data = file.getdata(f);
		System.out.println("Il y a " + data.size() + " lignes");
		System.out.println("Il y a " + data.get(0).length + " colonnes dans la 1er lignes");
		file.display(data);
		}

}
