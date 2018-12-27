package org.jug.littlerock.rockjug.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This Controller will handle all of the NavBar Content, and make it available on all responses
 * This can also be configured to only run on certain paths.
 * FUTURE TODO: Enabling caching of this data, so that it is not re-fetched for every request.
 */
public class NavBarInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        // TODO: Some Authentication check here?
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        // TODO: Populate NavBar Information
    }
}
