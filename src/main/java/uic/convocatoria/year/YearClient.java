package uic.convocatoria.year;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin({ "*" })
@FeignClient(name = "bff.customer.year", url = "http://localhost:8084/api/year")
public interface YearClient {

    @GetMapping("/{id}/")
    YearDTO findById(@PathVariable("id") Long id);

    @GetMapping("/")
    List<YearDTO> findAll();

    @PostMapping("/")
    YearDTO save(YearDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id") Long id);

    @PutMapping("/{id}/")
    YearDTO update(@PathVariable("id") Long id, YearDTO entity);


}
