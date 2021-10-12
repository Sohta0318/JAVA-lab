package children;

import parent.Aniamal;

public class birds extends Aniamal {
	protected boolean fly;

	public birds(int height, int weight, String animal_type, String blood_type, Boolean fly) {
		super(height, weight, animal_type, blood_type);
		// TODO Auto-generated constructor stub
		this.fly = true;
	}

	

	public boolean isFly() {
		return fly;
	}

	

}
