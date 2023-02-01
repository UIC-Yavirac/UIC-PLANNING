package uic.convocatoria.planning;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Planning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long convocatoriaId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private Boolean state;
    // private Integer yearSchoolId;
    // private Integer modalitiesId;
    // private Integer careerId;
    

}
