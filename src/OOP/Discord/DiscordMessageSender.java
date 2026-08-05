package OOP.Discord;

import java.net.MalformedURLException;
import java.net.URL;

public class DiscordMessageSender {
    void SendDiscordMessage(Discord discord) throws MalformedURLException {

        URL url = new URL((discord.webhookUrl));
    }
}
