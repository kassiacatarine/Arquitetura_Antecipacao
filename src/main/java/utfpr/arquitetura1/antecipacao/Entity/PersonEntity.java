package utfpr.arquitetura1.antecipacao.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity implements Serializable {
    @Id @GeneratedValue
    private Long Id;
    private String name;
}
