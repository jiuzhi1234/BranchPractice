package com.jzp.gulimail.ware.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.jzp.gulimail.ware.dao")
@Configuration
public class WareMyBatisConfig {

    //引入分页依赖
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置请求的页面大于最大页后操作，true调回到首页，false继续请求 默认false
//        paginationInterceptor.setOverflow(true);
//        //设置最大单页限制数量，默认500条，-1不受限制
//        paginationInterceptor.setLimit(1000);
        return paginationInterceptor;
    }
}
