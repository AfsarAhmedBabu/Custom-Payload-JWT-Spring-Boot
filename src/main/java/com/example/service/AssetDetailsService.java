package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.AssetDao;
import com.example.model.AssetDto;

import com.example.repository.AssetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetDetailsService {
	
	@Autowired
	private AssetRepository assetDao;
	
	public List<AssetDto> findAll() {
		
		List<AssetDto> allAssets = new ArrayList<>();
		
		for (AssetDao asset : assetDao.findAll()) {
			
			AssetDto newAsset = new AssetDto();
			
			if ((Long) asset.getAssetId() != null)
				newAsset.setAssetId(asset.getAssetId());
			
			if (asset.getCategory() != null)
			newAsset.setCategory(asset.getCategory());
			if (asset.getItemGroup() != null)
			newAsset.setItemGroup(asset.getItemGroup());
			if (asset.getItemCode() != null)
			newAsset.setItemCode(asset.getItemCode());
			if (asset.getManufacturer() != null)
			newAsset.setManufacturer(asset.getManufacturer());
			if (asset.getPrice() != null)
			newAsset.setPrice(asset.getPrice());
			if (asset.getExpiryDate() != null)
			newAsset.setExpiryDate(asset.getExpiryDate());
			if (asset.getWarrantyTill() != null)
			newAsset.setWarrantyTill(asset.getWarrantyTill());
			if (asset.getIsAllottable() != null)
			newAsset.setIsAllottable(asset.getIsAllottable());
			
			allAssets.add(newAsset);
		}
		
		return allAssets;
	}
	
	public AssetDao save(AssetDto asset) {
		
		AssetDao newAsset = new AssetDao();
		
		if ((Long) asset.getAssetId() != null)
			newAsset.setAssetId(asset.getAssetId());
		
		if (asset.getCategory() != null)
			newAsset.setCategory(asset.getCategory());
		if (asset.getItemGroup() != null)
			newAsset.setItemGroup(asset.getItemGroup());
		if (asset.getItemCode() != null)
			newAsset.setItemCode(asset.getItemCode());
		if (asset.getManufacturer() != null)
			newAsset.setManufacturer(asset.getManufacturer());
		if (asset.getPrice() != null)
			newAsset.setPrice(asset.getPrice());
		if (asset.getExpiryDate() != null)
			newAsset.setExpiryDate(asset.getExpiryDate());
		if (asset.getWarrantyTill() != null)
			newAsset.setWarrantyTill(asset.getWarrantyTill());
		if (asset.getIsAllottable() != null)
			newAsset.setIsAllottable(asset.getIsAllottable());
		
		return assetDao.save(newAsset);
	}
	
	public AssetDao update(AssetDto asset) {
		
		AssetDao newAsset = new AssetDao();
		
		if ((Long) asset.getAssetId() != null)
			newAsset.setAssetId(asset.getAssetId());
		
		if (asset.getCategory() != null)
			newAsset.setCategory(asset.getCategory());
		if (asset.getItemGroup() != null)
			newAsset.setItemGroup(asset.getItemGroup());
		if (asset.getItemCode() != null)
			newAsset.setItemCode(asset.getItemCode());
		if (asset.getManufacturer() != null)
			newAsset.setManufacturer(asset.getManufacturer());
		if (asset.getPrice() != null)
			newAsset.setPrice(asset.getPrice());
		if (asset.getExpiryDate() != null)
			newAsset.setExpiryDate(asset.getExpiryDate());
		if (asset.getWarrantyTill() != null)
			newAsset.setWarrantyTill(asset.getWarrantyTill());
		//if (asset.getIsAllottable() != null)
			newAsset.setIsAllottable("Deleted");
		
		return assetDao.save(newAsset);
	}

}