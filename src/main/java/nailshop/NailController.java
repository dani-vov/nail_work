package nailshop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
 public class NailController {

@RequestMapping(value = "/",
        method = RequestMethod.GET,
        produces = "application/json;charset=UTF-8")

public void nailRequest(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        System.out.println("##### /nail/nailRequest  called #####");
        }
 }
