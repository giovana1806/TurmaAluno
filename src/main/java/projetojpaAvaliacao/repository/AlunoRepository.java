package projetojpaAvaliacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import projetojpaAvaliacao.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Long>{
	List<Aluno> findByCidade(String cidade);
	List<Aluno> findByRenda(double renda);
	List<Aluno> findByra(String ra);
	List<Aluno> findByCidadeAndRenda (String cidade, double renda);
}
