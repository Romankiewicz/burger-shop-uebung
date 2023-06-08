package de.iav.mucjava231burger.repository;

import de.iav.mucjava231burger.model.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class MenuRepository {

    private List<Menu> menuBoard = new ArrayList<>();

    public MenuRepository(List<Menu> menuBoard) {

        this.menuBoard = menuBoard;
    }

    public List<Menu> getMenuBoard() {

        return menuBoard;
    }

    public Menu getMenuById(int requierdId) {

        for (Menu menuFromList : menuBoard) {
            if (menuFromList.id() == requierdId) {
                return menuFromList;
            }
        }
        throw new NoSuchElementException("The Menu " + requierdId + " is not on the Board.");
    }

    public void addMenu(Menu menuToAdd) {

        menuBoard.add(menuToAdd);
    }

    public Menu changeMenu(int idOfMenuToChange, Menu menuToChange) {

        Menu menuToDelete = this.getMenuById(idOfMenuToChange);
        menuBoard.remove(menuToDelete);
        Menu changedMenu = new Menu(idOfMenuToChange,
                                    menuToChange.name(),
                                    menuToChange.price(),
                                    menuToChange.mainDish(),
                                    menuToChange.sideDish(),
                                    menuToChange.beverage());
        menuBoard.add(changedMenu);
        return (changedMenu);
    }

    public void deleteMenu(int idOfMenuToDelete) {

        Menu menuToDelete = this.getMenuById(idOfMenuToDelete);
        menuBoard.remove(menuToDelete);
    }
}
