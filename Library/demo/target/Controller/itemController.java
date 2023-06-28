import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


public class itemController {
    @RestController
@RequestMapping("/api/items")
public class ItemController {
    private List<Item> items = new ArrayList<>();

    // Endpoint untuk mengambil daftar item
    @GetMapping
    public List<Item> getItems() {
        return items;
    }

    // Endpoint untuk menambahkan item
    @PostMapping
    public String addItem(@RequestBody Item newItem) {
        // Logika untuk menambahkan item ke server, misalnya ke database
        items.add(newItem);
        return "Item added successfully.";
    }

    // Endpoint untuk menghapus item
    @PostMapping("/{id}/delete")
    public String deleteItem(@PathVariable int id) {
        // Logika untuk menghapus item dari server, misalnya dari database
        items.removeIf(item -> item.getId() == id);
        return "Item deleted successfully.";
    }

    // Endpoint untuk mendapatkan detail item
    @PostMapping("/{id}")
    public Item getItem(@PathVariable int id) {
        // Logika untuk mendapatkan detail item dari server, misalnya dari database
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Endpoint untuk mengupdate item
    @PostMapping("/{id}/update")
    public String updateItem(@PathVariable int id, @RequestBody Item updatedItem) {
        // Logika untuk mengupdate item di server, misalnya di database
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.set(i, updatedItem);
                return "Item updated successfully.";
            }
        }
        return "Item not found.";
    }
}
}
