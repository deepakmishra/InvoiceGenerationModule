package com.meesho.communication.consumer;

import com.meesho.queue.model.QueueTopic;

public class RealtimeEmailConsumer extends EmailConsumer {

	protected RealtimeEmailConsumer() {
		super(QueueTopic.EMAIL_REALTIME, QueueTopic.EMAIL);
	}

}
