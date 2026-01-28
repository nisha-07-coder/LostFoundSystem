package dao;

import dto.ItemDTO;
import java.util.List;

public interface ItemDAO {
    boolean addItem(ItemDTO item);
    List<ItemDTO> getAllItems();
    boolean updateItemStatus(int itemId, String status);
}
