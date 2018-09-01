package com.meesho.queue;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

import com.meesho.queue.model.QueueObject;
import com.meesho.queue.model.QueueTopic;

public class QueueManager implements IQueueManager {
	private Map<QueueTopic, Queue<QueueObject>> topicQueue = new ConcurrentHashMap<>();

	private static IQueueManager instance = new QueueManager();

	public static IQueueManager getInstance() {
		return instance;
	}

	private QueueManager() {
		for (QueueTopic topic : QueueTopic.values()) {
			topicQueue.put(topic, new LinkedList<>());
		}
	}

	@Override
	public void putInQueue(QueueTopic queueTopic, QueueObject queueObject) {
		topicQueue.get(queueTopic).add(queueObject);
	}

	@Override
	public QueueObject pollFromQueue(QueueTopic queueTopic) {
		return topicQueue.get(queueTopic).remove();
	}
}
