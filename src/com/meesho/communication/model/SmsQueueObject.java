package com.meesho.communication.model;

import java.util.Map;

public class SmsQueueObject extends CommunicationQueueObject {
	public SmsQueueObject(String templateIdSuccess, String templateIdFailure, Map<String, String> parameters) {
		super("sms", templateIdSuccess, templateIdFailure, parameters);
	}

	@Override
	public boolean validateData() {
		return true;
	}
}
