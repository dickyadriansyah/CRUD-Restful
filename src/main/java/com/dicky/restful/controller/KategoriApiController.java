/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicky.restful.controller;

import com.dicky.restful.dao.KategoriDAO;
import com.dicky.restful.model.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dicky-java
 */
@RestController
@RequestMapping("/api")
public class KategoriApiController {
    
    @Autowired private KategoriDAO kategoriDAO;
    
    @RequestMapping(value = "/kategori", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Kategori> daftarKategori(){
       return kategoriDAO.findAll();
    }

    @RequestMapping(value = "/simpanrubah", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void simpanrubahKategori(@RequestBody Kategori kategori){
        kategoriDAO.save(kategori);
    }
    
    @RequestMapping(value = "/carikategori/{idkategori}", method = RequestMethod.GET)
    @ResponseBody
    public Kategori cariKategori(@PathVariable("idkategori") String idkategori){
        
        return kategoriDAO.findOne(idkategori);
    }
    
    @RequestMapping(value = "/hapus/{idkategori}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void hapusKategori(@PathVariable("idkategori") String id){
        if(kategoriDAO.findOne(id)!=null){
            
            kategoriDAO.delete(id);
            
        }
    }
}
