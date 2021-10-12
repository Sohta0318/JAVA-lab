package cousin;

import children.fish;

public class eel extends fish {
	
	private String feature;

	public eel(int height, int weight, String animal_type, String blood_type, String habitat, Boolean gills,String feature) {
		super(height, weight, animal_type, blood_type, habitat,gills);
	
		this.feature = "Release electric charge";
	}
	
	public String getFeature() {
		return feature;
	}
	
	public String showInfo() {
		return "crocodile [height = " + getHeight() + ", weight = " + getWeight() + ", animal type = " + getAnimal_type() + ", blood type = " + getBlood_type() + ", habitat = " + getHabitat() + ", gills = " + isGills() + ", featuer = " + getFeature() ;
	}
	


}
