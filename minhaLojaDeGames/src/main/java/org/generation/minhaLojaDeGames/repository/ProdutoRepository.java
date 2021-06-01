package org.generation.minhaLojaDeGames.repository;

import org.generation.minhaLojaDeGames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>  {

	public List<Produto> findAllByProdutoContainingIgnoreCase (String produto);
	
}