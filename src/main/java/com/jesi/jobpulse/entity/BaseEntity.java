package com.jesi.jobpulse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter // 只给时间字段 getter（推荐），避免你手动 set 时间导致数据不一致
@MappedSuperclass // 告诉 JPA “这是父类，用来让子类继承字段映射，但它自己不是一张表”
public abstract class BaseEntity {

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private Instant updatedAt;
}