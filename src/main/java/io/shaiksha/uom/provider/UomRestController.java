package io.shaiksha.uom.provider;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.shaiksha.uom.model.Uom;
import io.shaiksha.uom.service.IUomService;
/**
 * UomRestController.java
 * @author shaiksha
 * @version 1.0
 * @since 31/01/2019
 *
 */
@RestController
@RequestMapping("/api/uoms")
public class UomRestController {
	@Autowired
	private IUomService service;

	@PostMapping
	public ResponseEntity<?> saveUom(@RequestBody Uom uom){
		String uomId=service.saveUom(uom);
		return ResponseEntity.ok("Uom data has been inserted with id "+uomId);
	}

	@GetMapping
	public List<Uom> getAllUoms(){
		return service.getAllUoms();
	}

	@DeleteMapping("/{uomId}")
	public ResponseEntity<?> deleteUom(@PathVariable String uomId){
		service.deleteUomById(uomId);
		return ResponseEntity.ok("Uom data with id "+uomId+" has been deleted ");
	}

	@PutMapping
	public ResponseEntity<?> updateUom(@RequestBody Uom uom){
		service.updateUom(uom);
		return ResponseEntity.ok("Uom data has been updated for id "+uom.getId());
	}

	@GetMapping("/{uomId}")
	public Uom getUomById(@PathVariable String uomId){
         return service.getUomById(uomId);
	}
}
