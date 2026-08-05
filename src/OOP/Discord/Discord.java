package OOP.Discord;

public class Discord {
    String webhookUrl;
    String username;
    String content;
    String avatarUrl;

    String getJson(){
        return "{" + "\"username\": " + username + ", \"content\": " + content + ", \"avatar_url\"" + avatarUrl + "}";
    }
}
