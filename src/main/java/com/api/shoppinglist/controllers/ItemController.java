package com.api.shoppinglist.controllers;

import com.api.shoppinglist.models.ItemModel;
import com.api.shoppinglist.dtos.ItemDto;
import com.api.shoppinglist.services.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/item")
public class ItemController {
    final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<Object> saveItem(@RequestBody @Valid ItemDto itemDto){
        var itemModel = new ItemModel();
        BeanUtils.copyProperties(itemDto, itemModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(itemService.save(itemModel));
    }
    @GetMapping
    public ResponseEntity<List<ItemModel>> getAllItens(){
        return ResponseEntity.status(HttpStatus.OK).body(itemService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneItem(@PathVariable(value = "id") Long id){
        Optional<ItemModel> itemModelOptional = itemService.findById(id);
        if (!itemModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(itemModelOptional.get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteItem(@PathVariable(value = "id") Long id){
        Optional<ItemModel> itemModelOptional = itemService.findById(id);
        if (!itemModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item not found.");
        }
        itemService.delete(itemModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Item deleted successfully.");
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateItem(@PathVariable(value = "id") Long id,
                                                    @RequestBody @Valid ItemDto itemDto){
        Optional<ItemModel> itemModelOptional = itemService.findById(id);
        if (!itemModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item not found.");
        }
        var itemModel = new ItemModel();
        BeanUtils.copyProperties(itemDto, itemModel);
        itemModel.setId(itemModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(itemService.save(itemModel));
    }
}
