package me.rerere.matrix.api.exception;

public class UnknowMinecraftVersionException extends RuntimeException {
    public UnknowMinecraftVersionException() {
        super();
    }

    public UnknowMinecraftVersionException(String message) {
        super(message);
    }
}
