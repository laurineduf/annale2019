package deqo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionAChoixExclusifTest {

    @Test
    public void getEnonce() {
        QuestionAChoixExclusif q = new QuestionAChoixExclusif("enonce", 3);
        assertEquals("Erreur getEnonce()", "enonce", q.getEnonce());
    }

    @Test
    public void getScoreForIndice() {
        QuestionAChoixExclusif q = new QuestionAChoixExclusif("enonce", 3);
        assertNotEquals("Erreur getScoreForIndice()", 30.0, q.getScoreForIndice(3));
    }

}


