package com.meesho.communication.consumer;

import com.meesho.communication.channel.IChannel;
import com.meesho.communication.channel.model.IChannelObject;
import com.meesho.queue.IQueueManager;
import com.meesho.queue.QueueManager;
import com.meesho.queue.consumer.IConsumer;
import com.meesho.queue.model.QueueObject;
import com.meesho.queue.model.QueueTopic;

public abstract class AbstractCommunicationConsumer implements IConsumer {

	protected final QueueTopic topic;
	protected final QueueTopic topicSecond;
	protected final IChannel channel;

	protected AbstractCommunicationConsumer(QueueTopic topic, QueueTopic topicSecond, IChannel channel) {
		this.topic = topic;
		this.channel = channel;
		this.topicSecond = topicSecond;
	}

	@Override
	public void consume() {
		IQueueManager queueManager = QueueManager.getInstance();
		QueueObject queueObject = queueManager.pollFromQueue(topic);
		if (queueObject.validateData()) {
			IChannelObject channelObject = getChannelObject(queueObject);
			boolean success = channel.submit(channelObject);
			if (!success) {
				queueManager.putInQueue(topicSecond, queueObject);
			}
		}
	}

	private IChannelObject getChannelObject(QueueObject object) {
		return null;
	}

}
