package com.meesho.invoice.consumer;

import com.meesho.queue.model.QueueTopic;

public class FirstInvoiceConsumer extends AbstractInvoiceConsumer {

	public FirstInvoiceConsumer() {
		super(QueueTopic.INVOICE, QueueTopic.INVOICE_FAILED);
	}
}
