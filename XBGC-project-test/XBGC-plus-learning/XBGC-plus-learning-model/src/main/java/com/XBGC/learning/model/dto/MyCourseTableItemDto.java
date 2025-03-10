package com.XBGC.learning.model.dto;

import com.XBGC.learning.model.po.XcCourseTables;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author Mr.w
 * @version 1.0
 * @description 我的课程查询条件
 * @date 2025/2/6 9:42
 */
@Data
@ToString
public class MyCourseTableItemDto extends XcCourseTables {

    /**
     * 最近学习时间
     */
    private LocalDateTime learnDate;

    /**
     * 学习时长
     */
    private Long learnLength;

    /**
     * 章节id
     */
    private Long teachplanId;

    /**
     * 章节名称
     */
    private String teachplanName;


}
