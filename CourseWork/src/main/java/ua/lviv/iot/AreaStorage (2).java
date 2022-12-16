package ua.lviv.iot;

import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Area;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class AreaStorage {

    List<Area> panels = new ArrayList<>() ;
    int id = 0;


    public List<Area> create (List<Area> panels){
            for (Area panel: panels) {
                panel.setId(++id);
                this.panels.add(panel);
            }
            return this.panels;
    }

    public Area getById(int id){
        Area Area = null;
        for ( int i = 0; i < panels.size(); i++){
            if (panels.get(i).getId() == id ){
                Area = panels.get(i);
            }
        }
        return Area;
    }

    public List<Area> getAll(){
        return panels;
    }

    public List<Area> delete ( int id ){
        for ( int i = 0; i < panels.size(); i++){
            if (panels.get(i).getId() == id ){
                panels.remove(panels.get(i));
            }
        }
        return panels;
    }

    public List<Area> update (int id, Area Area){
        for ( int i = 0; i < panels.size(); i++){
            if (panels.get(i).getId() == id) {
                Area.setId(id);
                panels.set(i, Area);
            }
        }
        return panels;
    }
}
