/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicky.restful.dao;

import com.dicky.restful.model.Barang;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dicky-java
 */
public interface BarangDAO extends CrudRepository<Barang, String>{
    
}
