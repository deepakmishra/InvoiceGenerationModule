package com.meesho.queue;

import com.meesho.queue.model.QueueObject;
import com.meesho.queue.model.QueueTopic;

public interface IQueueManager {

	void putInQueue(QueueTopic queueTopic, QueueObject queueObject);

	QueueObject pollFromQueue(QueueTopic queueTopic);

}
