import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class DoubletTekstitiedostona {

	public static List<Double> lueTiedostosta(String polku){
		List<Double> luvut=new ArrayList<Double>();
		Scanner tiedostolukija=null;
		
		try{
			tiedostolukija = new Scanner(new File(polku));
			while(tiedostolukija.hasNextDouble()){
				luvut.add(tiedostolukija.nextDouble());
			}
		}catch(FileNotFoundException fnfe){
			System.out.println("Tiedostoa ei ollut:"+fnfe);
		}finally{
			if(tiedostolukija!=null){
				tiedostolukija.close();
			}
		}
		return luvut;
	}
	
	public static void talletaTiedostoon(double[] taulukko, String polku){
		PrintWriter ulos = null;
		try{
			ulos = new PrintWriter(new File(polku));
			for(double luku:taulukko){
				ulos.format(Locale.getDefault(), "%,f%n", luku);
			}
			if(ulos.checkError()){
				System.out.println("Tiedostoon kirjoittamisessa oli virhe.");
			}
			
		}catch(IOException ioe){
			System.out.println("Tiedostovirhe"+ioe.getMessage());
		}finally{
			if(ulos!=null){
				ulos.close();
			}
		}
		
	}
	
	public static void main(String[] args){
		System.out.println(lueTiedostosta("lukuja.txt"));
		double[] lukuja = {2.4,4.6,2,66.7,23,45.666,34.555};
		talletaTiedostoon(lukuja,"testiluvut.txt");
	}
}
