package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.Area;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AreaStorageTest {

private final Area obj1 = new Area(12, 12,  "Lviv");
private final Area obj2 = new Area(16, 16, "Odesa");
private final Area obj3 = new Area(17, 17, "Ternopil");

    AreaStorage sps = new AreaStorage();
    @Test
    void create() {

        List<Area> list = Arrays.asList(obj2, obj1, obj3);
        List<Area> list1 = Arrays.asList(obj2, obj1, obj3);
        assertEquals(list1, sps.create(list));
    }

    @Test
    void getById() {
        List<Area> list = Arrays.asList(obj2, obj1, obj3);
        sps.create(list);
        assertEquals(list.get(0), sps.getById(1));
    }

    @Test
    void getAll() {
        List<Area> list = Arrays.asList(obj2, obj1, obj3);
        sps.create(list);
        assertEquals(list, sps.getAll());
    }

    @Test
    void delete() {
        List<Area> list = Arrays.asList(obj2, obj1, obj3);
        List<Area> list1 = Arrays.asList(obj1, obj3);
        sps.create(list);
        assertEquals(list1, sps.delete(1));

    }

    @Test
    void update() {
        List<Area> list = Arrays.asList(obj2, obj1, obj3);
        List<Area> list1 = Arrays.asList(obj1, obj1, obj3);
        sps.create(list);
        assertEquals(list1, sps.update(1,obj1));
    }
}