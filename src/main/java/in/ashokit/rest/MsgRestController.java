package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	private static Logger logger = LoggerFactory.getLogger(MsgRestController.class);
  
	@GetMapping("/greet")
	 public String getMsg2() {
		logger.info("getMsg2().... started");
		 String msg="Good Evvening";
		 logger.info("getMsg2....ended");
		 return msg;
	 }
	
	@GetMapping("/welcome")
	public String getMsg() {
		logger.info("getmsg()........excetatuion started");

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			logger.error("Exception : " + e.getMessage());
		}

		String msg = "Welcome to ashokit....!!! ";
		return msg;
	}
}
