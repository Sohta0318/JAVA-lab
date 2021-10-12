package children;

import parent.Aniamal;

public class birds extends Aniamal {
	private String feature;

	public birds(int height, int weight, String animal_type, String blood_type, String feature) {
		super(height, weight, animal_type, blood_type);
		// TODO Auto-generated constructor stub
		this.feature = "Animals with feathers\n"
				+ "\n"
				+ "Can fly" ;
	}

	public String getFeature() {
		return feature;
	}

	

}
