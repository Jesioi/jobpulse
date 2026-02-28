package com.jesi.jobpulse.entity;

import jakarta.persistence.*; //导入JPA相关的注解和类
import java.time.LocalDate; //导入Java 8的日期类
import java.time.Instant; //
import lombok.*; //导入Lombok相关的注解和类

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_applications") //指定数据库表名,只要你改这里，Hibernate 就会认新的表。
public class JobApplication extends BaseEntity {

    @Id //标记为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自动生成主键值
    private Long id;

    @Column(nullable = false) //指定公司名称不能为空
    private String company;

    @Column(nullable = false)
    private String position;

    private String location;

    @Enumerated(EnumType.STRING) //将枚举类型以字符串形式存储在数据库中
    @Column(nullable = false)
    private JobApplicationStatus status; 

    private LocalDate applicationDate; //使用LocalDate表示日期

    @Column(length = 1000, columnDefinition = "TEXT") //指定备注字段的长度为1000个字符,并且使用TEXT类型存储，以支持更长的文本内容
    private String notes;

    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @Column(nullable = false)
    private Instant updatedAt;


}
