import java.util.*;


public class ListaEsimerkit {
	public static void main(String[] args){
		List<String> tekstiLista = new ArrayList<String>();
		
		tekstiLista.add("Teksti1");
		tekstiLista.add("nimi1");
		tekstiLista.add("nimi2");
		
		//Listalla on automaattisesti toString -metodi
		System.out.println(tekstiLista);
		
		String alkio = tekstiLista.get(0);
		System.out.println(alkio);
		
		//for -silmukalla listan läpikäyminen
		for(int i=0;i<tekstiLista.size();i++){
			System.out.println(tekstiLista.get(i));
		}
		
		//Muokataan listaa
		String muokattava;
		for(int i=0;i<tekstiLista.size();i++){
			muokattava = tekstiLista.get(i) + " lisäys";
			tekstiLista.set(i, muokattava);
		}
		
		//sama printtaus for each -rakenteella
		
		for(String osa:tekstiLista){
			System.out.println(osa);
		}
	}

}
