package vn.practice.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.practice.steps.BrowerSteps;

@RunWith(SerenityRunner.class)
public class BrowerTest {
	@Managed
	WebDriver driver;
	
	@Steps
	BrowerSteps browerSteps;
	 
	@Test
	public void should_see_about_information_on_web_page(){
		browerSteps.user_open_home_page();
		browerSteps.user_scroll_up_or_down_on_web_page();
		//browerSteps.user_maximum_window();
		//browerSteps.user_resize_window();
		//browerSteps.user_get_link_web_page("http://google.com.vn");
		//browerSteps.user_refresh_web_page();
	//	browerSteps.user_back_web_page();
		//browerSteps.user_forward_web_page();
		//browerSteps.user_open_new_window_with_url();
		//browerSteps.user_close_current_window();
		//browerSteps.user_open_new_tab_with_url();
		//browerSteps.user_go_to_position_on_window();
	}
	
	

	
	
	

}
