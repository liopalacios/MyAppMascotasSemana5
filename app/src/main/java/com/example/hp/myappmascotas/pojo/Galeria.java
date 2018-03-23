package com.example.hp.myappmascotas.pojo;

/**
 * Created by HP on 21/03/2018.
 */

public class Galeria {
    private int id;
    private int foto;

    public Galeria(int id, int foto) {
        this.id = id;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
