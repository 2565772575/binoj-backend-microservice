package com.bin.binojbackendjudgeservice.judge.codesandbox;

import com.bin.binojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.bin.binojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
