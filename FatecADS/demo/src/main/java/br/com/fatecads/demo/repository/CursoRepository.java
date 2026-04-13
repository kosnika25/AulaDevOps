package br.com.fatecads.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fatecads.demo.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
    
    
}
