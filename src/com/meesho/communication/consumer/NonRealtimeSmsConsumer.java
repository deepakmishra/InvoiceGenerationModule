package com.meesho.communication.consumer;

import com.meesho.queue.model.QueueTopic;

public class NonRealtimeSmsConsumer extends SmsConsumer {

	protected NonRealtimeSmsConsumer() {
		super(QueueTopic.SMS, QueueTopic.SMS);
	}

}
