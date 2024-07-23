package com.bin.binojbackendjudgeservice.judge;

import com.bin.binojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.bin.binojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.bin.binojbackendjudgeservice.judge.strategy.JudgeContext;
import com.bin.binojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.bin.binojbackendmodel.model.codesandbox.JudgeInfo;
import com.bin.binojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
