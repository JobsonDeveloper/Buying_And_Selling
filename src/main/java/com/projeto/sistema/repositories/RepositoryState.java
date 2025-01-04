package com.projeto.sistema.repositories;

import com.projeto.sistema.models.DataBaseState;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Para colsultar alguma lista no banco,
obter alguma informação ou salvar algum dado.
* */
public interface RepositoryState extends JpaRepository<DataBaseState, Long> {

}