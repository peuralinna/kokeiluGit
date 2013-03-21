import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TiedostonScannaus {

	public static void tulosta(String tiedostonNimi) {
		Scanner tiedostonlukija = null;

		try {
			tiedostonlukija = new Scanner(new File(tiedostonNimi));
			while(tiedostonlukija.hasNextLine()){
				System.out.println(tiedostonlukija.nextLine());
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("Tiedostoa ei löydy."+fnfe.getMessage());
		} finally{
			if(tiedostonlukija!=null){
				tiedostonlukija.close();
			}
		}
	}
	
	public static void main(String[] args){
		String nimi="";
		nimi = JOptionPane.showInputDialog("Anna tiedoston nimi.");
		tulosta(nimi);
	}
}
