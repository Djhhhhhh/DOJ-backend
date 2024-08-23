package com.doj.doj.model.enums;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum JudgeInfoMessageENUM {

    ACCEPTED("成功","Accepted"),
    WRONG_ANSER("答案错误","Wrong Answer"),
    COMPILE_ERROR("编译错误","Compile Error"),
    MEMORY_LIMIT_EXCEEDED("内存溢出","Memory limit exceeded"),
    TIME_LIMIT_EXCEEDED("运行超时","Time limit exceeded"),
    PRESENTATION_ERROR("格式错误","Presentation Error"),
    WAITING("等待中","Waiting"),
    OUTPUT_LIMIT_EXCEEDED("输出溢出","Output Limit Exceeded"),
    RUNTIME_ERROR("运行错误","Runtime Error"),
    SYSTEM_ERROR("系统错误","System Error");

    private final String text;

    private final String value;

    JudgeInfoMessageENUM(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<String> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static JudgeInfoMessageENUM getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (JudgeInfoMessageENUM anEnum : JudgeInfoMessageENUM.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
