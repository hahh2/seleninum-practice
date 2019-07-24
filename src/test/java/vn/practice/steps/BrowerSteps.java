package vn.practice.steps;

import net.thucydides.core.annotations.Step;
import vn.practice.pages.BrowerPage;

public class BrowerSteps {
	BrowerPage onBrowerPage;

	@Step
	public void user_open_home_page() {
		onBrowerPage.open_home_page();
	}
	
	@Step
	public void user_get_link_web_page(String webURL) {
		onBrowerPage.get_link_web_page(webURL);
	}

	@Step
	public void user_refresh_web_page() {
		onBrowerPage.refresh_web_page();
	}
	
	@Step
	public void user_back_web_page() {
		onBrowerPage.back_web_page();
	}
	
	@Step
	public void user_forward_web_page() {
		onBrowerPage.forward_web_page();
	}
	
	@Step
	public void user_maximum_window() {
		onBrowerPage.maximum_window();
	}
	
	@Step
	public void user_open_new_window_with_url() {
		onBrowerPage.open_new_window_with_url();
	}
	
	@Step
	public void user_open_new_tab_with_url() {
		onBrowerPage.open_new_tab_with_url();
	}
	
	@Step
	public void user_resize_window() {
		onBrowerPage.resize_window();
	}
	
	@Step
	public void user_go_to_position_on_window() {
		onBrowerPage.go_to_position_on_window();
	}
	
	@Step
	public void user_close_current_window() {
		onBrowerPage.close_current_window();
	}
	
	@Step 
	public void user_scroll_up_or_down_on_web_page() {
		onBrowerPage.scroll_up_or_down_on_web_page();
	}
}
