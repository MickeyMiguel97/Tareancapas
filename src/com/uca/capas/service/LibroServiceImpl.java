package com.uca.capas.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.dao.LibroDAO;
import com.uca.capas.domain.Libro;

@Service
public class LibroServiceImpl implements LibroService{
	
	@Autowired
	LibroDAO libroDAO;

	@Override
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
		return libroDAO.findAll();
	}

	@Override
	public List<Libro> busqueda(String valor, String opcion) {
		// TODO Auto-generated method stub
		return libroDAO.busqueda(valor, opcion);
	}

	@Override
	public BigInteger suma() throws DataAccessException {
		// TODO Auto-generated method stub
		return libroDAO.suma();
	}

	@Override
	public BigInteger contar(String autor, String opcion) throws DataAccessException {
		// TODO Auto-generated method stub
		return libroDAO.contar(autor, opcion);
	}

	@Override
	public BigInteger suma2() throws DataAccessException {
		// TODO Auto-generated method stub
		return libroDAO.suma2();
	}

	@Override
	public BigInteger contar2() throws DataAccessException {
		// TODO Auto-generated method stub
		return libroDAO.contar2();
	}

	

}