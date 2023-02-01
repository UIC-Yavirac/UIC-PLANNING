package uic.convocatoria.planning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/plannings")
@CrossOrigin({ "*" }) 

public class PlanningController {


    @Autowired
    PlanningService planningService;

    @GetMapping("/{id}/")
    public Planning findById(@PathVariable Long id) {
        return planningService.findById(id);
    }


    @GetMapping("/")
    public List<Planning> findAll() {
        return planningService.findAll();
    }

    @PostMapping("/")
    public Planning save(@RequestBody Planning entity) {
        return planningService.save(entity);
    }

    @PutMapping("/{id}/")
    public Planning update(@RequestBody Planning entity) {
        return planningService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        planningService.deleteById(id);
    }

}
