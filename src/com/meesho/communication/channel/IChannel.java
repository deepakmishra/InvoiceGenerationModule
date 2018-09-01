package com.meesho.communication.channel;

import com.meesho.communication.channel.model.IChannelObject;

public interface IChannel {

	boolean submit(IChannelObject channelObject);
}
