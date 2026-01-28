package service;

import dao.ItemDAO;
import daoimpl.ItemDAOImpl;
import dto.ItemDTO;

import java.util.List;

public class ItemService {
    private final ItemDAO itemDAO;

    public ItemService() {
        this.itemDAO = new ItemDAOImpl();
    }

    public boolean addItem(ItemDTO item) {
        return itemDAO.addItem(item);
    }

    public List<ItemDTO> getAllItems() {
        return itemDAO.getAllItems();
    }

    public boolean updateItemStatus(int itemId, String status) {
        return itemDAO.updateItemStatus(itemId, status);
    }
}
