package com.seriestalk.Service;

import com.seriestalk.dto.AudioRequest;
import com.seriestalk.dto.ConversationResponse;
import org.springframework.stereotype.Service;

@Service
public class ConversationService {

    public ConversationResponse startConversation(AudioRequest request) {
        return new ConversationResponse("Hello! I'm Mark Zuckerberg. Let's talk!", "https://audio-link.com/start.mp3");
    }

    public ConversationResponse respondToConversation(AudioRequest request) {
        return new ConversationResponse("That's very interesting. Tell me more!", "https://audio-link.com/response.mp3");
    }
}
