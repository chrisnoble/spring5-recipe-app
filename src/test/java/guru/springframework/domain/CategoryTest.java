package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        Long idValue = 4l;

        category.setId(4l);
        assertEquals(idValue, category.getId());
    }

    @Test
    void getDescription() {

    }

    @Test
    void getRecipes() {
    }

}