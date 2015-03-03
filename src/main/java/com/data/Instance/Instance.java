package com.data.Instance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.data.entity.Carnet;

public class Instance {

	
	private EntityManager manager;
	public Instance(EntityManager manager) 
	{
		// TODO Auto-generated constructor stub
		this.manager= manager;
		
	}
	
	/**
	 * Méthode d'initialisation de la connection
	 * @return
	 */
	private static   EntityManager create_connection()
	{
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("Talentroc");
		EntityManager manager = factory.createEntityManager();
        return manager;

        
        
	}

	public static void main(String[] args)
	{
		Instance conn=new Instance(create_connection());
		EntityTransaction tx = conn.manager.getTransaction();
		tx.begin();
		for(int i=0;i<=20;i++)
		{
			String nom="nom";
			String prenom="prenom";
			conn.create_adresses(nom+i, prenom+i);
		}
		tx.commit();
	}
	
	private void create_adresses(String nom,String Prenom) 
	
	{
		
	Carnet adresse=new Carnet();
	adresse.setNom(nom);
	adresse.setPrenom(Prenom);
	adresse.setPays("France");
	adresse.setVille("Cesson");
	adresse.setRue("Rue");
	adresse.setZip("35510");
	this.manager.persist(adresse);
	
		
	}
	
	
}
