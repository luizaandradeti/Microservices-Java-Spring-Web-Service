package com.compraservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    private final ItemServiceClient itemServiceClient;
    public ItemController(ItemServiceClient itemServiceClient) {
        this.itemServiceClient = itemServiceClient;
    }
    @GetMapping("/compras/{itemId}")
    public String createPedido(@PathVariable String itemId) {
        Item item = itemServiceClient.getItemById(itemId);
        return "Pedido feito : " + item.getNome() + " preço: $" + item.getPreco();
    }
}