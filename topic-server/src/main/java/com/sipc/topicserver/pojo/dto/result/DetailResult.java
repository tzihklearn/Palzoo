package com.sipc.topicserver.pojo.dto.result;

import lombok.Data;

/**
 * @ClassName DetailResult
 * @Description TODO
 * @Author o3141
 * @Date 2023/4/4 14:39
 * @Version 1.0
 */
@Data
public class DetailResult {

    private String title;

    private String brief;

    private String content;

    private String authorName;

    private Integer watchNum;

    private Byte isFinish;

}
