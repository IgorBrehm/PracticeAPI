package com.api.shoppinglist.services;

import com.api.shoppinglist.models.ItemModel;
import com.api.shoppinglist.repositories.ItemRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ItemService {
    final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional
    public ItemModel save(ItemModel itemModel) {
        return itemRepository.save(itemModel);
    }

    public List<ItemModel> findAll() {
        return itemRepository.findAll();
    }

    public Optional<ItemModel> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Transactional
    public void delete(ItemModel itemModel) {
        itemRepository.delete(itemModel);
    }

}
