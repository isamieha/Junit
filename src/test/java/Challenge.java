import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;

public class Challenge {


    public int score(int[] nums){

        int score = 0,ones=0,twos=0,threes=0,fours=0,fives=0,sixes=0;

        for(int i = 0; i < nums.length; i++){

            switch (nums[i]){
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
                case 4:
                    fours++;
                    break;
                case 5:
                    fives++;
                    break;
                case 6:
                    sixes++;
                    break;
            }
        }

        if(ones == 1){
            score += 100;
        }if(fives == 1){
            score += 50;
        }
        if(ones >= 3 && ones < 6){
            score += 1000;
        }if(ones == 6){
            score += 1000*2;
        }
        if(twos >= 3 && twos < 6){
            score += 200;
        }if(twos == 6){
            score += 200*2;
        }
        if(threes >= 3 && threes < 6){
            score += 300;
        }if(threes == 6){
            score += 300*2;
        }
        if(fours >= 3 && fours < 6){
            score += 400;
        }if(fours == 6){
            score += 400*2;
        }
        if(fives >= 3 && fives < 6){
            score += 500;
        }if(fives == 6){
            score += 500*2;
        }
        if(sixes >= 3 && sixes < 6){
            score += 600;
        }if(sixes == 6){
            score += 600*2;
        }

        return score;
    }

    @Test
    public void testScore(){
        Challenge challenge = new Challenge();
        assertTrue(100==challenge.score(new int[]{1}));
        assertTrue(50==challenge.score(new int[]{5}));

        assertTrue(1000==challenge.score(new int[]{1,1,1, 3, 2, 6}));
        assertTrue(500==challenge.score(new int[]{5,5,5,1,1,2}));

        assertTrue(200==challenge.score(new int[]{2, 2, 3, 2, 3, 6}));
        assertTrue(300==challenge.score(new int[]{3,3,3,2,2,4}));


        assertTrue(400==challenge.score(new int[]{4,4,4,6,6,3}));
        assertTrue(600==challenge.score(new int[]{6,6,6,2,3,4}));


        assertTrue(2000==challenge.score(new int[]{1,1,1, 1, 1, 1}));
        assertTrue(400==challenge.score(new int[]{2,2,2,2,2,2}));

        assertTrue(600==challenge.score(new int[]{3,3,3,3,3,3}));
        assertTrue(800==challenge.score(new int[]{4,4,4,4,4,4}));

        assertTrue(1000==challenge.score(new int[]{5,5,5,5,5,5}));
        assertTrue(1200==challenge.score(new int[]{6,6,6,6,6,6}));

        assertTrue(750==challenge.score(new int[]{1,6,6,5,6,6}));
        assertTrue(0==challenge.score(new int[]{4,2,3,4,2,6}));

    }
}
