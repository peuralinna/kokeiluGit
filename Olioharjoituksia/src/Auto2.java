/** Auto2-luokka. Tallentaa auton merkin, mallin ja vuosimallin.
* @author PEUVI
* @version 1.0
*/

public class Auto2 {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((malli == null) ? 0 : malli.hashCode());
		result = prime * result + ((merkki == null) ? 0 : merkki.hashCode());
		result = prime * result + vuosi;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto2 other = (Auto2) obj;
		if (malli == null) {
			if (other.malli != null)
				return false;
		} else if (!malli.equals(other.malli))
			return false;
		if (merkki == null) {
			if (other.merkki != null)
				return false;
		} else if (!merkki.equals(other.merkki))
			return false;
		if (vuosi != other.vuosi)
			return false;
		return true;
	}

	protected String merkki;
	protected String malli;
	protected int vuosi;

	/**Luo uuden Auto2-olion. Esimerkiksi
	* <pre>Auto2 eka=new Auto2("Saab", "900",2000);
	* </pre>
	* @param merkki auton merkki. Esim. <code>Saab</code>
	* @param malli auton malli. Esim <code>900</code>
	* @param vuosi auton vuosimallimalli. Esim <code>2000</code>
	*/

	public Auto2(){
		this.merkki="";
		this.malli="";
		this.vuosi=0;
	}
	public Auto2(String merkki,String malli,int vuosi){
		this.merkki=merkki;
		this.malli=malli;
		this.vuosi=vuosi;
	}

	/**Palauttaa auton merkin.
	* <pre>String merkki=eka.getMerkki();
	* </pre>
	* @return auton merkki
	*/

	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMalli() {
		return malli;
	}

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public int getVuosi() {
		return vuosi;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}

	@Override
	public String toString() {
		return "Auto2 [merkki=" + merkki + ", malli=" + malli + ", vuosi="
				+ vuosi + "]";
	}
	
	

}
