package com.meesho.invoice.consumer;

import com.meesho.invoice.generator.InvoiceGenerator;
import com.meesho.invoice.model.InvoiceQueueObject;
import com.meesho.queue.IQueueManager;
import com.meesho.queue.QueueManager;
import com.meesho.queue.consumer.IConsumer;
import com.meesho.queue.model.QueueTopic;

public class AbstractInvoiceConsumer implements IConsumer {
	protected final QueueTopic topic;
	protected final QueueTopic topicSecond;

	protected AbstractInvoiceConsumer(QueueTopic topic, QueueTopic topicSecond) {
		this.topic = topic;
		this.topicSecond = topicSecond;
	}

	@Override
	public void consume() {
		IQueueManager queueManager = QueueManager.getInstance();
		InvoiceQueueObject queueObject = (InvoiceQueueObject) queueManager.pollFromQueue(topic);

		boolean success = InvoiceGenerator.getInstance().generateInvoice(queueObject.getBlobId(), queueObject.getTemplateId(),
				queueObject.getParameters());
		if (!success) {
			queueManager.putInQueue(topicSecond, queueObject);
		}
	}

}
