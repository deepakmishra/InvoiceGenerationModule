package com.meesho.communication.channel;

import com.meesho.communication.channel.model.IChannelObject;

public class EmailChannel implements IChannel {

	private static IChannel instance = new EmailChannel();

	public static IChannel getInstance() {
		return instance;
	}

	private EmailChannel() {

	}

	@Override
	public boolean submit(IChannelObject channelObject) {
		return false;
	}

}
