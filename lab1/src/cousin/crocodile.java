package cousin;

import children.reptile;

public class crocodile extends reptile {

	public crocodile(int height, int weight, String animal_type, String blood_type, String skin_type, String backbone, String egg_type) {
		super(height, weight, animal_type, blood_type, skin_type, backbone, egg_type);
		// TODO Auto-generated constructor stub
//		this.feature = feature;
		this.egg_type = "Hard-shelled eggs";
	}
	public String showInfo() {
		return "crocodile [height = " + getHeight() + ", weight = " + getWeight() + ", animal-type = " + getAnimal_type() + ", blood-type = " + getBlood_type() + ", skin-type = " + getSkin_type() + ", backbone = " + getBackbone() + ", egg-type = " + getEgg_type();
	}

}
