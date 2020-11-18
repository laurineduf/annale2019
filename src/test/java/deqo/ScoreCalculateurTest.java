package deqo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

public class ScoreCalculateurTest {

    @Test
    public void calculeScoreTest(){
        ScoreCalculateur sc = new ScoreCalculateur();
        Integer[] valeur  = {1,2,3,4,5,6};
        List<Integer> indicesReponseEtudiant= Arrays.asList(valeur);
        QuestionAChoix question = new QuestionAChoixExclusif("enonce",30);

        Integer[] val  = {1,2,3};
        List<Integer> indicesReponseEtudiant2= Arrays.asList(valeur);

        assertEquals("Erreur dans la fonction calculeScore",16.66, sc.calculeScore(indicesReponseEtudiant2,question), 0.01);
    }
}
