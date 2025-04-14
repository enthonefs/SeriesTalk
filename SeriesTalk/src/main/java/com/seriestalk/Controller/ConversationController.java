package com.seriestalk.Controller;

import com.seriestalk.dto.AudioRequest;
import com.seriestalk.dto.ConversationResponse;
import com.seriestalk.Service.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/conversation")
public class ConversationController {

    @Autowired
    private ConversationService conversationService;

    @PostMapping("/start")
    public ConversationResponse startConversation(@RequestBody AudioRequest request) {
        return conversationService.startConversation(request);
    }

    @PostMapping("/respond")
    public ConversationResponse respond(@RequestBody AudioRequest request) {
        return conversationService.respondToConversation(request);
    }
}
