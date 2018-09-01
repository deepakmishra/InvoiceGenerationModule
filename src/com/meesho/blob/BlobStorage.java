package com.meesho.blob;

import java.util.HashMap;
import java.util.Map;

import com.meesho.blob.model.Blob;

public class BlobStorage {

	private Map<String, Blob> blobMap = new HashMap<>();

	private static BlobStorage instance;

	public static BlobStorage getInstance() {
		return instance;
	}

	private BlobStorage() {
		// TODO Auto-generated constructor stub
	}

	public boolean hasBlob(String blobId) {
		return blobMap.containsKey(blobId);
	}

	public Blob getBlob(String blobId) {
		return blobMap.get(blobId);
	}

	public boolean putBlog(String blobId, Object blob) {
		blobMap.put(blobId, new Blob(blobId, blob));
		return true;
	}

}
