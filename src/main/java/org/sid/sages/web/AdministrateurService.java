package org.sid.sages.web;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.sid.sages.dao.AdministrateurRepository;
import org.sid.sages.dao.CategoryRepository;
import org.sid.sages.dao.CompteRepository;
import org.sid.sages.dao.DisscussionRepository;
import org.sid.sages.dao.FormulaireRepository;
import org.sid.sages.dao.MarqueRepository;
import org.sid.sages.dao.MessageRepository;
import org.sid.sages.dao.ProduitRepository;
import org.sid.sages.entity.Category;
import org.sid.sages.entity.Disscussion;
import org.sid.sages.entity.Formulaire;
import org.sid.sages.entity.Marque;
import org.sid.sages.entity.Message;
import org.sid.sages.entity.Produit;
import org.sid.sages.entity.users.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/sages")
public class AdministrateurService implements Serializable {
	@Autowired(required = true)
	private AdministrateurRepository administrateurrepository ;
	@Autowired(required = true)
	private ProduitRepository produitrepository ;
	@Autowired(required = true)
	private CategoryRepository categoryrepository ;
	@Autowired(required = true)
	private MarqueRepository marquerepository ;
	
	@Autowired(required = true)
	private CompteRepository compterepository ;
	@Autowired(required = true)
	private DisscussionRepository disscussionrepository ;
	@Autowired(required = true)
	private MessageRepository messagerepository ;
	@Autowired(required = true)
	private FormulaireRepository formulairerepository ;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getallproduit")
	  public List<Produit> getAll() {
	    return  produitrepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getallcategory")
	  public List<Category> getAllcategory() {
	    return  categoryrepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getallmarque")
	  public List<Marque> getAllmarque() {
	    return  marquerepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getallcompte")
	  public List<Compte> getAllcompte() {
	    return  compterepository.findAll();
	  }
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getalldisscussion")
	  public List<Disscussion> getAllDisscussion() {
	    return  disscussionrepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getallmessage")
	  public List<Message> getAllMessage() {
	    return  messagerepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getallformulaire")
	  public List<Formulaire> getAllFormulaire() {
	    return  formulairerepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@PostMapping(value="/addProduit")
	public void addProduit (@RequestBody Produit a) {		
		
		
		produitrepository.save(a);
	}
	@CrossOrigin(origins = "*")
	@DeleteMapping(value = "/deleteProduit/{id}")
	public Map<String, Boolean> deleteproduit(@PathVariable Long id)
			throws ResourceNotFoundException {
		Produit produit = produitrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pas de produit :: " + id));

		produitrepository.delete(produit);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Supprimer", Boolean.TRUE);
		return response;
	}
	@CrossOrigin(origins = "*")
	@PutMapping(value = "/updateProduit/{id}")
	public ResponseEntity<Produit> update(@RequestBody Produit e,@PathVariable Long id){
		Produit produit = produitrepository.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("Pas de produit  :: " + id));
		 produit.setNameEN(e.getNameEN());
		 produit.setNameFR(e.getNameFR());
		 produit.setPaletEN(e.getPaletEN());
		 produit.setPaletFR(e.getPaletFR());
		 produit.setBoxpalet(e.getBoxpalet());
		 produit.setDescriptionEN(e.getDescriptionEN());
		 produit.setDescriptionFR(e.getDescriptionFR());
		 produit.setGrosweightpalet(e.getGrosweightpalet());
		 produit.setHeightpalet(e.getHeightpalet());
		 produit.setCategory(e.getCategory());
		 produit.setNetweightpalet(e.getNetweightpalet());
		 produit.setPalet20(e.getPalet20());
		 produit.setPalet40(e.getPalet40());
		 

		 Produit updateProduit=produitrepository.save(e);
			
			return ResponseEntity.ok(updateProduit);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getproduit/{id}")
	  public  <Produit> Object getproduit(Long id) {
	    return  produitrepository.findById(id);
	  }
	
	
	/*@Transactional(readOnly = true)
	@CrossOrigin
	@RequestMapping(value="/findById/{id}",method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Produit> findAllByStream(@PathVariable("id")U id) {
		
		return new ResponseEntity<Produit>(this. getproduitrepository().findOne(id), HttpStatus.OK);
	}*/
	@CrossOrigin(origins = "*")
	@PostMapping(value="/addMarque")
	public void addMarque (@RequestBody Marque a) {		
		
		
		marquerepository.save(a);
	}
	@CrossOrigin(origins = "*")
	@DeleteMapping(value = "/deleteMarque/{id}")
	public Map<String, Boolean> deleteMarque(@PathVariable Long id)
			throws ResourceNotFoundException {
		Marque marque = marquerepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pas de marque :: " + id));

		marquerepository.delete(marque);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Supprimer", Boolean.TRUE);
		return response;
	}
	@CrossOrigin(origins = "*")
	@PutMapping(value = "/updateMarque/{id}")
	public ResponseEntity<Marque> update(@RequestBody Marque e,@PathVariable Long id){
		Marque marque = marquerepository.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("Pas de marque  :: " + id));
		 marque.setDescriptionEN(e.getDescriptionEN());
		 marque.setDescriptionFR(e.getDescriptionFR());
		 marque.setCategory(e.getCategory());
		 marque.setNameEN(e.getNameEN());
		 marque.setNameFR(e.getNameFR());
		 Marque updateMarque=marquerepository.save(e);
			
			return ResponseEntity.ok(updateMarque);
	}
	@CrossOrigin(origins = "*")
	@PostMapping(value="/addCategory")
	public void addCategory (@RequestBody Category c) {		
		
		
		categoryrepository.save(c);
	}
	@CrossOrigin(origins = "*")
	@DeleteMapping(value = "/deleteCategory/{id}")
	public Map<String, Boolean> deleteCategory(@PathVariable Long id)
			throws ResourceNotFoundException {
		Category category = categoryrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pas de category :: " + id));

		categoryrepository.delete(category);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Supprimer", Boolean.TRUE);
		return response;
	}
	@CrossOrigin(origins = "*")
	@PutMapping(value = "/updateCategory/{id}")
	public ResponseEntity<Category> update(@RequestBody Category c,@PathVariable Long id){
		Category category= categoryrepository.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("Pas de category  :: " + id));
		 category.setNom(c.getNom());
		 category.setName(c.getName());
		 category.setDescriptionEN(c.getDescriptionEN());
		 category.setDescriptionFR(c.getDescriptionFR());
		 category.setHarvestperiodEN(c.getHarvestperiodEN());
		 category.setHarvestperiodFR(c.getHarvestperiodFR());
		 category.setLocationEN(c.getLocationEN());
		 category.setLocationFR(c.getLocationFR());
		 category.setStatusEN(c.getStatusEN());
		 category.setStatusFR(c.getStatusFR());
		 category.setMarque(c.getMarque());
		 category.setStorageEN(c.getStorageEN());
		 category.setStorageFR(c.getStorageFR());
		 
		 Category updateCategory=categoryrepository.save(c);
			
			return ResponseEntity.ok(updateCategory);
	}
	
	
	
	
}
