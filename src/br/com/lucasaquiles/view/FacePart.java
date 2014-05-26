package br.com.lucasaquiles.view;

/**
 * 
 * @author lucasaquiles
 *
 */
public enum FacePart {
	
	MOUTH("mouth"),
	EYE("eye"),
	NOISE("noise")
	;
	
	private String partName;
	FacePart(String partName){
		this.partName = partName;
	}
	
	public String getPartName() {
		return partName;
	}
}
