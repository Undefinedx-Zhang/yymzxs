package com.huawei.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Ruijie Zhao
 */
@TableName("seat")
@Data
public class Seat {
    @TableId(type = IdType.AUTO)
    private Integer seatId;
    private Integer seatNumber;
    private Integer roomId;
}
