package dev.langchain4j.store.embedding.elasticsearch;

public class ElasticsearchRequestFailedException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ElasticsearchRequestFailedException() {
        super();
    }

    public ElasticsearchRequestFailedException(String message) {
        super(message);
    }

    public ElasticsearchRequestFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
