package com.meesho.communication.consumer;

import com.meesho.queue.model.QueueTopic;

public class RealtimeSmsConsumer extends SmsConsumer {

	protected RealtimeSmsConsumer() {
		super(QueueTopic.SMS_REALTIME, QueueTopic.SMS);
	}

}
