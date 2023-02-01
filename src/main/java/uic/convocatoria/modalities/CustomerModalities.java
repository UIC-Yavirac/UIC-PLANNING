package uic.convocatoria.modalities;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin({ "*" })
@FeignClient(name = "bff.customer", url = "http://localhost:8085/api/modalities")
public interface CustomerModalities {

    @GetMapping("/{id}/")
    ModalitiesDTO findById(@PathVariable("id") Long id);

    @GetMapping("/")
    List<ModalitiesDTO> findAll();

    @PostMapping("/")
    ModalitiesDTO save(ModalitiesDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id") Long id);

    @PutMapping("/{id}/")
    ModalitiesDTO update(@PathVariable("id") Long id, ModalitiesDTO entity);

    @PutMapping("/{id}/completardatos/")
    ModalitiesDTO completardatos(@PathVariable("id") Long id);

}
