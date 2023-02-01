package uic.convocatoria.career;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin({ "*" })
@FeignClient(name = "bff.customer.career", url = "http://localhost:8086/api/career")
public interface CustomerCareer {

    @GetMapping("/{id}/")
    CareerDTO findById(@PathVariable("id") Long id);

    @GetMapping("/")
    List<CareerDTO> findAll();

    @PostMapping("/")
    CareerDTO save(CareerDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id") Long id);

    @PutMapping("/{id}/")
    CareerDTO update(@PathVariable("id") Long id, CareerDTO entity);

    @PutMapping("/{id}/completardatos/")
    CareerDTO completardatos(@PathVariable("id") Long id);

}
