package com.compraservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "item-service", url = "${item.service.url}")
public interface ItemServiceClient {

    @GetMapping("/itens/{id}")
    Item getItemById(@PathVariable String id);
}