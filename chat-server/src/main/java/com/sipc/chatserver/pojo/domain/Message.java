package com.sipc.chatserver.pojo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author sterben
 * @since 2023-04-04
 */
@Getter
@Setter
@TableName("message")
public class Message implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("uid")
    private Integer uid;

    @TableField("room_id")
    private Integer roomId;

    @TableField("message")
    private String message;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("is_deleted")
    private Byte isDeleted;

    public Message(Integer uid, Integer roomId, String message) {
        this.uid = uid;
        this.roomId = roomId;
        this.message = message;
        this.createTime = LocalDateTime.now();
        this.updateTime = this.createTime;
    }

    public Message(){

    }
}
