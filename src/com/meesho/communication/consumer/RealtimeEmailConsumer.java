package com.meesho.communication.consumer;

import com.meesho.communication.channel.EmailChannel;
import com.meesho.queue.model.QueueTopic;

public abstract class RealtimeEmailConsumer extends AbstractCommunicationConsumer {

	protected RealtimeEmailConsumer() {
		super(QueueTopic.EMAIL_REALTIME, QueueTopic.EMAIL, EmailChannel.getInstance());
	}

}
