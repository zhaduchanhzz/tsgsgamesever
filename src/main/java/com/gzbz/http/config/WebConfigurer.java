package com.gzbz.http.config;

import com.gzbz.http.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
   private final RequestInterceptor requestInterceptor;

   public WebConfigurer(RequestInterceptor requestInterceptor) {
      this.requestInterceptor = requestInterceptor;
   }

   public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(this.requestInterceptor).addPathPatterns(new String[]{"/**"});
   }
}
