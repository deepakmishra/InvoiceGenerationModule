package com.meesho.invoice.consumer;

import com.meesho.queue.model.QueueTopic;

public class SubsequentInvoiceConsumer extends AbstractInvoiceConsumer {

	public SubsequentInvoiceConsumer() {
		super(QueueTopic.INVOICE_FAILED, QueueTopic.INVOICE_FAILED);
	}
}
