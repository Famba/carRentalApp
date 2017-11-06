package Factories;

import Domain.Category;

/**
 * Created by Riyaad on 11/6/2017.
 */
public class CategoryFactory
{
//CatFcatory
    public static Category getCategory(String name, double price)
    {
        Category cat = new Category.Builder()
                .catName(name)
                .catPrice(price)
                .build();
        return cat;
    }

}
