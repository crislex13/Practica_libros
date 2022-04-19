
package com.emergentes.coleccion_de_libros;

public class categoria {
    private int id;
    private String categoria;

    public categoria() {
        id = 0;
        categoria = "";
    }

    public categoria(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
