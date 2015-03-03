package com.data.service;

import java.util.List;

import com.data.entity.Carnet;

public interface CarnetService 

{
	Carnet createCarnet(String nom,String prenom,String ville,String rue,String zip,String pays);
	List<Carnet>getAllCarnets();
	void updateCarnent(Long id,String nom, String prenom, String ville,
	String rue, String zip, String pays);
	 void deleteCarnet(Long id);
	Carnet getCarnetbyId(Long Id);
}
