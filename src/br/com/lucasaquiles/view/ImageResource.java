package br.com.lucasaquiles.view;

import br.com.lucasaquiles.widgets.R;

/**
 * 
 * @author lucasaquiles
 *
 */
public enum ImageResource {
	
	SMILE_1( "", R.drawable.mouth_1, FacePart.MOUTH),
	SMILE_2( "", R.drawable.mouth_2, FacePart.MOUTH),
	SMILE_3( "", R.drawable.mouth_3, FacePart.MOUTH),
	SMILE_4( "", R.drawable.mouth_4, FacePart.MOUTH),
	SMILE_5( "", R.drawable.mouth_5, FacePart.MOUTH),
	SMILE_6( "", R.drawable.mouth_6, FacePart.MOUTH),
	SMILE_7( "", R.drawable.mouth_7, FacePart.MOUTH),
	SMILE_8( "", R.drawable.mouth_8, FacePart.MOUTH),
	SMILE_9( "", R.drawable.mouth_9, FacePart.MOUTH),
	SMILE_10( "", R.drawable.mouth_10, FacePart.MOUTH),
	SMILE_11( "", R.drawable.mouth_11, FacePart.MOUTH),
	SMILE_12( "", R.drawable.mouth_12, FacePart.MOUTH),
	
	EYE_1( "", R.drawable.eye_1, FacePart.EYE),
	EYE_2( "", R.drawable.eye_2, FacePart.EYE),
	EYE_3( "", R.drawable.eye_3, FacePart.EYE),
	EYE_4( "", R.drawable.eye_4, FacePart.EYE),
	EYE_5( "", R.drawable.eye_5, FacePart.EYE),
	EYE_6( "", R.drawable.eye_6, FacePart.EYE),
	EYE_7( "", R.drawable.eye_7, FacePart.EYE),
	EYE_8( "", R.drawable.eye_8, FacePart.EYE),
	
	
	NOISE_1( "", R.drawable.noise_1, FacePart.NOISE),
	NOISE_2( "", R.drawable.noise_2, FacePart.NOISE),
	NOISE_3( "", R.drawable.noise_3, FacePart.NOISE),
	NOISE_4( "", R.drawable.noise_4, FacePart.NOISE),
	NOISE_5( "", R.drawable.noise_5, FacePart.NOISE),
	NOISE_6( "", R.drawable.noise_6, FacePart.NOISE),
	NOISE_7( "", R.drawable.noise_7, FacePart.NOISE),
	NOISE_8( "", R.drawable.noise_8, FacePart.NOISE),
	NOISE_9( "", R.drawable.noise_9, FacePart.NOISE),
	NOISE_10( "", R.drawable.noise_10, FacePart.NOISE),
	NOISE_11( "", R.drawable.noise_11, FacePart.NOISE),
	NOISE_12( "", R.drawable.noise_12, FacePart.NOISE),
	NOISE_13( "", R.drawable.noise_13, FacePart.NOISE),
	NOISE_14( "", R.drawable.noise_14, FacePart.NOISE),
	NOISE_15( "", R.drawable.noise_15, FacePart.NOISE),
	
	;
	
	private String description;
	private int resource;
	private FacePart part;
	
	ImageResource(String description, int resource, FacePart part){
	
		this.description = description;;
		this.resource = resource;
		this.part = part;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getResource() {
		return resource;
	}
	
	public FacePart getPart() {
		return part;
	}
}
