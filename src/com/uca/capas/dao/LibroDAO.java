package com.uca.capas.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Libro;


public interface LibroDAO {

	public List<Libro> findAll() throws DataAccessException;
	public List<Libro> busqueda(String valor, String opcion) throws DataAccessException;
	public BigInteger suma() throws DataAccessException;
	public BigInteger contar(String autor, String opcion) throws DataAccessException;
	public BigInteger suma2() throws DataAccessException;
	public BigInteger contar2() throws DataAccessException;
}