package com.example.demo.controller;

import com.example.demo.entity.StockIngredient;
import com.example.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/stocks")
    public List<StockIngredient> GetAllStockIngredients(@RequestBody StockIngredient stockIngredients)
    {
        return stockService.GetAllStockIngredients();
    }

    @PostMapping("create")
    public StockIngredient saveStockIngredient(@RequestBody StockIngredient stockIngredient)
    {
        return stockService.saveStockIngredient(stockIngredient);
    }

    @GetMapping("/{id}")
    public Optional<StockIngredient> findStockIngredientById(@PathVariable("id") Long stockIngredientId)
    {
        return stockService.findStockIngredientById(stockIngredientId);
    }

    @PutMapping("/update/{id}")
    public StockIngredient stockIngredient(@RequestBody StockIngredient stockIngredient)
    {
        return stockService.updateStockIngredient(stockIngredient);
    }
}
