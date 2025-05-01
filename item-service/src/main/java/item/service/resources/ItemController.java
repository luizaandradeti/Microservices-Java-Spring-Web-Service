package item.service.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import item.service.entity.Item;

@RestController
public class ItemController {
    @GetMapping("/itens/{id}")
    public Item getItem(@PathVariable String id) {
        return new Item(id, "Exemplo Item", 48.00);
    }
}
