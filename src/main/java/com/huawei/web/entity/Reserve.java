package com.huawei.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Ruijie Zhao
 */
@TableName("reserve")
@Data
public class Reserve {
    @TableId(type = IdType.AUTO)
    private Integer reserveId;
    private String reserveUserAccount;
    private Integer reserveSeatNumber;
    private Integer reserveRoomId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp reserveTimeBegin;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp reserveTimeEnd;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp timeSignIn;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp timeSignOut;
    private Integer reserveState;
}
