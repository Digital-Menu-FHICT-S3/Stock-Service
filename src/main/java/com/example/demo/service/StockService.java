package com.example.demo.service;

import com.example.demo.entity.StockIngredient;
import com.example.demo.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    public StockRepository stockRepository;

    public StockIngredient saveStockIngredient(StockIngredient stockIngredient) {return stockRepository.save(stockIngredient);}

    public List<StockIngredient> GetAllStockIngredients() { return stockRepository.findAll(); }

    public StockIngredient updateStockIngredient(StockIngredient stockIngredient) { return stockRepository.save(stockIngredient); }

    public Optional<StockIngredient> findStockIngredientById(Long stockIngredientId) { return stockRepository.findById(stockIngredientId); }
}
