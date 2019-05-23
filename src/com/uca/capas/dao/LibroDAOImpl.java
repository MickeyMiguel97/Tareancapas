package com.uca.capas.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Libro;

@Repository
public class LibroDAOImpl implements LibroDAO {

	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	
	@Override
	public List<Libro> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.biblio");
		Query consulta = entityManager.createNativeQuery(sb.toString(), Libro.class);
		List<Libro> resultado = consulta.getResultList();
		return resultado;
	}
	

	@Override
	public List<Libro> busqueda(String valor, String opcion) throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		List<Libro> resultado;
		
		if(opcion.equals("Autor")) {
			sb.append("select * from public.biblio where autor = :autor ");
			Query consulta = entityManager.createNativeQuery(sb.toString(), Libro.class);
			consulta.setParameter("autor", valor);
			resultado = consulta.getResultList();
		}
		else if(opcion.equals("ISBN")) {
			sb.append("select * from public.biblio where isbn = :isbn ");
			Query consulta = entityManager.createNativeQuery(sb.toString(), Libro.class);
			consulta.setParameter("isbn", valor);
			resultado = consulta.getResultList();

		}
		else {
			sb.append("select * from public.biblio where genero = :genero ");
			Query consulta = entityManager.createNativeQuery(sb.toString(), Libro.class);
			consulta.setParameter("genero", valor);
			resultado = consulta.getResultList();
		}
		
		return resultado;
	}

	@Override
	public BigInteger suma() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select sum(cantidad) from public.biblio");
		Query consulta = entityManager.createNativeQuery(sb.toString());
		BigInteger resultado = (BigInteger)consulta.getSingleResult();
		
		return resultado;
	}

	@Override
	public BigInteger contar(String autor, String opcion) throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		BigInteger resultado;
		
		if(opcion.equals("Autor")) {
			sb.append("select count(autor) from public.biblio where autor = :autor");
			Query consulta = entityManager.createNativeQuery(sb.toString());
			consulta.setParameter("autor", autor);
			resultado = (BigInteger)consulta.getSingleResult();			
		}
		else if(opcion.equals("ISBN")) {
			sb.append("select count(autor) from public.biblio where isbn = :isbn");
			Query consulta = entityManager.createNativeQuery(sb.toString());
			consulta.setParameter("isbn", autor);
			resultado = (BigInteger)consulta.getSingleResult();	
		}
		else {
			sb.append("select count(autor) from public.biblio where genero = :genero");
			Query consulta = entityManager.createNativeQuery(sb.toString());
			consulta.setParameter("genero", autor);
			resultado = (BigInteger)consulta.getSingleResult();	
		}
		
		
		return resultado;
	}

	@Override
	public BigInteger suma2() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select sum(cantidad) from public.biblio ");
		Query consulta = entityManager.createNativeQuery(sb.toString());
		BigInteger resultado = (BigInteger)consulta.getSingleResult();
		
		return resultado;
	}

	@Override
	public BigInteger contar2() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select count(autor) from public.biblio ");
		Query consulta = entityManager.createNativeQuery(sb.toString());
		BigInteger resultado = (BigInteger)consulta.getSingleResult();
		
		return resultado;
	}
	

}