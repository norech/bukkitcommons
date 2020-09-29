package com.norech.bukkitcommons.input;

import org.bukkit.entity.Player;

public class ChatInputQuestion {
    ChatInputQuestion(ChatInput source, Player sender, String question, ChatInputAskLambda actionWhenAnswered) {
        this.source = source;
        this.question = question;
        this.sender = sender;
        this.actionWhenAnswered = actionWhenAnswered;
    }

    private ChatInput source;

    public String getQuestion() {
        return question;
    }
    private String question;

    public Player getSender() {
        return sender;
    }
    private Player sender;

    private ChatInputAskLambda actionWhenAnswered;

    public void answer(String value) {
        this.actionWhenAnswered.call(value);
        this.source.questions.remove(sender, this);
    }

    public boolean cancel() {
        return this.source.questions.remove(sender, this);
    }
}
