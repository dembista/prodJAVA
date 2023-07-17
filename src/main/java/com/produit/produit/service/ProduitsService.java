package com.produit.produit.service;

import com.produit.produit.models.Produits;
import com.produit.produit.repositories.ProduitsRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitsService {

    @Autowired
    private ProduitsRepositorie prodRepo;


    public Produits addProduits(Produits prod) {
        try {
            return prodRepo.save(prod);
        }catch(Exception e){
            throw e;
        }
    }

    public List<Produits> getAll() {
        return prodRepo.findAll();
    }
}
