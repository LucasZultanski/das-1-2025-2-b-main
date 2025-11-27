package br.univille;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * Event Record - Representa um evento de desenho no pipeline
 * 
 * Arquitetura Pipeline (Pipes & Filters):
 * - Produtor envia eventos
 * - Pipe (Kafka) transporta
 * - Consumidor recebe e processa
 */
public record Event(int x, int y, int color, long timestamp) {
    
    private static final Gson gson = new Gson();

    /**
     * Construtor compacto com timestamp automático
     */
    public Event(int x, int y, int color) {
        this(x, y, color, System.currentTimeMillis());
    }

    /**
     * Converter Event para JSON String
     */
    public String toJson() {
        return gson.toJson(this);
    }

    /**
     * Converter JSON String para Event
     */
    public static Event fromJson(String json) {
        try {
            return gson.fromJson(json, Event.class);
        } catch (JsonSyntaxException e) {
            System.err.println("Erro ao fazer parse de JSON: " + json);
            throw new IllegalArgumentException("JSON inválido", e);
        }
    }

    /**
     * Formato legível para debug
     */
    @Override
    public String toString() {
        return String.format("Event[x=%d, y=%d, color=0x%06X, time=%d]", 
            x, y, color & 0xFFFFFF, timestamp);
    }

    /**
     * Validar se as coordenadas estão dentro de um canvas
     */
    public boolean isValidFor(int width, int height) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
