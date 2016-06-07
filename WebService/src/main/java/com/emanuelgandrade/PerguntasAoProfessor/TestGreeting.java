package com.emanuelgandrade.PerguntasAoProfessor;

public class TestGreeting {
	
	private final long id;
    private final String content;

    public TestGreeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
