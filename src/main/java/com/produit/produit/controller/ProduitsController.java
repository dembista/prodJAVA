package com.produit.produit.controller;

import com.produit.produit.models.Produits;
import com.produit.produit.service.ProduitsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RestController
@RequestMapping("/api/produits/")
@RequiredArgsConstructor
public class ProduitsController {

    private ProduitsService service;

    @PostMapping
    public Produits addProduits(@RequestBody Produits prod){
        try {
            return service.addProduits(prod);
            }catch (Exception e){
            throw e;
        }
    }



}
