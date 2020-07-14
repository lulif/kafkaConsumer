package com.iot.ibms.ibms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * @author lulif
 * @program: msg_consumer
 * @create 2020-07-14 20:58
 **/
@Data
@Table("user")
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class User {
    @PrimaryKey
    private int id;
    private String user_name;
}
