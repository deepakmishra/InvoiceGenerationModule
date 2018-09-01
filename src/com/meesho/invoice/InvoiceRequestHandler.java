package com.meesho.invoice;

import com.meesho.blob.BlobIdGenerator;
import com.meesho.core.IRequestHandler;
import com.meesho.queue.IQueueManager;
import com.meesho.queue.QueueManager;
import com.meesho.queue.model.QueueObject;
import com.meesho.queue.model.QueueTopic;

public class InvoiceRequestHandler implements IRequestHandler {

	private static IRequestHandler instance = new InvoiceRequestHandler();

	private InvoiceRequestHandler() {
	}

	public static IRequestHandler getInstance() {
		return instance;
	}

	private IQueueManager queueManager = QueueManager.getInstance();

	@Override
	public Object postRequest(Object request) {
		QueueTopic queueTopic = QueueTopic.INVOICE;
		String blobId = BlobIdGenerator.getInstance().generateBlobId();
		QueueObject queueObject = getQueueObjectFromRequest(request, blobId);
		queueManager.putInQueue(queueTopic, queueObject);
		return null;
	}

	private QueueObject getQueueObjectFromRequest(Object request, String blobId) {
		// TODO
		return null;
	}

}
