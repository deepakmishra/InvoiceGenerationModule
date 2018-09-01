package com.meesho.communication.consumer;

import com.meesho.blob.BlobStorage;
import com.meesho.communication.channel.EmailChannel;
import com.meesho.communication.model.EmailQueueObject;
import com.meesho.queue.model.QueueObject;
import com.meesho.queue.model.QueueTopic;

public abstract class EmailConsumer extends AbstractCommunicationConsumer {

	protected EmailConsumer(QueueTopic topic, QueueTopic topicSecond) {
		super(topic, topicSecond, EmailChannel.getInstance());
	}

	@Override
	protected boolean validate(QueueObject queueObject) {
		EmailQueueObject emailQueueObject = (EmailQueueObject) queueObject;
		if (emailQueueObject.getParameters().containsKey("blobId")) {
			return BlobStorage.getInstance().hasBlob(emailQueueObject.getParameters().get("blobId"));
		}
		return true;
	}

}
