package com.meesho.communication.consumer;

import com.meesho.communication.channel.EmailChannel;
import com.meesho.queue.model.QueueObject;
import com.meesho.queue.model.QueueTopic;

public abstract class SmsConsumer extends AbstractCommunicationConsumer {

	protected SmsConsumer(QueueTopic topic, QueueTopic topicSecond) {
		super(topic, topicSecond, EmailChannel.getInstance());
	}

	@Override
	protected boolean validate(QueueObject queueObject) {
		return true;
	}

}
