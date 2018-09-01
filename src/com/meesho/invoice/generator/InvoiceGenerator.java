package com.meesho.invoice.generator;

import java.util.Map;

import com.meesho.blob.BlobStorage;

public class InvoiceGenerator {
	private static InvoiceGenerator instance = new InvoiceGenerator();

	private InvoiceGenerator() {
	}

	public static InvoiceGenerator getInstance() {
		return instance;
	}

	public boolean generateInvoice(String blobId, int invoiceTemplateId, Map<String, String> parameters) {
		try {
			Object invoice = generateInvoiceLogic(blobId, invoiceTemplateId, parameters);
			BlobStorage.getInstance().putBlog(blobId, invoice);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private Object generateInvoiceLogic(String blobId, int invoiceTemplateId, Map<String, String> parameters) throws Exception {
		return null;
	}
}
