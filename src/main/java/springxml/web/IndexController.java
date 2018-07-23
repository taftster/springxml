package springxml.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class IndexController extends ParameterizableViewController {

    private static final String INDEX_MESSAGE = "Hello World! (via " + IndexController.class.getSimpleName() + ")";

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        // response.setStatus(200);
        // response.setContentType("text/plain");
        // response.getOutputStream().println(INDEX_MESSAGE);
        // return null;

        ModelAndView mav = new ModelAndView()
            .addObject("message", INDEX_MESSAGE);

        return mav;
    }

}
