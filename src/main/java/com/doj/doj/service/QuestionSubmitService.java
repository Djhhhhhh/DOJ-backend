package com.doj.doj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.doj.doj.model.dto.questionsubmit.QuestionSubmitAddDTO;
import com.doj.doj.model.dto.questionsubmit.QuestionSubmitQueryDTO;
import com.doj.doj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.doj.doj.model.entity.User;
import com.doj.doj.model.vo.QuestionSubmitVO;

/**
* @author ASUS
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-08-22 00:53:13
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddDTO questionSubmitAddRequest, User loginUser);
    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryDTO questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);
}
