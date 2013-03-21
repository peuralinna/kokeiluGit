
public class LinjaAuto extends Auto2 {
	private int paikkamaara;
	private String yhtio;
	
	public LinjaAuto(String merkki,String malli,int vuosi,int paikkamaara,String yhtio){
		super(merkki,malli,vuosi);
		this.paikkamaara=paikkamaara;
		this.yhtio=yhtio;
	}

	public int getPaikkamaara() {
		return paikkamaara;
	}

	public void setPaikkamaara(int paikkamaara) {
		this.paikkamaara = paikkamaara;
	}

	public String getYhtio() {
		return yhtio;
	}

	public void setYhtio(String yhtio) {
		this.yhtio = yhtio;
	}
	public String toString(){
		return super.toString()+" paikkoja:"+paikkamaara+", yhtiö:"+yhtio;
	}
}
