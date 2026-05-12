package com.dmgmodels.lojaRoupas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dmgmodels.lojaRoupas.model.Roupa;

import java.util.List;

public interface RoupaRepository extends JpaRepository<Roupa, Long> {

    List<Roupa> findByNomeProduto(String nomeProduto);

    List<Roupa> findByNomeProdutoIsContainingIgnoreCase(String nomeProduto);
}
