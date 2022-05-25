import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryStatementAndEveryBranch() {
        List<String> emptyList = createList();
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(emptyList));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        List<String> nonPerfectSquareList = createList("0", "0", "0", "0", "0", "0");
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(nonPerfectSquareList));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> PerfectSquareList = createList("0", "#", "0", "0", "0", "#", "#", "0", "#");
        List<String> correctList = createList("1", "#", "2", "1", "2", "#", "#", "2", "#");
        assertArrayEquals(correctList.toArray(), SILab2.function(PerfectSquareList).toArray());

//        "0", "#", "0",
//        "0", "0", "#",
//        "#", "0", "#"
//
//        "1", "#", "2",
//        "1", "2", "#",
//        "#", "2", "#"

    }


//    @Test
//    void testEveryBranch() {
//
//    }
}