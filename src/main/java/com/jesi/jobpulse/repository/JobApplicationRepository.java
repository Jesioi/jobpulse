package com.jesi.jobpulse.repository;

import com.jesi.jobpulse.entity.JobApplication; //实体类
import org.springframework.data.jpa.repository.JpaRepository; //

//Spring Data JPA 自动给你生成 save / findAll / findById / deleteById ...
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
}
