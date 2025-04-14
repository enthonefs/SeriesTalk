package com.seriestalk.Service;

import com.seriestalk.dto.AudioRequest;
import com.seriestalk.dto.ConversationResponse;
import org.springframework.stereotype.Service;

@Service
public class ConversationService {

    public ConversationResponse startConversation(AudioRequest request) {
        // Aqui você pode chamar a API do GPT com prompt inicial do personagem
        // E gerar o áudio da resposta com TTS
        return new ConversationResponse("Hello! I'm Mark Zuckerberg. Let's talk!", "https://audio-link.com/start.mp3");
    }

    public ConversationResponse respondToConversation(AudioRequest request) {
        // 1. Enviar áudio para Whisper API para transcrição
        // 2. Enviar texto transcrito + contexto para OpenAI GPT
        // 3. Receber resposta e gerar áudio com TTS

        return new ConversationResponse("That's very interesting. Tell me more!", "https://audio-link.com/response.mp3");
    }
}
