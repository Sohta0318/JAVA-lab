package children;

import parent.Aniamal;

public class fish extends Aniamal {
	private String feature;
	

	public fish(int height, int weight, String animal_type, String blood_type, String feature) {
		super(height, weight, animal_type, blood_type);
		// TODO Auto-generated constructor stub
		this.feature = "Live in water\n"
				+ "\n"
				+ "Has gills";
	}

	public String getFeature() {
		return feature;
	}

	

}




