package br.com.lucasaquiles.widgets;

import java.io.Serializable;

public class ImageResource implements Serializable{
	
	private int resource;
	private String imageDescription;
	
	public ImageResource(int resource, String description){
		
		this.resource = resource;
		this.imageDescription = description;
	}
	
	
	
	public int getResource() {
		return resource;
	}



	public void setResource(int resource) {
		this.resource = resource;
	}



	public String getImageDescription() {
		return imageDescription;
	}



	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return imageDescription;
	}
}
