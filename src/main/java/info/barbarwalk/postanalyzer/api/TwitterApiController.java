package info.barbarwalk.postanalyzer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Twitter関連のWebAPIコントローラ
 */
@RestController
@RequestMapping("/api")
public class TwitterApiController {

	/**
	 * テスト
	 */
	@GetMapping("/hellow")
	public String hello() {
		return "hellow";
	}
}
