package com.seriestalk.dto;

public class ConversationResponse {
    private String text;
    private String audioUrl;

    public ConversationResponse(String text, String audioUrl) {
        this.text = text;
        this.audioUrl = audioUrl;
    }

    public String getText() { return text; }
    public String getAudioUrl() { return audioUrl; }
}