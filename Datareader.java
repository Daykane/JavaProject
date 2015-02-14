package ReadCsv;

import java.io.File;
import java.io.IOException;
import java.util.List;


public interface Datareader {
	// Recuperation du fichier a traiter
	File getfile(String namefile);
	/*
	 * Extraction de la data
	 * Liste de tableau, un tableau = une ligne de la data
	 * Taille du tableau = nombre de colonnes de la data
	 * Longueur de la liste = nombre de lignes de la data
	 */
	List<String[]> getdata(File f) throws IOException;
	public abstract void display(List<String[]> data);
}
