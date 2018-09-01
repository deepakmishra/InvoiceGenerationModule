package com.meesho.communication.channel;

import com.meesho.communication.channel.model.IChannelObject;

public class SmsChannel implements IChannel {

	private static IChannel instance = new SmsChannel();

	public static IChannel getInstance() {
		return instance;
	}

	private SmsChannel() {

	}

	@Override
	public boolean submit(IChannelObject channelObject) {
		return false;
	}

}
