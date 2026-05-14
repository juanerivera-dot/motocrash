package model;

import java.awt.image.BufferedImage;

/**
 * Clase abstracta base para todas las entitades del juego.
 * Define posición, sprite, dirección y posición.
 * Implementó el método actualizar().
 */
public abstract class Entity {
    /**
     *  Constantes manejo direccióm entidad.
     */
    public static final int DIR_NONE = 0;
    public static final int DIR_LEFT = 1;
    public static final int DIR_RIGHT = 2;

    // Atributos.
    private int x;
    private int y;
    private int widht;
    private int height;
    private BufferedImage sprite;
    private boolean active;
    private int direction;
}
