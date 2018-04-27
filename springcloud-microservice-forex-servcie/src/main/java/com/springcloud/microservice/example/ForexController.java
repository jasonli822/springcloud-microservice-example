package com.springcloud.microservice.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue
            (@PathVariable String from, @PathVariable String to) {

        /**
         * 从数据库中获取交换值
         */
        ExchangeValue exchangeValue =
                repository.findByFromAndTo(from, to);

        /**
         * 返回服务器端口，这将帮助我们识别那个实例服务正在给予回应
         */
        exchangeValue.setPort(
                Integer.parseInt(environment.getProperty("local.server.port")));

        return exchangeValue;
    }
}