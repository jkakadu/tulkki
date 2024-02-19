package com.tulkki;

import com.tulkki.config.lang;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface ExampleConfig extends Config
{
	@ConfigItem(
		keyName = "language",
		name = "Kieli",
		description = "Valitse käytettävä kieli"
	)
	default lang lang()
	{
		return lang.FINNISH;
	}
}
