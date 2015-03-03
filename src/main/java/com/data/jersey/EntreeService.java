package com.data.jersey;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.hibernate.loader.custom.Return;

import com.data.entity.Carnet;
import com.data.service.CarnetService;



//@Path("/entree")
public class EntreeService implements CarnetService{

	private EntityManager manager;

	
	
	
	
	
	
	
	public EntreeService() 
	
	{
		super();
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("talentroc_select");
		 this.manager = factory.createEntityManager();
       

	}





	@GET 
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XHTML_XML)
	public List<Carnet> getAllCarnets() 
	{
		// TODO Auto-generated method stub
		List<Carnet>carnets=this.manager.createQuery("select c from Carnet c",Carnet.class).getResultList();
		return carnets;
	}

	

	

	public Carnet createCarnet(String nom, String prenom, String ville,
			String rue, String zip, String pays) {
		// TODO Auto-generated method stub
		
		Carnet entree=new Carnet();
		entree.setNom(nom);
		entree.setPrenom(prenom);
		entree.setVille(ville);
		entree.setRue(rue);
		entree.setZip(zip);
		entree.setPays(pays);
		
		EntityTransaction tr=this.manager.getTransaction();
		tr.begin();
		this.manager.persist(entree);
		tr.commit();
		return entree;
	
	}


	public void updateCarnent(Long id, String nom, String prenom, String ville,
			String rue, String zip, String pays) {
		// TODO Auto-generated method stub
		
		this.manager.getTransaction().begin();
		Carnet adresse=this.manager.find(Carnet.class, id);
		adresse.setNom(nom);
		adresse.setPrenom(prenom);
		adresse.setVille(ville);
		adresse.setRue(rue);
		adresse.setZip(zip);
		adresse.setPays(pays);
		this.manager.persist(adresse);
		manager.getTransaction().commit();
		
	}


	public void deleteCarnet(Long id) {
		// TODO Auto-generated method stub
		this.manager.getTransaction().begin();
		Carnet adresse=this.manager.find(Carnet.class, id);
		this.manager.remove(adresse);
		
		this.manager.getTransaction().commit();
		
		
	}





	public Carnet getCarnetbyId(Long Id) 
	{
		// TODO Auto-generated method stub
		this.manager.getTransaction().begin();
		Carnet 	adresse=manager.find(Carnet.class, Id);
		manager.getTransaction().commit();
		return adresse;
		
	}

	
}

	


