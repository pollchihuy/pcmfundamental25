package com.juaracoding.oop.interfacez.service;

//Developer B

import com.juaracoding.oop.interfacez.IFile;
import com.juaracoding.oop.interfacez.IReport;
import com.juaracoding.oop.interfacez.IService;
import com.juaracoding.oop.interfacez.model.Menu;

import java.util.List;

/**
 *  Platform Code - Usm
 *  Modul Code - 02
 *  FV -
 *  FE - 
 */
public class UserService implements IService<Menu>, IFile {

    @Override
    public void insert(Menu menu) {
        
    }

    @Override
    public void update(Long id, Menu menu) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Menu find(Long id) {
        return null;
    }

    @Override
    public List<Menu> findAll() {
        return List.of();
    }

    @Override
    public void downloadFile() {
        
    }

    @Override
    public void uploadFile() {

    }
}
