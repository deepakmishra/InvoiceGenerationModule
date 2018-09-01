package com.meesho.communication.model;

import java.util.Map;

import com.meesho.blob.BlobStorage;

public class EmailQueueObject extends CommunicationQueueObject {
	public EmailQueueObject(String templateIdSuccess, String templateIdFailure, Map<String, String> parameters) {
		super("email", templateIdSuccess, templateIdFailure, parameters);
	}

	@Override
	public boolean validateData() {
		return BlobStorage.getInstance().hasBlob(getParameters().get("blobId"));
	}
}
