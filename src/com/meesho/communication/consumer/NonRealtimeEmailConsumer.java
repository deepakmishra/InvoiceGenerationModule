package com.meesho.communication.consumer;

import com.meesho.queue.model.QueueTopic;

public class NonRealtimeEmailConsumer extends EmailConsumer {

	protected NonRealtimeEmailConsumer() {
		super(QueueTopic.EMAIL, QueueTopic.EMAIL);
	}

}
