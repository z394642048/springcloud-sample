package com.example.zuul.zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyZuulFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger( MyZuulFilter.class );


    @Override
    public String filterType() {
        System.out.println( "filterType" );
        return "pre";// 前置过滤器
    }

    @Override
    public int filterOrder() {
        System.out.println( "filterOrder" );
        return 0;// 优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        System.out.println( "shouldFilter" );
        return true;// 是否执行该过滤器，此处为true，说明需要过滤
    }

    /**
     * @return 返回null则表示放行
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info( String.format( "%s >>> %s", request.getMethod(), request.getRequestURL().toString() ) );
        Object accessToken = request.getParameter( "token" );
//        String refer = request.getHeader( "refer" );

        if (accessToken != null) {
            return null;
        }
        log.warn( "token is empty" );
        ctx.setSendZuulResponse( false );
        ctx.setResponseStatusCode( 401 );
        try {
            ctx.getResponse().getWriter().write( "token is empty" );
        } catch (Exception e) {
        }
        return null;
    }
}
