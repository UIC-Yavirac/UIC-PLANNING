package uic.convocatoria.planning;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PlanningRepository extends CrudRepository<Planning, Long> {

    List<Planning> findAll();
}