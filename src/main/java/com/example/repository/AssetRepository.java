package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.AssetDao;

public interface AssetRepository extends CrudRepository<AssetDao, Integer> {
	AssetDao findByItemCode(String itemCode);
	AssetDao findByAssetId(Long assetId);
}