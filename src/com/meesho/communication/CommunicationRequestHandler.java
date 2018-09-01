package com.meesho.communication;

import com.meesho.core.IRequestHandler;
import com.meesho.queue.IQueueManager;
import com.meesho.queue.QueueManager;
import com.meesho.queue.model.QueueObject;
import com.meesho.queue.model.QueueTopic;

public class CommunicationRequestHandler implements IRequestHandler {

	private static IRequestHandler instance = new CommunicationRequestHandler();

	private CommunicationRequestHandler() {
	}

	public static IRequestHandler getInstance() {
		return instance;
	}

	private IQueueManager queueManager = QueueManager.getInstance();

	@Override
	public Object postRequest(Object request) {
		QueueTopic queueTopic = getTopicFromRequest(request);
		QueueObject queueObject = getQueueObjectFromRequest(request);
		queueManager.putInQueue(queueTopic, queueObject);
		return null;
	}

	private QueueTopic getTopicFromRequest(Object request) {
		// TODO
		return QueueTopic.EMAIL_REALTIME;
	}

	private QueueObject getQueueObjectFromRequest(Object request) {
		// TODO
		return null;
	}

}
