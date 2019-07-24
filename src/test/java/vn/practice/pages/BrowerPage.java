package vn.practice.pages;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

import net.serenitybdd.core.pages.PageObject;

public class BrowerPage extends PageObject{
	//Action
	//	mở trang chủ
	public void open_home_page() {
		open();
	}
	
//	mở trang có tên miền là "tên miền"
	public void get_link_web_page(String webURL) {
		getDriver().get(webURL);
	}
	
	
//	tải lại trang
	public void refresh_web_page() {
	//	onBrowerPage.waitForWithRefresh();
		getDriver().navigate().refresh();
		getDriver().navigate().refresh();
		getDriver().get(getDriver().getCurrentUrl());
		getDriver().navigate().to(getDriver().getCurrentUrl());
		
	}
	
//	nới rộng cửa sổ tối đa
	public void maximum_window() {
		getDriver().manage().window().maximize();
	}
	
//	đi đến trang trước
	public void back_web_page() {
		getDriver().navigate().back();
	}
	
//	đi đến trang sau
	public void forward_web_page() {
		getDriver().navigate().forward();
	}
	
//	mở trang có tên miền là "tên miền" trên cửa sổ mới và CHON NO  ??????????
	public void open_new_window_with_url() {
		getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
		getDriver().get("http://duckduckgo.com");
	}
//	mở liên kết "văn bản" trên cửa sổ mới và chọn nó
	
//   mở liên kết "tên miền" trong tab mới và chọn nó ???????????
	public void open_new_tab_with_url() {
		getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "abc");
		getDriver().get("http://facebook.com");
	}
//	mở hộp thoại "đối tượng" và chọn nó
	
//	quay lại cửa sổ ban đầu
	public void comeback_start() {
	
	}
	
//	cửa sổ được di chuyển tới vị trí có tọa độ (x, y)
	public void go_to_position_on_window() {
		Point p = new Point(100,100);
		getDriver().manage().window().setPosition(p);
	}
	
//	cửa sổ được thay đổi với kích thước (x,y)
	public void resize_window() {
		Dimension d = new Dimension(300,1080);
		getDriver().manage().window().setSize(d);
	}
	
//	đóng cửa sổ hiện tại
	public void close_current_window() {
		getDriver().close();
	}
	
//	cuộn màn hình lên hoặc xuống với giá trị (x,y)
	public void scroll_up_or_down_on_web_page() {
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("window.scrollBy(200,1000)");
	}
//	cuộn màn hình lên hoặc xuống tới một element xác định
	
	public void scroll_to_element_on_web_page() {
		
	}
// chuyển hướng trang web
	
	public void navigate_web_page() {
		getDriver().navigate().to("http://google.com.vn");
	}
//	cuộn màn hình sang trai hoặc phai với giá trị (x,y)
//	ẩn trang
// chọn một phần tử trong list các phần từ
//	kéo file vào trang (drag and drop)
//  tải file lên trang web - file upload
//	mouse hover
//  clik chuột phải 
	
//	Assert
//
//	kiểm tra trang này có chứa đoạn văn bản "văn bản"
	public void check_document_content_keyword(String expectStr) {
		String actualStr = "keyword";
		assertThat(actualStr).isEqualTo(expectStr);
	}
	
//	kiểm tra trang này không chứa đoạn văn bản "văn bản"
	public void check_document_not_content_keyword(String expectStr)
	{
		String actualStr = "keyword";
		assertThat(actualStr).isNotEqualTo(expectStr);
	}
	
//	kiểm tra tiêu đề trang là "tên trang"
	public void check_title(String expectStr) {
		String title = getDriver().getTitle();
		assertThat(expectStr).contains(title);
	}
//	kiểm tra tiêu đề trang không là "tên trang"
//	kiểm tra tiêu đề trang có chứa "tên trang"
//	kiểm tra tiêu đề trang không chứa "tên trang"
//	kiểm tra tên miền của trang là "tên miền"
//	kiểm tra tên miền của trang không là "tên miền"
}
