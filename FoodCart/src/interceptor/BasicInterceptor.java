package interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class BasicInterceptor implements HandlerInterceptor{
	static Logger logger = Logger.getLogger(BasicInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		logger.info("After rendering the view");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		logger.info("After handling the request");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Before handling the request");
		System.out.println("Before handling the request");
		Enumeration<String> e = arg0.getHeaders("Referer");
		while(e.hasMoreElements()){
		System.out.println("Previous Page " + e.nextElement());
		}
		
		return true;
	}

}
