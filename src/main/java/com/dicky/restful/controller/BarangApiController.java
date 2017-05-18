/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicky.restful.controller;

import com.dicky.restful.dao.BarangDAO;
import com.dicky.restful.model.Barang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dicky-java
 */
@RestController
@RequestMapping("/api")
public class BarangApiController {
    
    @Autowired private BarangDAO barangDAO;
    
    @RequestMapping(value = "/barang", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Barang> daftarBarang(){
       return barangDAO.findAll();
    }
}
