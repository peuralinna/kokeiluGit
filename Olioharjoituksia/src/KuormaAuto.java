
public class KuormaAuto extends Auto2{
	int lasti;
	
	public KuormaAuto(String merkki,String malli,int vuosi, int lasti){
		super(merkki,malli,vuosi);
		this.lasti=lasti;
	}

	public int getLasti() {
		return lasti;
	}

	public void setLasti(int lasti) {
		this.lasti = lasti;
	}

	@Override
	public String toString() {
		return "KuormaAuto [lasti=" + lasti + ", merkki=" + merkki + ", malli="
				+ malli + ", vuosi=" + vuosi + "]";
	}
	
	
}
