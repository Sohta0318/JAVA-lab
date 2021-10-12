package children;

import parent.Aniamal;

public class reptile extends Aniamal {

	protected String skin_type;
	protected String backbone;
	protected String egg_type;
	
	

	public reptile(int height, int weight, String animal_type, String blood_type, String skin_type, String backbone, String egg_type) {
		super(height, weight, animal_type, blood_type);
		// TODO Auto-generated constructor stub
		this.skin_type = "Dry Skin";
		this.backbone = "Vertebrate";
		this.egg_type = "Soft-shelled eggs";
	}



	public String getSkin_type() {
		return skin_type;
	}



	public String getBackbone() {
		return backbone;
	}



	public String getEgg_type() {
		return egg_type;
	}





}
