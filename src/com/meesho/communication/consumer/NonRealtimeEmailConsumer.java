package com.meesho.communication.consumer;

import com.meesho.communication.channel.EmailChannel;
import com.meesho.queue.model.QueueTopic;

public abstract class NonRealtimeEmailConsumer extends AbstractCommunicationConsumer {

	protected NonRealtimeEmailConsumer() {
		super(QueueTopic.EMAIL, QueueTopic.EMAIL, EmailChannel.getInstance());
	}

}
