/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicky.restful.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author dicky-java
 */
@Entity
public class Kategori implements Serializable {
    
    @Id
    @Column(name = "idkategori")
    private String idkategori;
    @Column(name = "nama")
    private String nama;

    public String getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(String idkategori) {
        this.idkategori = idkategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kategori() {
    }

    public Kategori(String idkategori, String nama) {
        this.idkategori = idkategori;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nama;
    }
    
    
    
    
}
