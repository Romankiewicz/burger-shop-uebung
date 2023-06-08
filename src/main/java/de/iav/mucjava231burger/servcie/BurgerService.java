package de.iav.mucjava231burger.servcie;

import de.iav.mucjava231burger.model.Menu;
import de.iav.mucjava231burger.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BurgerService {

    private final MenuRepository menuRepository;

    public BurgerService(MenuRepository menuRepository) {

        this.menuRepository = menuRepository;
    }

    public List<Menu> getMenuBoard(){
        return menuRepository.getMenuBoard();

    }

    public Menu getMenuById(int requierdId){
        return menuRepository.getMenuById(requierdId);

    }

    public void addMenu(Menu menuToAdd){
         menuRepository.addMenu(menuToAdd);
    }

    public Menu changeMenu(int idOfMenuToChange, Menu menuToChange){
        return menuRepository.changeMenu(idOfMenuToChange, menuToChange);
    }

    public void deleteMenu(int idOfMenuToDelete){
        menuRepository.deleteMenu(idOfMenuToDelete);
    }
}
