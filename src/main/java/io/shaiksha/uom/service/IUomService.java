package io.shaiksha.uom.service;

import java.util.List;

import io.shaiksha.uom.model.Uom;

/**
 * UomService.java
 * @author shaiksha
 * @version 1.0
 * @since 31/01/2019
 */
public interface IUomService {
	
	public String saveUom(Uom uom);
	public List<Uom> getAllUoms();
	public Uom getUomById(String uomId);
	public void updateUom(Uom uom);
	public void deleteUomById(String uomId);

}
