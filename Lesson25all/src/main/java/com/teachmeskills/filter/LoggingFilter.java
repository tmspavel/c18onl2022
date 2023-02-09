package com.teachmeskills.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/*")
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {
//        System.out.println("(Filter) Start. The caller IP is " + request.getLocalAddr());
        System.out.println("1");
        try {
            System.out.println("2");
            chain.doFilter(request, response);
            System.out.println("3");
        } catch (Exception exception) {
            System.out.println("Exception " + exception.getMessage());
        }
        System.out.println("4");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
