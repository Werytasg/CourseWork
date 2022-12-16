package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.model.Area;
import ua.lviv.iot.service.AreaService;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api")
class AreaController {
    private final AreaService AreaService;

    @Autowired
    AreaController(AreaService AreaService) {
        this.AreaService = AreaService;
    }

    @GetMapping
    public ResponseEntity<List<Area>> getAll() {
        List<Area> Areas = AreaService.getAll();
        return new ResponseEntity<>(Areas, OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Area> getById(@PathVariable("id") Integer id) {
        Area Area = AreaService.getById(id);
        return new ResponseEntity<>(Area, OK);
    }

    @PostMapping
    public ResponseEntity<?> createArea(@RequestBody List<Area> entity) {
        AreaService.create(entity );
        return new ResponseEntity<>(CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody Area entity) {
        AreaService.update(id, entity);
        return new ResponseEntity<>(OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id) {
        AreaService.delete(id);
        return new ResponseEntity<>(OK);
    }
}