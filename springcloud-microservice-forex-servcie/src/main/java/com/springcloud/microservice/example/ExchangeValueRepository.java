package com.springcloud.microservice.example;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 接口ExchangeValueRepository继承JpaRepository
 * findByFromAndTo - 我们希望查询从一种货币到另一种货币的转换价值
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    ExchangeValue findByFromAndTo(String from, String to);

}
