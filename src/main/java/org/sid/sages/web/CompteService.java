package org.sid.sages.web;

import java.io.Serializable;
import java.util.List;

import org.sid.sages.dao.AdministrateurRepository;
import org.sid.sages.dao.CategoryRepository;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
@RequestMapping("/compte")
public class CompteService implements Serializable {
	@Autowired(required = true)
	private AdministrateurRepository administrateurrepository ;
	@Autowired(required = true)
	private MessageRepository messagerepository ;
	@Autowired(required = true)
	private DisscussionRepository disscussionrepository ;
	@Autowired(required = true)
	private ProduitRepository produitrepository ;
	@Autowired(required = true)
	private CategoryRepository categoryrepository ;
	@Autowired(required = true)
	private MarqueRepository marquerepository ;
	@Autowired(required = true)
	private FormulaireRepository formulairerepository ;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getallmarque")
	  public List<Marque> getAllmarque() {
	    return  marquerepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getallcategory")
	  public List<Category> getAllcategory() {
	    return  categoryrepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@PostMapping(value="/addMarque")
	public void addMessage (@RequestBody Message a) {		
		
		
		messagerepository.save(a);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getallmessage")
	  public List<Message> getAllMessage() {
	    return  messagerepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET,value = "/getalldisscussion")
	  public List<Disscussion> getAllDisscussion() {
	    return  disscussionrepository.findAll();
	  }
	@CrossOrigin(origins = "*")
	@PostMapping(value="/addMessage")
	public void addProduit (@RequestBody Message a) {		
		
		
		messagerepository.save(a);
	}
	@CrossOrigin(origins = "*")
	@PostMapping(value="/addDisscussion")
	public void addDisscuission (@RequestBody Disscussion a) {		
		
		
		disscussionrepository.save(a);
	}
	@CrossOrigin(origins = "*")
	@PostMapping(value="/addFormulaire")
	public void addFormulaire (@RequestBody Formulaire f) {		
		
		
		formulairerepository.save(f);
	}
	@CrossOrigin(origins = "*")
	@PutMapping(value = "/updateFormulaire/{id}")
	public ResponseEntity<Formulaire> update(@RequestBody Formulaire f,@PathVariable Long id){
		Formulaire formulaire = formulairerepository.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("Pas de marque  :: " + id));
		 formulaire.setNomPrenom(f.getNomPrenom());
		 formulaire.setMdp(f.getMdp());
		 formulaire.setEmail(f.getEmail());
		 formulaire.setTel(f.getTel());
		 formulaire.setPays(f.getPays());
		 
		 
		 Formulaire updateFormulaire=formulairerepository.save(f);
			
			return ResponseEntity.ok(updateFormulaire);
	}
	
}
