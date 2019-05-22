package utfpr.arquitetura1.antecipacao.DTO;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class DisciplineGroupEntityDTO {
    private long id;
    private DisciplineDTO discipline;
    private TeacherDTO teacher;
    private Set<StudentDTO> students;
}
