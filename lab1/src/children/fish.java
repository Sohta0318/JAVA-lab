package children;

import parent.Aniamal;

public class fish extends Aniamal {
	protected String habitat;
	protected boolean gills;
	

	public fish(int height, int weight, String animal_type, String blood_type, String habitat, Boolean gills) {
		super(height, weight, animal_type, blood_type);
		// TODO Auto-generated constructor stub
		this.habitat = "water";
		this.gills = true;
	}


	public String getHabitat() {
		return habitat;
	}

	public boolean isGills() {
		return gills;
	}

	

}




