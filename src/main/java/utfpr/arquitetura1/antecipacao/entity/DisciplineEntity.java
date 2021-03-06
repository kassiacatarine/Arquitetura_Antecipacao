package utfpr.arquitetura1.antecipacao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "DISCIPLINE")
public class DisciplineEntity  implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToOne
    private CourseEntity course;

}
