package uic.convocatoria.planning;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class PlanningService {
    @Autowired PlanningRepository planningRepository;

  

    @Transactional
    public Planning save(Planning entity){
        return planningRepository.save(entity);
    }

    public Planning findById( Long id){
        return planningRepository.findById(id).orElse(new Planning());
    }

    public void deleteById(Long id){
        planningRepository.deleteById(id);
    }

    public List<Planning> findAll(){
        return planningRepository.findAll();
    }
}