package com.meesho.communication.consumer;

import com.meesho.communication.channel.SmsChannel;
import com.meesho.queue.model.QueueTopic;

public abstract class NonRealtimeSmsConsumer extends AbstractCommunicationConsumer {

	protected NonRealtimeSmsConsumer() {
		super(QueueTopic.SMS, QueueTopic.SMS, SmsChannel.getInstance());
	}

}
