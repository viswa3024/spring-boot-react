package com.spring.react.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.react.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}