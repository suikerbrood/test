package de.bund.jki.sf.test.springmobile;

import java.util.logging.Logger;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
 * @author Abhijit Ghosh
 * @version 1.0
 */
@Controller
public class SpringMobileHelloController {
    private static final Logger logger = Logger.getLogger(SpringMobileHelloController.class.getName());
     
    @RequestMapping("/")
    public String sayHello(SitePreference sitePreference, Device device, Model model) {
        logger.info("SitePreference : " + sitePreference);
        logger.info("Device : " + device);
         
        model.addAttribute("message", "Hello World!");
         
        return "helloWorld";
    }
}
