package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Consulta;

//@Repository
public interface IConsultaRepo extends JpaRepository<Consulta, Integer>{

}
