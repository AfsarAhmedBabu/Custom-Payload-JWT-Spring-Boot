package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.AllotmentDao;
import com.example.model.AllotmentDto;

import com.example.repository.AllotmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllotmentDetailsService {
		
	@Autowired
	private AllotmentRepository assetDao;
	
	public List<AllotmentDto> findAll() {
		
		List<AllotmentDto> allAssets = new ArrayList<>();
		
		for (AllotmentDao asset : assetDao.findAll()) {
			
			AllotmentDto newAsset = new AllotmentDto();
			
			if ((Long) asset.getAllotmentId() != null)
			newAsset.setAllotmentId(asset.getAllotmentId());
			
			if (asset.getCategory() != null)
			newAsset.setCategory(asset.getCategory());
			if (asset.getItemGroup() != null)
			newAsset.setItemGroup(asset.getItemGroup());
			if (asset.getItemCode() != null)
			newAsset.setItemCode(asset.getItemCode());
			
			if (asset.getGivenDate() != null)
			newAsset.setGivenDate(asset.getGivenDate());
			if (asset.getReturnDate() != null)
			newAsset.setReturnDate(asset.getReturnDate());
			if (asset.getIsReturnable() != null)
			newAsset.setIsReturnable(asset.getIsReturnable());
			
			allAssets.add(newAsset);
		}
		
		return allAssets;
	}
	
	public AllotmentDao save(AllotmentDto asset) {
		
		AllotmentDao newAsset = new AllotmentDao();
		
		if ((Long) asset.getAllotmentId() != null)
			newAsset.setAllotmentId(asset.getAllotmentId());
			
		if (asset.getCategory() != null)
			newAsset.setCategory(asset.getCategory());
		if (asset.getItemGroup() != null)
			newAsset.setItemGroup(asset.getItemGroup());
		if (asset.getItemCode() != null)
			newAsset.setItemCode(asset.getItemCode());
			
		if (asset.getGivenDate() != null)
			newAsset.setGivenDate(asset.getGivenDate());
		if (asset.getReturnDate() != null)
			newAsset.setReturnDate(asset.getReturnDate());
		if (asset.getIsReturnable() != null)
			newAsset.setIsReturnable(asset.getIsReturnable());
		
		return assetDao.save(newAsset);
	}
	
	public AllotmentDao update(AllotmentDto asset) {
		
		AllotmentDao newAsset = new AllotmentDao();
		
		if ((Long) asset.getAllotmentId() != null)
			newAsset.setAllotmentId(asset.getAllotmentId());
			
		if (asset.getCategory() != null)
			newAsset.setCategory(asset.getCategory());
		if (asset.getItemGroup() != null)
			newAsset.setItemGroup(asset.getItemGroup());
		if (asset.getItemCode() != null)
			newAsset.setItemCode(asset.getItemCode());
			
		if (asset.getGivenDate() != null)
			newAsset.setGivenDate(asset.getGivenDate());
		if (asset.getReturnDate() != null)
			newAsset.setReturnDate(asset.getReturnDate());
			//if (asset.getIsReturnable() != null)
			newAsset.setIsReturnable("Deleted");
		
		return assetDao.save(newAsset);
	}

}