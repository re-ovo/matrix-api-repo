package me.rerere.matrix.api;

public class MatrixAPIProvider {
    private static MatrixAPI apiInstance = null;

    public static MatrixAPI getAPI() {
        return apiInstance;
    }

    public static void register(MatrixAPI api) {
        apiInstance = api;
    }
}
