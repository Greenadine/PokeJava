package unittests.resources.common;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.common.Language;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LanguageTest extends PokeApiUnitTest {

    @Test
    void Get_Language_List() {
        final NamedApiResourceList languageList = api.getLanguages();

        assertTrue(languageList.getCount() > 0);
    }

    @Test
    void Get_Language_By_Id() {
        final Language language = api.getLanguageById(1);

        assertEquals(1, language.getId());
        assertEquals("ja-Hrkt", language.getName());
    }

    @Test
    void Get_Language_By_Name() {
        final Language language = api.getLanguageByName("ja");

        assertEquals(11, language.getId());
        assertEquals("ja", language.getName());
    }
}
