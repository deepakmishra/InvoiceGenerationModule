package com.meesho.communication.model;

import java.util.Map;

public class EmailQueueObject extends CommunicationQueueObject {
	public EmailQueueObject(String templateIdSuccess, String templateIdFailure, Map<String, String> parameters) {
		super("email", templateIdSuccess, templateIdFailure, parameters);
	}

	@Override
	public boolean validateData() {
		// TODO :: Validate email id, subject, etc
		return true;
	}
}
