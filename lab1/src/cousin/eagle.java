package cousin;

import children.birds;

public class eagle extends birds {

	public eagle(int height, int weight, String animal_type, String blood_type, Boolean fly) {
		super(height, weight, animal_type, blood_type, fly);
		// TODO Auto-generated constructor stub
	}
	public String showInfo() {
		return "crocodile [height = " + getHeight() + ", weight = " + getWeight() + ", animal type = " + getAnimal_type() + ", blood type = " + getBlood_type() + ", fly = " + isFly();
	}


}
