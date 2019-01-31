package io.shaiksha.uom.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.shaiksha.uom.model.Uom;
import io.shaiksha.uom.repository.UomRepository;
import io.shaiksha.uom.service.IUomService;

/**
 * UomServiceImpl.java
 * @author shaiksha
 * @version 1.0
 * @since 31/01/2019
 *
 */
@Service
public class UomServiceImpl implements IUomService {
	
	@Autowired
	private UomRepository repository;

	@Override
	public String saveUom(Uom uom) {
		uom.setCreatedDate(new Date());
        return repository.save(uom).getId();
	}

	@Override
	public List<Uom> getAllUoms() {
		return repository.findAll();
	}

	@Override
	public Uom getUomById(String uomId) {
		return repository.findById(uomId).get();
	}

	@Override
	public void updateUom(Uom uom) {
		uom.setCreatedDate(getUomById(uom.getId()).getCreatedDate());
        uom.setLastModifiedDate(new Date());
        repository.save(uom);
	}

	@Override
	public void deleteUomById(String uomId) {
		repository.deleteById(uomId);

	}

}
