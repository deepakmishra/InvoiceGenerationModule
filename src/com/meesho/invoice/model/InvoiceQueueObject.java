package com.meesho.invoice.model;

import java.util.Map;

import com.meesho.queue.model.QueueObject;

public class InvoiceQueueObject extends QueueObject {

	private final String blobId;
	private final int templateId;
	private final Map<String, String> parameters;

	public InvoiceQueueObject(String blobId, int templateId, Map<String, String> parameters) {
		this.blobId = blobId;
		this.templateId = templateId;
		this.parameters = parameters;
	}

	public String getBlobId() {
		return blobId;
	}

	@Override
	public boolean validateData() {
		return true;
	}

	public int getTemplateId() {
		return templateId;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

}
