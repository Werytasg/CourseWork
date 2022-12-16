package ua.lviv.iot.service;

import ua.lviv.iot.model.Area;

import java.util.List;

public interface AreaService {
 Area getById (int id);
 List<Area> getAll();
 List<Area> delete (int id);
 List<Area> update (int id, Area Area);
 void create (List<Area> list);
}
