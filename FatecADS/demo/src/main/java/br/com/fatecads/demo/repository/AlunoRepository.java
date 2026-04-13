package br.com.fatecads.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fatecads.demo.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    
}
