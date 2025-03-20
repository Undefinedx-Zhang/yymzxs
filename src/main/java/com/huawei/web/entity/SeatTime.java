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
@TableName("seat_time")
@Data
public class SeatTime {
    @TableId(type = IdType.AUTO)
    private Integer seatTimeId;
    private Integer seatId;
    private Integer reserveId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp beginTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp endTime;
}
