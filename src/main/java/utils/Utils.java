package utils;

import com.gtm.constants.SystemConstant;
import com.gtm.pojo.EvaluationMethod;
import com.gtm.pojo.ScoreComponent;
import com.gtm.pojo.ScoreColumn;

public class Utils {

    public static boolean checkTotalWeight(EvaluationMethod evaluationMethod) {
        double totalWeight = 0;

        for (ScoreComponent scoreComponent : evaluationMethod.getScoreComponents()) {
            for (ScoreColumn scoreColumn : scoreComponent.getScoreColumns()) {
                totalWeight += scoreColumn.getWeight();
            }
        }

        return totalWeight == 1;
    }

    public static int checkThesisResult(double score) {
        if (score >= SystemConstant.SCORE_PASS) {
            return 3;
        } else {
            return 2;
        }
    }

}
