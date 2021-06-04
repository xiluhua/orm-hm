package com.ramostear.hm.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ramostear on 2019/6/6 0006.
 */
@TableName("hm_user")// mybatis-plus
@Entity
@Table(name = "hm_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 7858262691294481727L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    @TableId(value = "user_id", type = IdType.AUTO)  // mybatis-plus
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "alias")
    private String alias;

    @Column(name = "age")
    private Integer age;
}
