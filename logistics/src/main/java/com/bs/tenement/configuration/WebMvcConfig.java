package com.bs.tenement.configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import com.bs.tenement.interceptors.AuthorInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.bs.tenement.controller","com.bs.tenement.interceptors"})
public class WebMvcConfig extends WebMvcConfigurerAdapter{
	
	private final static String CONTENT_TYPE = "text/html;charset=utf-8";

	@Autowired
	private AuthorInterceptor authorInterceptor;
	
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(authorInterceptor).addPathPatterns("/**").excludePathPatterns("/admin/login","/admin/logout","/index","/student/login","/student/logout");
	}
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver commonsMultipartResolver(){
		return new CommonsMultipartResolver();
	}
	
	/*@Bean
	public VelocityConfigurer getVelocityConfig(){
		Properties properties = new Properties();
		properties.put("input.encoding", "UTF-8");
		properties.put("output.encoding", "UTF-8");
		properties.put("contentType", CONTENT_TYPE);
		
		VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
		velocityConfigurer.setResourceLoaderPath("WEB-INF/views/");
		velocityConfigurer.setVelocityProperties(properties);
		return velocityConfigurer;
	}*/
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}
	
	/*@Bean
	public ViewResolver getViewResolver(){
		
		VelocityViewResolver velocityView = new VelocityViewResolver();
		velocityView.setSuffix(".html");
		velocityView.setAllowRequestOverride(true);
		velocityView.setAllowSessionOverride(true);
		velocityView.setExposeRequestAttributes(true);
		velocityView.setExposeSessionAttributes(true);
		velocityView.setRequestContextAttribute("rc");
		velocityView.setDateToolAttribute("dateTool");
		velocityView.setNumberToolAttribute("numberTool");
		velocityView.setContentType(CONTENT_TYPE);
		return velocityView;
	}*/
	
	
}
