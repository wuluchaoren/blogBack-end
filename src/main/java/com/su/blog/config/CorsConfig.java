package com.su.blog.config;

import org.springframework.web.filter.CorsFilter;;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * Description:跨域配置
 *
 * @author Tianyu Su
 * @date 2019/02/09
 */

@Configuration
public class CorsConfig {
    private CorsConfiguration corsConfiguration(){
        CorsConfiguration ccf=new CorsConfiguration();
        ccf.addAllowedHeader("*");
        ccf.addAllowedMethod("*");
        ccf.addAllowedOrigin("*");
        ccf.setAllowCredentials(true);
        return ccf;
    }

    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",corsConfiguration());
        return new CorsFilter(source);
    }
}
