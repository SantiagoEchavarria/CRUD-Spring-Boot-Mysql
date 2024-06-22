package com.example.Santiago2;

import java.util.List;

public interface TuristaInterface {

	public void guardar (Turista turista);
	public List<Turista> listado();
	public Turista consultar(Integer id);
	public void eliminar(Integer id);
	
}
