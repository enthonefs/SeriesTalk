package com.seriestalk.dto;

public class AudioRequest {
    private String base64Audio;
    private String character;
    private String previousMessage;

    // Getters and setters
    public String getBase64Audio() { return base64Audio; }
    public void setBase64Audio(String base64Audio) { this.base64Audio = base64Audio; }

    public String getCharacter() { return character; }
    public void setCharacter(String character) { this.character = character; }

    public String getPreviousMessage() { return previousMessage; }
    public void setPreviousMessage(String previousMessage) { this.previousMessage = previousMessage; }
}
