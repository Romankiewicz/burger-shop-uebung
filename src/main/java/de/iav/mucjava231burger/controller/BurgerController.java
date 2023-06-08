package de.iav.mucjava231burger.controller;

import de.iav.mucjava231burger.model.Menu;
import de.iav.mucjava231burger.servcie.BurgerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/burger")
public class BurgerController {

    private final BurgerService burgerService;

    public BurgerController(BurgerService burgerService) {

        this.burgerService = burgerService;
    }

    @GetMapping("/menus")
    public List<Menu> getMenuBoard(){
        return burgerService.getMenuBoard();
    }

    @GetMapping("/menus/{id}")
    public Menu getMenuById(@PathVariable int id){
        return burgerService.getMenuById(id);
    }

    @PostMapping("/menus")
    public void addMenu(@RequestBody Menu menuToAdd){
        burgerService.addMenu(menuToAdd);
    }

    @PutMapping("/menus/{id}")
    public Menu changeMenu(@PathVariable int id, @RequestBody Menu menuToChange){
        return burgerService.changeMenu(id, menuToChange);
    }

    @DeleteMapping("/menus/{id}")
    public void deleteMenu(@PathVariable int id){
        burgerService.deleteMenu(id);
    }
}
