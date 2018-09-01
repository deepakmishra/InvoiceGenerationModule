package com.meesho.blob;

import java.util.UUID;

public class BlobIdGenerator {

	private static BlobIdGenerator instance;

	public static BlobIdGenerator getInstance() {
		return instance;
	}

	private BlobIdGenerator() {
		// TODO Auto-generated constructor stub
	}

	public String generateBlobId() {
		return UUID.randomUUID().toString();
	}
}
