package com.juaracoding.oop.interfacez.service;

import com.juaracoding.oop.interfacez.IReport;
import com.juaracoding.oop.interfacez.IService;
import com.juaracoding.oop.interfacez.model.Menu;

import java.util.List;

//Developer A
/**
 *  Platform Code - Usm
 *  Modul Code - 01
 *  FV -
 *  FE - 
 */
public class MenuService implements IService<Menu>, IReport {

    @Override
    public void insert(Menu menu) {
        //koding insert ke table menu
        if(menu==null){
            System.out.println("FVUsm01001");
        }
        try{
            
        }catch (Exception e){
            System.out.println("FEUsm01001");
        }
    }

    @Override
    public void update(Long id, Menu menu) {
        if(menu==null){
            System.out.println("FVUsm01011");
        }
        if(id==null){
            System.out.println("FVUsm01012");
        }
        if(id==1){
            System.out.println("FVUsm01013");
        }
        try{
            
        }catch (Exception e){
            System.out.println("FEUsm01011");
        }
    }

    @Override
    public void delete(Long id) {
        if(id==null){
            System.out.println("FVUsm01021");
        }
        if(id==1){
            System.out.println("FVUsm01022");
        }
        try{

        }catch (Exception e){
            System.out.println("FEUsm01021");
        }
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
    public void printPDF() {
        
    }

    @Override
    public void printExcel() {

    }
}
