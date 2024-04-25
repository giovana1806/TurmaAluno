package projetojpaAvaliacao.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import projetojpaAvaliacao.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Long>{
	List<Aluno> findByCidade(String cidade);
	List<Aluno> findByRenda(double renda);
	List<Aluno> findByra(String ra);
	List<Aluno> findByCidadeAndRenda (String cidade, double renda);
	
	@Query("SELECT a FROM Aluno a WHERE a.nome = :nome")
	List<Aluno>findByNome(@Param("nome") String nome);
	@Query("SELECT a FROM Aluno a WHERE a.nomeCompleto LIKE :nomeCompleto")
	List<Aluno>findByNomeLike(@Param("nomeCompleto") String nomeCompleto);
	
}
