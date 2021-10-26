package com.library.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.LibraryManagement.entity.Records;

public interface RecordRepository extends JpaRepository<Records, Integer>{

}
