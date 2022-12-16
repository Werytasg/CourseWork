package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.AreaStorage;
import ua.lviv.iot.model.Area;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    private AreaStorage AreaStorage;
    
    @Autowired
    public AreaServiceImpl(AreaStorage AreaStorage) {
        this.AreaStorage = AreaStorage;
    }

    @Override
    public Area getById(int id) {
        return AreaStorage.getById(id);
    }

    @Override
    public List<Area> getAll() {
        return AreaStorage.getAll();
    }

    @Override
    public List<Area> delete(int id) {
        return AreaStorage.delete(id);
    }

    @Override
    public List<Area> update(int id, Area Area) {
        return AreaStorage.update(id, Area);
    }

    @Override
    public void create(List<Area> list) {
        AreaStorage.create(list);
    }
}
