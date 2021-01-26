package gmailcomose;

		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class task1 {

		
			public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver","C:\\Users\\cpe\\workspace\\Google\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://mail.google.com");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("varsha1537");
				driver.findElement(By.className("VfPpkd-RLmnJb")).click();
				
				driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Akash@1537");
				driver.findElement(By.className("VfPpkd-RLmnJb")).click();
				
				driver.findElement(By.className("z0")).click();
				driver.findElement(By.className("vO")).click();
				
				driver.findElement(By.className("aoD hl")).sendKeys("patilakash963@gmal.com");
				driver.findElement(By.name("subjectbox")).sendKeys("Text message");
				driver.findElement(By.className("Am")).sendKeys("Hello Good morning");
				driver.findElement(By.className("dC")).click();
				Thread.sleep(10000);
				driver.findElement(By.className("gb_Da")).click();
				driver.findElement(By.className("gb_Db")).click();
				driver.close();
			}
			}


