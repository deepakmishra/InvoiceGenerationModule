package com.meesho.blob.model;

public class Blob {

	private final String id;
	private final Object blob;

	public Blob(String id, Object blob) {
		this.id = id;
		this.blob = blob;
	}

	public String getId() {
		return id;
	}

	public Object getBlob() {
		return blob;
	}

}
