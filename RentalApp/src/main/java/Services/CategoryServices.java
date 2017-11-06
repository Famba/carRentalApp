package Services;

import Domain.Category;

/**
 * Created by Riyaad on 11/6/2017.
 */
public interface CategoryServices
{

    Category create(Category category);
    Category read(long id);
    Category update(Category category);
    void delete(long id);
    Category findByName(String name);
    Iterable<Category> readAll();//finds all
}
