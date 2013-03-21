import java.util.*;
public class Lajittelu {
	public static void main(String[] args){
		
		List<Integer> lukulista=Arrays.asList(4,5,2,9,1,7,6,8,2,3);
		 
		for(int alkio:lukulista) {
		System.out.print(alkio+" ");
		}
		System.out.println();
		 
		Collections.sort(lukulista);
		 
		for(int alkio:lukulista) {
		System.out.print(alkio+" ");
		}
		System.out.println();
		
		Collections.shuffle(lukulista);
		System.out.println("Shuffle");
		for(int alkio:lukulista) {
			System.out.print(alkio+" ");
			}
			System.out.println();
		
			Collections.reverse(lukulista);
			System.out.println("Reverse");
			for(int alkio:lukulista) {
				System.out.print(alkio+" ");
				}
				System.out.println();
		
				Collections.swap(lukulista,0,9);
				System.out.println("Swap");
				for(int alkio:lukulista) {
					System.out.print(alkio+" ");
					}
					System.out.println();	
			

					int lukumaara =Collections.frequency(lukulista,2);
					System.out.println("Frequency");
					System.out.println("Listassa oli numeroa 2 "+lukumaara+"kpl");
					
					System.out.println();
					
	}
}
