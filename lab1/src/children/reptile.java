package children;

import parent.Aniamal;

public class reptile extends Aniamal {

	private String feature;

	public reptile(int height, int weight, String animal_type, String blood_type, String feature) {
		super(height, weight, animal_type, blood_type);
		// TODO Auto-generated constructor stub
		this.feature = "Dry Skin\n"
				+ "\n"
				+ "Backbone\n"
				+ "\n"
				+ "Soft-shelled eggs";
	}

	public String getFeature() {
		return feature;
	}



}
