package Services.Impl;

import Domain.Category;
import Repository.CategoryRepository;
import Services.CategoryServices;

/**
 * Created by Riyaad on 11/6/2017.
 */
//needs fixing
@Component
public class CategoryServiceImpl implements CategoryServices
{

    @Autowired
    CategoryRepository categoryRepository;


    public Category create(Category cat) {
        return categoryRepository.create(cat);
    }


    public Category read(long id) {
        return categoryRepository.read(id);
    }


    public Category update(Category cat) {
        return categoryRepository.update(cat);
    }


    public void delete(long id) {
        categoryRepository.delete(id);
    }


    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }


    public Iterable<Category> readAll() {
        return categoryRepository.readAll();
    }
}
