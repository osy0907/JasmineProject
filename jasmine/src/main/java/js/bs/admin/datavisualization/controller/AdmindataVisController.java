package js.bs.admin.datavisualization.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public interface AdmindataVisController {
	public ModelAndView adminDataVisMain(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
