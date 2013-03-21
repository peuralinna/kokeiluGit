import java.io.*;
import java.util.Scanner;


public class TiedostoonKirjoitus {

	public static void main(String[] args){
		PrintWriter ulos=null;
		try{
			ulos = new PrintWriter(new File("testi.txt"));
			Scanner syote = new Scanner(System.in);
			String rivi;
			int rivinro=0;
			System.out.println("Kirjoita tiedostoon menevät rivit.\nOhjelma lopettaa kun kirjoitat x.\n");
			System.out.println(String.format("%4d", (++rivinro)));
			while(syote.hasNextLine()&& !ulos.checkError()){
				rivi=syote.nextLine();
				if(rivi.equalsIgnoreCase("x")){
					break;
				}
				ulos.println(rivi);
				System.out.println(String.format("%4d", (++rivinro)));
			}
			if(ulos.checkError()){
				System.err.println("Tiedoston kirjoituksessa tapahtui virhe");
			}
		}catch(Exception e){
			System.out.println("Virhe:"+e.getMessage());
		}finally{
			if(ulos!=null){
				ulos.close();
			}
		}
	}
}
