public class CreateAlbumAlert{
	WebDriver driver;
	public createAlbumalertTest(){
		WebElement createElement = driver.findElement(By.name("创建"));
		createElement.click();
	}
}
