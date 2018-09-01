package com.meesho.communication.model;

import java.util.Map;

public abstract class CommunicationQueueObject extends com.meesho.queue.model.QueueObject{
	protected String type;
	private final String templateIdSuccess;
	private final String templateIdFailure;
	private final Map<String, String> parameters;

	protected CommunicationQueueObject(String type, String templateIdSuccess, String templateIdFailure, Map<String, String> parameters) {
		this.type = type;
		this.templateIdSuccess = templateIdSuccess;
		this.templateIdFailure = templateIdFailure;
		this.parameters = parameters;
	}

	public String getType() {
		return type;
	}

	public void setTopic(String type) {
		this.type = type;
	}

	public String getTemplateIdSuccess() {
		return templateIdSuccess;
	}

	public String getTemplateIdFailure() {
		return templateIdFailure;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}
}
