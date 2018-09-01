package com.meesho.communication.consumer;

import com.meesho.communication.channel.SmsChannel;
import com.meesho.queue.model.QueueTopic;

public abstract class RealtimeSmsConsumer extends AbstractCommunicationConsumer {

	protected RealtimeSmsConsumer() {
		super(QueueTopic.SMS_REALTIME, QueueTopic.SMS, SmsChannel.getInstance());
	}

}
