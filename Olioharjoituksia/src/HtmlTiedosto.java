import java.io.*;


public class HtmlTiedosto {
	
	public static void kirjoitaHtmlTiedosto(String tiedostonNimi){
		PrintWriter tiedostoon = null;
		try{
			tiedostoon=new PrintWriter(new FileWriter(tiedostonNimi));
			tiedostoon.println("<html>");
			tiedostoon.println("<head>");
			tiedostoon.println("<title>Kokeilusivu javalla tehty</title>");
			tiedostoon.println("<body>");
			tiedostoon.println("<h1>Testi sivu</h1>");
			tiedostoon.println("<p>Tämä on sivun ensimmäinen tekstikappale.</p>");
			tiedostoon.println("</body>");
			tiedostoon.println("</head>");
			tiedostoon.println("</html>");
			
		}catch(IOException ioe){
			System.out.println("IOVirhe:"+ioe.getMessage());
		}finally{
			if(tiedostoon !=null){
				tiedostoon.close();
			}
		}
	}
	public static void main(String[] args){
		kirjoitaHtmlTiedosto("uusi.html");
	}
}
