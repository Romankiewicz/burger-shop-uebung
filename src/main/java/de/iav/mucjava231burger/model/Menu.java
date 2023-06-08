package de.iav.mucjava231burger.model;

public record Menu(int id,
                    String name,
                    double price,
                    String mainDish,
                    String sideDish,
                    String beverage) {
}
