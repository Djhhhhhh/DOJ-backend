package com.doj.doj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.doj.doj.model.entity.Question;
import com.doj.doj.service.QuestionService;
import com.doj.doj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-08-22 00:53:01
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




