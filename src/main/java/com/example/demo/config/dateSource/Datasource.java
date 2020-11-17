package com.example.demo.config.dateSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;


/**
 * 数据源配置
 *
 */
@Configuration
public class Datasource {

    /**
     * 创建会话工厂。
     * @param baseDataSource 数据源
     *
     *
     * @return 会话工厂
     */
    @Bean("sqlSessionFactory")
    @Primary
    public SqlSessionFactory getSqlSessionFactory(@Qualifier("dataSource") DataSource baseDataSource) {

        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(baseDataSource);
        try {
            //指定mapper路径
            bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/**/*.xml"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = null;
        try {
            sqlSessionFactory = bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }


}
