package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AssetDto;
import com.example.service.AssetDetailsService;

@RestController
@CrossOrigin()
public class AssetController {
	
	@Autowired
	private AssetDetailsService assetDetailsService;
	
    @RequestMapping(value = "/saveAsset", method = RequestMethod.POST)
    public ResponseEntity<?> saveAsset(@RequestBody AssetDto asset) throws Exception {
		return ResponseEntity.ok(assetDetailsService.save(asset));
	}
    
    @RequestMapping(value = "/deleteAsset", method = RequestMethod.POST)
    public ResponseEntity<?> deleteAsset(@RequestBody AssetDto asset) throws Exception {
		return ResponseEntity.ok(assetDetailsService.save(asset));
	}
    
    @GetMapping("/allAssets")
    public List<AssetDto> allAssets() {
        return assetDetailsService.findAll();
    }

}