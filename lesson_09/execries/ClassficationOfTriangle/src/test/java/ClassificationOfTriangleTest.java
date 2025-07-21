import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassificationOfTriangleTest {

    @Test
    void testClassificationOfTriangle() {
        int trianle1 = 2;
        int trianle2 = 2;
        int trianle3 = 2;

        String result = ClassificationOfTriangle.triangle(trianle1, trianle2, trianle3);
        assertEquals("Tam giác đều", result);
    }

    @Test
    void testClassificationOfTriangle2() {
        int trianle1 = 2;
        int trianle2 = 2;
        int trianle3 = 3;

        String result = ClassificationOfTriangle.triangle(trianle1, trianle2, trianle3);
        assertEquals("Tam giác cân", result);
    }

    @Test
    void testClassificationOfTriangle3() {
        int trianle1 = 3;
        int trianle2 = 4;
        int trianle3 = 5;

        String result = ClassificationOfTriangle.triangle(trianle1, trianle2, trianle3);
        assertEquals("Tam giác thường", result);
    }

    @Test
    void testClassificationOfTriangle4() {
        int trianle1 = 8;
        int trianle2 = 2;
        int trianle3 = 3;

        String result = ClassificationOfTriangle.triangle(trianle1, trianle2, trianle3);
        assertEquals("Không phải là tam giác", result);
    }

    @Test
    void testClassificationOfTriangle5() {
        int trianle1 = -1;
        int trianle2 = 2;
        int trianle3 = 1;

        String result = ClassificationOfTriangle.triangle(trianle1, trianle2, trianle3);
        assertEquals("Không phải là tam giác", result);
    }

    @Test
    void testClassificationOfTriangle6() {
        int trianle1 = 0;
        int trianle2 = 1;
        int trianle3 = 1;

        String result = ClassificationOfTriangle.triangle(trianle1, trianle2, trianle3);
        assertEquals("Không phải là tam giác", result);
    }
}