package utfpr.arquitetura1.antecipacao.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DisciplineDTO {
    private long id;
    private String name;
    private CourseDTO course;

}
