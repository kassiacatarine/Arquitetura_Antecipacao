package utfpr.arquitetura1.antecipacao.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import utfpr.arquitetura1.antecipacao.Entity.DisciplineEntity;

public interface DisciplineDAO extends JpaRepository<DisciplineEntity, Long> { }