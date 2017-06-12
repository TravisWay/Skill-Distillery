package Jets;

public class Hangar {

	static Jet[] jets= new Jet[100];

	public Hangar(int size) {
		super();
		Jet[] jets = new Jet[size];
		setJets(jets);
	}

	public static void addJet(Jet j1) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = j1;
				break;

			}
		}

	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

}