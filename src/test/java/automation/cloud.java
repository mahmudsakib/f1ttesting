package automation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cloud {



    private static WebDriver driver;
    private static final String baseUrl = "https://java.f1tdemo.xyz/login";

    @BeforeClass
    public static void setUp() {
        // Setup ChromeDriver automatically using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = (WebDriver) new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open application
        driver.get(baseUrl);
    }
    
    
    
    /*@Test(priority = 1)
    public void test_ValidEmailInvalidPassword() throws InterruptedException {
        driver.get(baseUrl); // Reload login page

        // Enter valid email
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        emailField.clear();
        emailField.sendKeys("mahmudsakib17@gmail.com");
        Thread.sleep(2000);

        // Enter wrong password
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.clear();
        passwordField.sendKeys("1212123456");
        Thread.sleep(2000);
        
//        WebElement eyeIcon = driver.findElement(By.xpath("//button[.//svg[contains(@class,'lucide-eye')]]"));
//        eyeIcon.click();
//        Thread.sleep(2000);

        // Click login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        // Print result
        System.out.println("❌ Test 1: Valid Email + Wrong Password → Expected: Login Failed / Error Message");

    }*/
    
    

   /* @Test(priority = 2)
    public void test_InvalidEmailValidPassword() throws InterruptedException {
        driver.get(baseUrl); // Reload login page

        // Enter invalid email
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        emailField.clear();
        emailField.sendKeys("mahmudsakib17@gmail.co");
        Thread.sleep(2000);

        // Enter valid password
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.clear();
        passwordField.sendKeys("default-password");
        Thread.sleep(2000);
        
//        WebElement eyeIcon = driver.findElement(By.xpath("//svg[contains(@class,'lucide-eye')]"));
//        eyeIcon.click();
//        Thread.sleep(2000);

        // Click login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        // Print result
        System.out.println("❌ Test 2: Invalid Email + Valid Password → Expected: Login Failed / Error Message");

    }*/
    
    

    @Test(priority = 3)
    public void test_ValidLogin() throws InterruptedException {
    	// Enter valid email
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        emailField.clear();
        emailField.sendKeys("seleniumjava@gmail.com");
        //Thread.sleep(2000);

        // Enter valid password
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.clear();
        passwordField.sendKeys("default-password");
        //Thread.sleep(2000);
        
//        WebElement eyeIcon = driver.findElement(By.xpath("//svg[contains(@class,'lucide-eye')]"));
//        eyeIcon.click();
//        Thread.sleep(2000);

        // Click login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        // Print result
        System.out.println("✅ Test 3: Valid Email + Valid Password → Expected: Login Successful");

    }
    
    /*@Test(priority = 4)
    public void test_dashboard() throws InterruptedException {
        // Click on Dashboard menu
        driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
        Thread.sleep(2000);

        // ✅ Verify if Dashboard page is displayed
        WebElement dashboardHeader = driver.findElement(By.xpath("//div[.//div[text()='Active Members']]"));
        
        // Assertion - if this element is not displayed, test will FAIL
        Assert.assertTrue(dashboardHeader.isDisplayed());

        System.out.println("✅ Dashboard page is working fine!");
    }*/

    
    /*@Test(priority = 5)
    public void test_createrole() throws InterruptedException {


    	// Navigate to Role Permissions
    	driver.findElement(By.xpath("//span[normalize-space()='Role Permissions']")).click();
    	Thread.sleep(2000);

    	// Click Create Role button
    	driver.findElement(By.xpath("//a[text()='Create Role']")).click();
    	Thread.sleep(2000);

    	String uniqueRoleName = "Staff " + System.currentTimeMillis();

    	WebElement nameEnglish = driver.findElement(By.xpath("//input[@placeholder='Name (English)']"));
    	nameEnglish.clear();
    	nameEnglish.sendKeys(uniqueRoleName);

    	WebElement nameArabic = driver.findElement(By.xpath("//input[@placeholder='Name (Arabic)']"));
    	nameArabic.clear();
    	nameArabic.sendKeys("مدير " + System.currentTimeMillis());


    	// ✅ Condition for Submit Button
    	WebElement submitBtn = driver.findElement(By.xpath("//button[span[normalize-space()='Submit']]"));
    	Thread.sleep(2000);
    	if (submitBtn.isEnabled() && submitBtn.isDisplayed()) {
    		submitBtn.click();
    		System.out.println("✅ Create Role successfully!");
    	} else {
    		System.out.println("❌ Create Role Not Working!");
    	}
    	Thread.sleep(2000);   

    }*/
    
    
    
    /*@Test(priority = 6)
    public void test_createBranch() throws InterruptedException {

        // 👉 Step 1: Navigate to Branch Management
    	WebElement branchesMenu = driver.findElement(By.xpath("//a[@href='/branches' and span[normalize-space()='Branches']]"));
    	branchesMenu.click();
        Thread.sleep(2000);       
        
        // 👉 Step 2: Click Create Branch button
        driver.findElement(By.xpath("//a[normalize-space()='Create Branch']")).click();
        Thread.sleep(2000);
        
        
        
     // 👉 Generate unique suffix for regression testing
        String uniqueSuffix = String.valueOf(System.currentTimeMillis());

        // 1. Branch Name (English)
        WebElement branchNameEn = driver.findElement(By.xpath("//input[@placeholder='Branch Name (English)']"));
        branchNameEn.clear();
        branchNameEn.sendKeys("Test Branch " + uniqueSuffix);
        

        // 2. Branch Name (Arabic)
        WebElement branchNameAr = driver.findElement(By.xpath("//input[@placeholder='Branch Name (Arabic)']"));
        branchNameAr.clear();
        branchNameAr.sendKeys("فرع " + uniqueSuffix);

        // 3. Email Address
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        emailField.clear();
        emailField.sendKeys("branch" + uniqueSuffix + "@test.com");

        // 4. Phone Number
        WebElement phoneField = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
        phoneField.clear();
        phoneField.sendKeys("01712345678");


     // --- Unique suffix for each run ---
        String uniqueSuffix1 = String.valueOf(System.currentTimeMillis());

//        // 1. Active Status
//        new Select(driver.findElement(By.id("active_status"))).selectByVisibleText("Active");

        // 2. Branch Size
        WebElement branchSizeField = driver.findElement(By.xpath("//input[@placeholder='Branch Size (Square Foot)']"));
        branchSizeField.clear();
        branchSizeField.sendKeys("2500" + uniqueSuffix1);

        // 3. Capacity
        WebElement capacityField = driver.findElement(By.xpath("//input[@placeholder='Branch Capacity']"));
        capacityField.clear();
        capacityField.sendKeys("300" + uniqueSuffix1);
        
     // 3. Grace
        WebElement graceField1 = driver.findElement(By.xpath("//input[@placeholder='Membership Grace Period (Days)']"));
        graceField1.clear();
        graceField1.sendKeys("300" + uniqueSuffix1);

//     // 1. Click the dropdown button
//        WebElement currencyDropdownButton = driver.findElement(By.xpath("//button[@id=':r6j:-form-item']"));
//        currencyDropdownButton.click();
//        System.out.println("work2");
//
//        // Wait a little to make sure the options are visible
//        Thread.sleep(1000); // or use WebDriverWait
//
//        // 2. Select the first option from the dropdown
//        WebElement firstOption = driver.findElement(By.xpath("//div[@role='option'][1]"));
//        firstOption.click();
//        System.out.println("work3");
//
//        // OR select a specific option, e.g., BDT
//        WebElement bdtOption = driver.findElement(By.xpath("//div[@role='option' and text()='BDT']"));
//        bdtOption.click();
//
//        System.out.println("work4");


//     // 1. Click the Time Zone dropdown button
//        WebElement timeZoneDropdownButton = driver.findElement(By.id(":r6l:-form-item"));
//        timeZoneDropdownButton.click();
//
//        // Wait until options are visible (better than Thread.sleep)
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // 2. Select a specific option, e.g., "UTC+06:00"
//        WebElement desiredTimeZone = wait.until(ExpectedConditions.elementToBeClickable(
//            By.xpath("//div[@role='option' and text()='UTC+06:00']")));
//        desiredTimeZone.click();
//
//        // OR select the first option if you want it dynamically
//        WebElement firstOption1 = wait.until(ExpectedConditions.elementToBeClickable(
//            By.xpath("//div[@role='option'][1]")));
//        firstOption1.click();


        // 6. Membership Transfer Fee
        WebElement transferFeeField = driver.findElement(By.xpath("//input[@placeholder='Membership Transfer Fee']"));
        transferFeeField.clear();
        transferFeeField.sendKeys("100" + uniqueSuffix1);

        // 7. Inter Gym Transfer Fee
        WebElement interGymFeeField = driver.findElement(By.xpath("//input[@placeholder='Inter Gym Transfer Fee']"));
        interGymFeeField.clear();
        interGymFeeField.sendKeys("50" + uniqueSuffix1);

        // 8. Daily Check-in Target
        WebElement checkInTargetField = driver.findElement(By.xpath("//input[@placeholder='Daily Check-in Target']"));
        checkInTargetField.clear();
        checkInTargetField.sendKeys("200" + uniqueSuffix1);

//        // 9. Is Primary Branch
//        new Select(driver.findElement(By.id("is_primary_branch"))).selectByVisibleText("No");

        
     // --- Address Line 1 & 2 ---
    	driver.findElement(By.name("address_line_1")).sendKeys("Address1_" + uniqueSuffix);
    	driver.findElement(By.name("address_line_2")).sendKeys("Address2_" + uniqueSuffix);

//    	// --- Country ---
//    	WebElement countryBtn = driver.findElement(By.xpath("//button[@id=':r6u:-form-item']"));
//    	countryBtn.click();
//    	Thread.sleep(500);
//    	WebElement countryOption = driver.findElement(By.xpath("(//div[@role='option'])[5]")); // Bangladesh
//    	countryOption.click();

    	// --- State, City, Zip ---
    	driver.findElement(By.name("state")).sendKeys("State_" + uniqueSuffix);
    	driver.findElement(By.name("city")).sendKeys("City_" + uniqueSuffix);
    	driver.findElement(By.name("postal_code")).sendKeys("12345");
    	
    	
    	// 6. Membership Transfer Fee - VAT Number
    	WebElement vatNumberField = driver.findElement(By.xpath("//input[@placeholder='VAT Number']"));
    	vatNumberField.clear();
    	vatNumberField.sendKeys("100" + uniqueSuffix1);

    	// 6. Membership Transfer Fee - Company Registration Number
    	WebElement companyRegNumberField = driver.findElement(By.xpath("//input[@placeholder='Company Registration Number']"));
    	companyRegNumberField.clear();
    	companyRegNumberField.sendKeys("100" + uniqueSuffix1);
    	

    	// 6. Membership Transfer Fee - Company Address (For Invoice)
    	WebElement companyAddressField = driver.findElement(By.xpath("//textarea[@name='company_address']"));
    	companyAddressField.clear();
    	companyAddressField.sendKeys("100" + uniqueSuffix1);


       

        // 👉 Step 5: Submit the form
        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        Thread.sleep(2000);
        if (submitBtn.isEnabled() && submitBtn.isDisplayed()) {
            submitBtn.click();
            System.out.println("✅ Branch creation submitted");
        } else {
            System.out.println("❌ Submit button not working!");
            return;
        }

        Thread.sleep(3000);

        // 👉 Step 6: Verify branch appears in list
        // adjust xpath for your branch table row/column
        boolean branchExists = driver.findElement(By.xpath("//table")).getText().contains((CharSequence) branchNameEn);
        if (branchExists) {
            System.out.println("✅ Branch created & verified in list: " + branchNameEn);
        } else {
            System.out.println("❌ Branch not found in list after creation!");
            return;
        }

    }*/

    
    
    /*@Test(priority = 7)
    public void test_CreateUser() throws InterruptedException {
        // Navigate to User Management → Create User
        driver.findElement(By.xpath("//a[normalize-space()='User Management']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button//a[normalize-space()='Create User']")).click();
        Thread.sleep(2000);

        // Generate unique suffix for regression testing
        String uniqueSuffix = String.valueOf(System.currentTimeMillis());

        // 1. First Name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.clear();
        firstName.sendKeys("John" + uniqueSuffix);

        // 2. Last Name
        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.clear();
        lastName.sendKeys("Doe" + uniqueSuffix);

        // 3. Email Address
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.clear();
        email.sendKeys("john.doe" + uniqueSuffix + "@example.com");
        
        

//     // --- 1. Open the date picker ---
//        WebElement datePickerBtn = driver.findElement(By.xpath("//button[normalize-space()='Pick a date']"));
//        datePickerBtn.click();
//        Thread.sleep(1000);
//
//        // --- 2. Select today's date dynamically ---
//        LocalDate today = LocalDate.now();
//        String day = String.valueOf(today.getDayOfMonth());
//
//        // Find the current day in the calendar popup
//        WebElement todayElement = driver.findElement(By.xpath("//button[@role='gridcell' and normalize-space()='" + day + "']"));
//        todayElement.click();
//        System.out.println("work");
//        
//        WebElement datePickerBtn2 = driver.findElement(By.xpath("//button[normalize-space()='Pick a date']"));
//        datePickerBtn2.click();
//        Thread.sleep(1000);
//
//        System.out.println("✅ Picked today's date: " + today);
        
        
 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // --- 1. Open the date picker ---
        WebElement datePickerBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.id(":r18q:-form-item"))
        );
        datePickerBtn.click();

        // --- 2. Wait for the calendar popup to appear ---
        String calendarId = datePickerBtn.getAttribute("aria-controls");
        WebElement calendarPopup = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id(calendarId))
        );

        // --- 3. Get today's date ---
        LocalDate today = LocalDate.now();
        String day = String.valueOf(today.getDayOfMonth());

        // --- 4. Click on today's date ---
        WebElement todayElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        calendarPopup.findElement(By.xpath(".//button[@role='gridcell' and normalize-space()='" + day + "']"))
                )
        );
        todayElement.click();

        // --- 5. Wait for popup to close ---
        wait.until(ExpectedConditions.invisibilityOf(calendarPopup));

        System.out.println("✅ Picked today's date: " + today);

        


     // Check if the field is required
        WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file' and @name='avatar']"));
        
        String required = uploadInput.getAttribute("aria-invalid"); 
        if (required != null && required.equals("true")) {
            // Field is required → upload dummy file
            uploadInput.sendKeys("C:\\Users\\YourName\\Pictures\\dummy.jpg");
            System.out.println("⚡ Required → uploaded dummy profile pic.");
        } else {
            // Field is optional → skip
            System.out.println("ℹ️ Profile picture is optional. Skipped upload.");
        }
        
     // 6. Gender (dropdown)
        WebElement genderBtn = driver.findElement(By.xpath("//label[normalize-space()='Gender']"));
        genderBtn.click();
        System.out.println("work1");
        Thread.sleep(1000);
        WebElement maleOption = driver.findElement(By.xpath("//div[@role='option' and normalize-space()='Male']"));
        maleOption.click();
        
        System.out.println("work");
        

     // 7. User Roles (multi-select dropdown)
        WebElement roleBtn = driver.findElement(By.xpath("//button[@id='roles']"));
        roleBtn.click();
        Thread.sleep(1000);

        // Find all role options inside the dropdown
        List<WebElement> roleOptions = driver.findElements(By.xpath("//div[@role='option']"));

        if (!roleOptions.isEmpty()) {
            // Select the first available role
            WebElement firstRole = roleOptions.get(0);
            String selectedRole = firstRole.getText();
            firstRole.click();
            System.out.println("✅ Selected first role: " + selectedRole);
        } else {
            System.out.println("❌ No roles available to select!");
        }

        // Close dropdown (optional, depends on UI)
        roleBtn.click();


        // 8. Contact Number
        WebElement contactNumber = driver.findElement(By.xpath("//input[@id='contact_number']"));
        contactNumber.clear();
        contactNumber.sendKeys("+880171234567" + uniqueSuffix.substring(uniqueSuffix.length() - 3));
        

        // 9. Emergency Contact Person
        WebElement emergencyName = driver.findElement(By.xpath("//input[@name='emergency_contact_name']"));
        emergencyName.clear();
        emergencyName.sendKeys("Emergency " + uniqueSuffix);

        // 10. Emergency Contact Number
        WebElement emergencyNumber = driver.findElement(By.xpath("//input[@id='emergency_contact_number']"));
        emergencyNumber.clear();
        emergencyNumber.sendKeys("+88018123456" + uniqueSuffix.substring(uniqueSuffix.length() - 2));
        
        
     // 7. Address Line 1
        WebElement address1 = driver.findElement(By.xpath("//input[@name='address_line_1']"));
        address1.clear();
        address1.sendKeys("123 Test Street " + uniqueSuffix);

        // 8. Address Line 2 (optional)
        WebElement address2 = driver.findElement(By.xpath("//input[@name='address_line_2']"));
        address2.clear();
        address2.sendKeys("Suite 45");
        Thread.sleep(2000);
       

        // 9. Country (dropdown)
        WebElement countryBtn = driver.findElement(By.xpath("//button[span[text()='Select']]"));
        countryBtn.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='option' and normalize-space()='Bangladesh']")).click();
        

        // 10. State
        WebElement state = driver.findElement(By.xpath("//input[@placeholder='State']"));
        state.clear();
        state.sendKeys("Dhaka");
        

        // 11. City
        WebElement city = driver.findElement(By.xpath("//input[@placeholder='City']"));
        city.clear();
        city.sendKeys("Dhaka");
        Thread.sleep(2000);
        

        // 12. Zip Code
        WebElement zip = driver.findElement(By.xpath("//input[@placeholder='Zip Code']"));
        zip.clear();
        zip.sendKeys("1205");
        
     // Click on Branches dropdown
        WebElement branchDropdown = driver.findElement(By.xpath("//label[normalize-space()='Branches']"));
        branchDropdown.click();
        Thread.sleep(1000);

        // Get all available branch options
        List<WebElement> branchOptions = driver.findElements(By.xpath("//div[@role='option']"));

        if (!branchOptions.isEmpty()) {
            // Select the first branch
            branchOptions.get(0).click();
            System.out.println("✅ Selected Branch: " + branchOptions.get(0).getText());
        } else {
            System.out.println("❌ No branch options available!");
        }
        
     // Click on Languages dropdown
        WebElement langDropdown = driver.findElement(By.xpath("//label[normalize-space()='Languages']"));
        langDropdown.click();
        Thread.sleep(1000);

        // Get all language options
        List<WebElement> langOptions = driver.findElements(By.xpath("//div[@role='option']"));

        if (!langOptions.isEmpty()) {
            // Select the first language
            langOptions.get(0).click();
            System.out.println("✅ Selected Language: " + langOptions.get(0).getText());
        } else {
            System.out.println("❌ No language options available!");
        }



        // ✅ Submit button
        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        if (submitBtn.isEnabled() && submitBtn.isDisplayed()) {
            submitBtn.click();
            System.out.println("✅ User created successfully with unique data!");
        } else {
            System.out.println("❌ Submit button not clickable!");
        }

        Thread.sleep(3000);
    }*/
    
    
    
    /*@Test(priority = 8)
    public void test_CreateLead() throws InterruptedException {
    	
    	// Navigate to Leads → Create Lead
        driver.findElement(By.xpath("//a[normalize-space()='Leads']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space()='Create Lead']")).click();
        Thread.sleep(2000);

        // Generate unique suffix for regression testing
        String uniqueSuffix = String.valueOf(System.currentTimeMillis());

        // 1. First Name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.clear();
        firstName.sendKeys("John" + uniqueSuffix);

        // 2. Last Name
        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.clear();
        lastName.sendKeys("Doe" + uniqueSuffix);

        // 3. Email Address
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.clear();
        email.sendKeys("john.doe" + uniqueSuffix + "@example.com");
        Thread.sleep(2000);

        // 4. Phone Number
        WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone Number' and @type='tel']"));
        phone.clear();
        phone.sendKeys("+88017" + uniqueSuffix.substring(uniqueSuffix.length() - 8));

        // 5. Lead Status (dropdown)
        WebElement statusBtn = driver.findElement(By.xpath("//label[text()='Lead Status']"));
        statusBtn.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='option' and normalize-space()='New']")).click();

        // 6. Assigned Staff (dropdown → select first option if available)
        WebElement staffBtn = driver.findElement(By.xpath("//label[text()='Assigned Staff']"));
        staffBtn.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='option'][1]")).click();
        Thread.sleep(2000);
        
        

        // 7. Address Line 1
        WebElement address1 = driver.findElement(By.xpath("//input[@name='address_line_1']"));
        address1.clear();
        address1.sendKeys("123 Test Street " + uniqueSuffix);

        // 8. Address Line 2 (optional)
        WebElement address2 = driver.findElement(By.xpath("//input[@name='address_line_2']"));
        address2.clear();
        address2.sendKeys("Suite 45");
        Thread.sleep(2000);
       

        // 9. Country (dropdown)
        WebElement countryBtn = driver.findElement(By.xpath("//button[span[text()='Select']]"));
        countryBtn.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='option' and normalize-space()='Bangladesh']")).click();
        

        // 10. State
        WebElement state = driver.findElement(By.xpath("//input[@placeholder='State']"));
        state.clear();
        state.sendKeys("Dhaka");
        

        // 11. City
        WebElement city = driver.findElement(By.xpath("//input[@placeholder='City']"));
        city.clear();
        city.sendKeys("Dhaka");
        Thread.sleep(2000);
        

        // 12. Zip Code
        WebElement zip = driver.findElement(By.xpath("//input[@placeholder='Zip Code']"));
        zip.clear();
        zip.sendKeys("1205");
        


        // ✅ Submit button
        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        if (submitBtn.isEnabled() && submitBtn.isDisplayed()) {
            submitBtn.click();
            System.out.println("✅ Lead created successfully with unique data!");
        } else {
            System.out.println("❌ Submit button not clickable!");
        }

        Thread.sleep(2000);
       
    
    }*/
    
    
    /*@Test(priority = 9)
    public void test_CreateActivity() throws InterruptedException {

    	// Navigate to Leads → Create Lead
    	driver.findElement(By.xpath("//span[normalize-space()='Activities']")).click();
    	Thread.sleep(2000);

    	driver.findElement(By.xpath("//a[normalize-space()='Create Activity']")).click();
    	Thread.sleep(2000);


    	// Generate unique suffix for regression testing
        String uniqueSuffix = String.valueOf(System.currentTimeMillis());

        // 1. Select Lead
        WebElement selectLeadBtn = driver.findElement(By.xpath("//button[@role='combobox' and contains(text(),'Select')]"));
        selectLeadBtn.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='option'][1]")).click(); // Select first lead
        Thread.sleep(500);
        

//        // 2. Appointment Date
//        WebElement appointmentDateBtn = driver.findElement(By.xpath("//button[span[text()='Appointment Date']]"));
//        appointmentDateBtn.click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[contains(@aria-label,'Choose today')]")).click(); // Pick today
//        Thread.sleep(500);
//        System.out.println("work2");
        
        
     // 1️⃣ Click on Appointment Date button to open the datepicker
        WebElement appointmentBtn = driver.findElement(By.xpath("//button[span[text()='Appointment Date']]"));
        appointmentBtn.click();
        Thread.sleep(1000);
        

        // 2️⃣ Get today's date
        LocalDate today = LocalDate.now();
        String day = String.valueOf(today.getDayOfMonth());

        // 3️⃣ Select the day dynamically
        WebElement dayBtn = driver.findElement(By.xpath("//button[@name='day' and text()='" + day + "']"));
        dayBtn.click();
        Thread.sleep(1000);

        System.out.println("✅ Current date selected: " + today);
        
     // Appointment Time in 24-hour format
        WebElement appointmentTime = driver.findElement(By.xpath("//input[@placeholder='Appointment Time']"));
        appointmentTime.clear();

        // Example: 12:00 PM → 12:00
        appointmentTime.sendKeys("12:00:00");

        // Example: 3:00 PM → 15:00
        // appointmentTime.sendKeys("15:00");

        Thread.sleep(500);

        System.out.println("work");

        // 4. Duration (Minutes)
        WebElement duration = driver.findElement(By.xpath("//input[@name='duration']"));
        duration.clear();
        duration.sendKeys("60");

        // 5. Type of Activity
        WebElement activityBtn = driver.findElement(By.xpath("//button[@role='combobox' and span[text()='Select']]"));
        activityBtn.click();
        
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@role='option'][1]")).click();
        


        // 7. Activity Status
        WebElement statusBtn = driver.findElement(By.xpath("//button[@role='combobox' and span[text()='Incomplete']]"));
        statusBtn.click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@role='option'][2]")).click();

        // 8. Additional Notes
        WebElement notes = driver.findElement(By.xpath("//textarea[@name='notes']"));
        notes.clear();
        notes.sendKeys("Test notes " + uniqueSuffix);

//        // 9. Check In Time
//        WebElement checkIn = driver.findElement(By.xpath("//input[@placeholder='Check In Time']"));
//        checkIn.clear();
//        checkIn.sendKeys("12:00");
//
//        // 10. Check Out Time
//        WebElement checkOut = driver.findElement(By.xpath("//input[@placeholder='Check Out Time']"));
//        checkOut.clear();
//        checkOut.sendKeys("12:00");
//        
        
//        // 11. Gym Visit Status
//        WebElement gymVisitBtn = driver.findElement(By.xpath("//button[@id=':r7v:-form-item']"));
//        gymVisitBtn.click();
//        Thread.sleep(1000);
//        System.out.println("work4");
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//div[@role='option'][2]")).click();
        

        // 12. Check In Notes
        WebElement checkInNotes = driver.findElement(By.xpath("//textarea[@name='gym_visit_notes']"));
        checkInNotes.clear();
        checkInNotes.sendKeys("Check in note " + uniqueSuffix);

        // ✅ Submit button
        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']//span[text()='Submit']/parent::button"));
        if (submitBtn.isEnabled() && submitBtn.isDisplayed()) {
            submitBtn.click();
            System.out.println("✅ Lead Activity created successfully with unique data!");
        } else {
            System.out.println("❌ Submit button not clickable!");
        }

        Thread.sleep(10000);


    }*/
    
    
   /*@Test(priority = 10)
    public void test_Createtrainerspecialty() throws InterruptedException {

    	// Navigate to Settings
    	driver.findElement(By.xpath("//span[normalize-space()='Settings']")).click();
    	Thread.sleep(2000);

    	// Navigate to Trainer Specialty
    	driver.findElement(By.xpath("//button[normalize-space(text())='Trainer Specialty']")).click();
    	Thread.sleep(2000);

    	// Click on Create Specialty
    	driver.findElement(By.xpath("//button[normalize-space(text())='Create Specialty']")).click();
    	Thread.sleep(2000);
    	
    	
    	// --- Generate unique suffix for regression (avoid duplicates) ---
    	String uniqueSuffix = String.valueOf(System.currentTimeMillis());

    	// --- English Name ---
    	WebElement nameEn = driver.findElement(By.xpath("//input[@name='name_en']"));
    	nameEn.clear();
    	nameEn.sendKeys("Trainer_EN_" + uniqueSuffix);

    	// --- Arabic Name ---
    	WebElement nameAr = driver.findElement(By.xpath("//input[@name='name_ar']"));
    	nameAr.clear();
    	nameAr.sendKeys("مدرب_" + uniqueSuffix);

//    	// --- Active Status Dropdown ---
//    	WebElement activeDropdown = driver.findElement(By.xpath("//button[@id=':r8e:-form-item']"));
//    	activeDropdown.click();
//    	System.out.println("work");
//
//    	// --- Select "Active" option ---
//    	WebElement activeOption = driver.findElement(By.xpath("//div[@role='option' and normalize-space(text())='Active']"));
//    	activeOption.click();
//    	
//    	System.out.println("work1");

    	// --- Submit Button ---
    	WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']//span[text()='Submit']/parent::button"));
    	if (submitBtn.isEnabled() && submitBtn.isDisplayed()) {
    	    submitBtn.click();
    	    System.out.println("✅ Trainer Specialty created successfully with unique data!");
    	} else {
    	    System.out.println("❌ Submit button not clickable!");
    	}

    	Thread.sleep(5000); // wait for response / page update

    	// --- Validation (Pass/Fail Condition) ---
    	try {
    	    driver.findElement(By.xpath("//*[normalize-space(text())='Trainer_EN_" + uniqueSuffix + "']"));
    	    System.out.println("✅ Test Passed: New Trainer Specialty found in the list.");
    	} catch (Exception e) {
    	    System.out.println("❌ Test Failed: New Trainer Specialty not found!");
    	}

    
    
    }*/
    
    
    /*@Test(priority = 11)
    public void test_offlinepayment() throws InterruptedException {

    	// Navigate to Settings
    	driver.findElement(By.xpath("//span[normalize-space()='Settings']")).click();
    	Thread.sleep(2000);

    	// Navigate to Trainer Specialty
    	driver.findElement(By.xpath("//button[normalize-space(text())='Offline Payment']")).click();
    	Thread.sleep(2000);

    	// Click on Create Specialty
    	driver.findElement(By.xpath("//button[normalize-space(text())='Create']")).click();
    	Thread.sleep(2000);
    	
    	
    	// --- Generate unique suffix for test run (avoids duplicates) ---
    	String uniqueSuffix = String.valueOf(System.currentTimeMillis());

    	// --- Locate English Name field ---
    	WebElement nameEnInput = driver.findElement(By.xpath("//input[@name='name_en']"));
    	nameEnInput.clear();
    	nameEnInput.sendKeys("Payment_EN_" + uniqueSuffix);

    	// --- Locate Arabic Name field ---
    	WebElement nameArInput = driver.findElement(By.xpath("//input[@name='name_ar']"));
    	nameArInput.clear();
    	nameArInput.sendKeys("دفع_" + uniqueSuffix);
    	
    	
    	// --- Locate the branch dropdown by its inner div text "Select" and click parent button ---
    	WebElement branchDropdown = driver.findElement(
    	        By.xpath("//div[normalize-space(text())='Select']/parent::button")
    	);
    	branchDropdown.click();

    	System.out.println("✅ Branch dropdown clicked!");
    	

    	// --- Wait until first option is visible ---
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement firstBranchOption = wait.until(ExpectedConditions.elementToBeClickable(
    	        By.xpath("(//div[@role='option'])[1]")
    	));

    	// --- Click the first branch ---
    	firstBranchOption.click();

    	System.out.println("✅ First branch selected successfully!");



//    	// --- Locate Active Status button by its inner span text "Active" and click parent button ---
//    	WebElement activeDropdown = driver.findElement(
//    	        By.xpath("//span[normalize-space(text())='Active']/parent::button")
//    	);
//    	activeDropdown.click();
//    	System.out.println("work");

//    	// --- Wait until "Active" option is clickable and click it ---
//    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
//    	WebElement activeOption = wait1.until(ExpectedConditions.elementToBeClickable(
//    	        By.xpath("//div[@role='option' and normalize-space(text())='Active']")
//    	));
//    	activeOption.click();
//
//    	System.out.println("✅ Active status set to 'Active' successfully!");


    	// --- Click Submit Button ---
    	WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']//span[text()='Submit']/parent::button"));
    	if (submitBtn.isDisplayed() && submitBtn.isEnabled()) {
    	    submitBtn.click();
    	    System.out.println("✅ Form submitted with unique data: " + uniqueSuffix);
    	} else {
    	    System.out.println("❌ Submit button not clickable!");
    	}

    	// --- Wait for response ---
    	Thread.sleep(5000);

    	// --- Validation (Pass/Fail Condition) ---
    	// After submit, check if the newly created English name appears in the list/table
    	try {
    	    driver.findElement(By.xpath("//*[normalize-space(text())='Payment_EN_" + uniqueSuffix + "']"));
    	    System.out.println("✅ Test Passed: Offline Payment Method created successfully!");
    	} catch (Exception e) {
    	    System.out.println("❌ Test Failed: Offline Payment Method not found after submission!");
    	}

    }*/
    
    
    
    /*@Test(priority = 12)
    public void test_Create_Channel_Partners() throws InterruptedException {

    	// --- Navigate to Partners page ---
    	driver.findElement(By.xpath("//span[normalize-space()='Channel Partners']")).click();
    	Thread.sleep(2000);

    	// --- Click on Create Partner ---
    	driver.findElement(By.xpath("//button[normalize-space(text())='Add Partner']")).click();
    	Thread.sleep(2000);

    	// --- Generate unique suffix for this test run (avoids duplicates) ---
    	String uniqueSuffix = String.valueOf(System.currentTimeMillis());

    	// --- Logo (optional, skip or upload dummy file) ---
    	WebElement logoInput = driver.findElement(By.name("icon"));
    	// logoInput.sendKeys("C:\\path\\to\\logo.png");

    	// --- Company Name English & Arabic ---
    	WebElement companyNameEN = driver.findElement(By.name("name_en"));
    	companyNameEN.clear();
    	companyNameEN.sendKeys("CompanyEN_" + uniqueSuffix);

    	WebElement companyNameAR = driver.findElement(By.name("name_ar"));
    	companyNameAR.clear();
    	companyNameAR.sendKeys("شركة_" + uniqueSuffix);

//    	// --- Active Status ---
//    	WebElement activeBtn = driver.findElement(By.xpath("//label[text()='Active Status']"));
//    	activeBtn.click();
//    	Thread.sleep(1000); // short wait for dropdown to appear
//    	WebElement activeOption = driver.findElement(By.xpath("//select[@aria-hidden='true']/option[@value='true']"));
//    	activeOption.click();

    	// --- First Name & Last Name ---
    	WebElement firstNameInput = driver.findElement(By.name("first_name"));
    	firstNameInput.clear();
    	firstNameInput.sendKeys("FN_" + uniqueSuffix);

    	WebElement lastNameInput = driver.findElement(By.name("last_name"));
    	lastNameInput.clear();
    	lastNameInput.sendKeys("LN_" + uniqueSuffix);

    	// --- Email ---
    	WebElement emailInput = driver.findElement(By.name("email"));
    	emailInput.clear();
    	emailInput.sendKeys("test+" + uniqueSuffix + "@mail.com");

    	// --- Phone Number ---
    	WebElement phoneInput = driver.findElement(By.xpath("//input[@type='tel']"));
    	phoneInput.clear();
    	phoneInput.sendKeys("+96512345678");

    	

// --- Locate the branch dropdown by its inner div text "Select" and click parent button ---
    	WebElement branchDropdown = driver.findElement(
    	        By.xpath("//div[normalize-space(text())='Select']/parent::button")
    	);
    	branchDropdown.click();

    	System.out.println("✅ Branch dropdown clicked!");
    	

    	// --- Wait until first option is visible ---
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement firstBranchOption = wait.until(ExpectedConditions.elementToBeClickable(
    	        By.xpath("(//div[@role='option'])[1]")
    	));

    	// --- Click the first branch ---
    	firstBranchOption.click();

    	System.out.println("✅ First branch selected successfully!");


    	// --- Partner Type ---
    	WebElement typeBtn = driver.findElement(By.xpath("//label[text()='Partner Type']"));
    	typeBtn.click();  // open dropdown
    	Thread.sleep(500); // wait for dropdown to appear
    	System.out.println("work");

    	// --- Always select the first option from dropdown ---
    	WebElement firstOption = driver.findElement(By.xpath("(//div[@role='option'])[1]"));
    	firstOption.click();
    	Thread.sleep(500); // short wait after selection

    	System.out.println("✅ Partner Type first option selected successfully!");


    	


    	// --- Address Line 1 & 2 ---
    	driver.findElement(By.name("address_line_1")).sendKeys("Address1_" + uniqueSuffix);
    	driver.findElement(By.name("address_line_2")).sendKeys("Address2_" + uniqueSuffix);

    	// --- Country ---
    	WebElement countryBtn = driver.findElement(By.xpath("//label[text()='Select Country']"));
    	countryBtn.click();
    	Thread.sleep(500);
    	WebElement countryOption = driver.findElement(By.xpath("(//div[@role='option'])[5]")); // Bangladesh
    	countryOption.click();

    	// --- State, City, Zip ---
    	driver.findElement(By.name("state")).sendKeys("State_" + uniqueSuffix);
    	driver.findElement(By.name("city")).sendKeys("City_" + uniqueSuffix);
    	driver.findElement(By.name("postal_code")).sendKeys("12345");

    	// --- Submit ---
    	driver.findElement(By.xpath("//button[@type='submit']//span[text()='Submit']")).click();
    	Thread.sleep(2000);

    	// --- Validate Pass/Fail ---
    	try {
    	    WebElement successMsg = driver.findElement(By.xpath("//*[contains(text(),'Partner created successfully')]"));
    	    System.out.println("✅ Test Passed! Partner created: CompanyEN_" + uniqueSuffix);
    	} catch (Exception e) {
    	    System.out.println("❌ Test Failed! Partner not created: CompanyEN_" + uniqueSuffix);
    	}    	
    
    }*/
    
    
   /* @Test(priority = 13)
    public void test_Package_Benefits() throws InterruptedException {

    	// --- Navigate to Partners page ---
    	driver.findElement(By.xpath("//span[normalize-space()='Benefits']")).click();
    	Thread.sleep(2000);
	   	
    	
    	// --- Click on Create Partner ---
    	driver.findElement(By.xpath("//button[normalize-space()='Create Benefit']")).click();
    	Thread.sleep(2000);
    	
    	// --- Benefit Name (English) ---
    	WebElement benefitNameEnInput = driver.findElement(By.name("name_en"));
    	benefitNameEnInput.clear();
    	String uniqueSuffix = null;
		benefitNameEnInput.sendKeys("Benefit_EN_" + uniqueSuffix);

    	// --- Benefit Name (Arabic) ---
    	WebElement benefitNameArInput = driver.findElement(By.name("name_ar"));
    	benefitNameArInput.clear();
    	benefitNameArInput.sendKeys("ميزة_AR_" + uniqueSuffix);

//    	// --- Active Status (Dropdown) ---
//    	WebElement activeStatusDropdown = driver.findElement(By.xpath("//button[@role='combobox']"));
//    	activeStatusDropdown.click();
//    	// Example: Select Active
//    	WebElement activeOption = driver.findElement(By.xpath("//option[@value='true']"));
//    	activeOption.click();

    	// --- Benefit Description (English) ---
    	WebElement benefitDescEnInput = driver.findElement(By.name("description_en"));
    	benefitDescEnInput.clear();
    	benefitDescEnInput.sendKeys("Benefit description in English " + uniqueSuffix);

    	// --- Benefit Description (Arabic) ---
    	WebElement benefitDescArInput = driver.findElement(By.name("description_ar"));
    	benefitDescArInput.clear();
    	benefitDescArInput.sendKeys("وصف الميزة بالعربية " + uniqueSuffix);

    	// --- Submit Button ---
    	WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit' and span[text()='Submit']]"));
    	if (submitButton.isEnabled() && submitButton.isDisplayed()) {
    	    submitButton.click();
    	    System.out.println("✅ Benefit form submitted successfully!");
    	} else {
    	    System.out.println("❌ Submit button not clickable!");
    	}   
    
    }*/
    
    /*@Test(priority = 14)
    public void test_Exclusive_Partner_Discounts() throws InterruptedException {

    	// --- Navigate to Benefits page ---
    	WebElement benefitsMenu = driver.findElement(By.xpath("//span[normalize-space()='Benefits']"));
    	benefitsMenu.click();
    	Thread.sleep(2000);

    	// --- Navigate to Exclusive Partner tab ---
    	WebElement exclusivePartnerTab = driver.findElement(By.xpath("//button[normalize-space()='Exclusive Partner']"));
    	exclusivePartnerTab.click();
    	Thread.sleep(2000);

    	// --- Click on Create Exclusive Partner Discount ---
    	WebElement createExclusivePartnerBtn = driver.findElement(By.xpath("//button[normalize-space()='Create Exclusive Partner Discount']"));
    	createExclusivePartnerBtn.click();
    	Thread.sleep(2000);
    	
    	String uniqueSuffix = String.valueOf(System.currentTimeMillis());

        // --- Name (English) ---
        WebElement nameEn = driver.findElement(By.name("name_en"));
        nameEn.clear();
        nameEn.sendKeys("Partner_EN_" + uniqueSuffix);

        // --- Name (Arabic) ---
        WebElement nameAr = driver.findElement(By.name("name_ar"));
        nameAr.clear();
        nameAr.sendKeys("شريك_AR_" + uniqueSuffix);

//        // --- Image Upload ---
//        WebElement imageUpload = driver.findElement(By.name("name_icon"));
//        imageUpload.sendKeys("C:\\path\\to\\test-image.png"); // <-- Local file path

        // --- Discount Code ---
        WebElement discountCode = driver.findElement(By.name("coupon_code"));
        discountCode.clear();
        discountCode.sendKeys("DISC_" + uniqueSuffix);

     // --- Start Date (1 day before today) ---
        WebElement startDateBtn = driver.findElement(By.id(":r5b:-form-item"));
        startDateBtn.click();
        Thread.sleep(1000);

        // Calculate yesterday's day number
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        int dayOfMonth = yesterday.getDayOfMonth();

        // Select yesterday from calendar popup
        String xpathForYesterday = "//button[normalize-space()='" + dayOfMonth + "']";
        WebElement yesterdayDate = driver.findElement(By.xpath(xpathForYesterday));
        yesterdayDate.click();
        Thread.sleep(1000);


        // --- Expiry Date ---
        WebElement expiryDateBtn = driver.findElement(By.id(":r5d:-form-item"));
        expiryDateBtn.click();
        Thread.sleep(1000);
        // Example: select next day
        driver.findElement(By.xpath("//button[normalize-space()='14']")).click();
        Thread.sleep(1000);

        // --- Active Status Dropdown ---
        WebElement statusDropdown = driver.findElement(By.id(":r5f:-form-item"));
        statusDropdown.click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//option[@value='true']")).click(); // Active
        Thread.sleep(500);

        // --- Users Dropdown ---
        WebElement usersDropdown = driver.findElement(By.xpath("//button[@aria-controls='radix-:r5i:']"));
        usersDropdown.click();
        Thread.sleep(1000);
        // Example: select first available option
        driver.findElement(By.xpath("(//div[contains(@class,'radix')])[1]")).click();
        Thread.sleep(1000);

        // --- Description (English) ---
        WebElement descriptionEn = driver.findElement(By.name("description_en"));
        descriptionEn.clear();
        descriptionEn.sendKeys("Exclusive Partner description EN " + uniqueSuffix);

        // --- Description (Arabic) ---
        WebElement descriptionAr = driver.findElement(By.name("description_ar"));
        descriptionAr.clear();
        descriptionAr.sendKeys("وصف الشريك الحصري AR " + uniqueSuffix);

        // --- Submit ---
        WebElement submitBtn = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
        submitBtn.click();
        Thread.sleep(3000);

        // --- Assertion (example: success message check) ---
        boolean isSuccess = driver.findElements(By.xpath("//*[contains(text(),'successfully')]")).size() > 0;
        Assert.assertTrue(isSuccess, "Exclusive Partner creation failed!");
    
    }*/
    
    
    
    @Test(priority = 15)
    public void test_Coupons() throws InterruptedException {

    	// --- Navigate to Benefits page ---
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	WebElement benefitsMenu = wait.until(ExpectedConditions
    	        .elementToBeClickable(By.xpath("//span[normalize-space()='Benefits']")));
    	benefitsMenu.click();

    	// --- Navigate to Exclusive Partner tab ---
    	WebElement exclusivePartnerTab = wait.until(ExpectedConditions
    	        .elementToBeClickable(By.xpath("//button[normalize-space()='Coupons']")));
    	exclusivePartnerTab.click();

    	// --- Click on Create Exclusive Partner Discount ---
    	WebElement createExclusivePartnerBtn = wait.until(ExpectedConditions
    	        .elementToBeClickable(By.xpath("//button[normalize-space()='Create Coupon']")));
    	createExclusivePartnerBtn.click();
    	
    	

    	    // --- Coupon Code ---
    	    WebElement couponCode = wait.until(ExpectedConditions.elementToBeClickable(By.name("code")));
    	    couponCode.clear();
    	    String uniqueSuffix = null;
			couponCode.sendKeys("COUPON" + uniqueSuffix);

    	    // --- Coupon Type ---
    	    WebElement couponType = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//select/option[@value='FLAT']")));
    	    couponType.click();

    	    // --- Coupon Value ---
    	    WebElement couponValue = wait.until(ExpectedConditions.elementToBeClickable(By.name("value")));
    	    couponValue.clear();
    	    couponValue.sendKeys("500");

//    	    // --- Start Date ---
//    	    WebElement startDate = wait.until(ExpectedConditions.elementToBeClickable(By.id(":r67:-form-item")));
//    	    startDate.click();
//    	    // TODO: Select actual date from calendar
//
//    	    // --- Expiry Date ---
//    	    WebElement expiryDate = wait.until(ExpectedConditions.elementToBeClickable(By.id(":r69:-form-item")));
//    	    expiryDate.click();
//    	    // TODO: Select actual date from calendar

    	    // --- Maximum Number of Uses ---
    	    WebElement maxUses = wait.until(ExpectedConditions.elementToBeClickable(By.name("max_number_of_uses")));
    	    maxUses.clear();
    	    maxUses.sendKeys("10");

//    	    // --- Active Status ---
//    	    WebElement activeStatus = wait.until(ExpectedConditions.elementToBeClickable(
//    	            By.xpath("//select/option[@value='true']")));
//    	    activeStatus.click();

    	 // --- Branches ---
    	    WebElement branches = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//label[@for='branches']/following-sibling::button")));
    	    branches.click();
    	    Thread.sleep(2000);
    	  

    	    // Select first option from the dropdown
    	    WebElement firstBranchOption = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("(//div[@role='option'])[1]")));
    	    firstBranchOption.click();


    	    // --- Where the coupon can be used ---
    	    WebElement usageScope = wait.until(ExpectedConditions.elementToBeClickable(
    	    		By.xpath("//button[@type='button' and .//div[text()='Select']]")));
    	    usageScope.click();
    	    Thread.sleep(2000);
    	    // TODO: Select option from dropdown

    	    // --- PT Packages ---
    	    WebElement ptPackages = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//label[@for='pt_packages']/following-sibling::button")));
    	    ptPackages.click();
    	    // TODO: Select option

    	    // --- GX Packages ---
    	    WebElement gxPackages = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//label[@for='gx_packages']/following-sibling::button")));
    	    gxPackages.click();
    	    // TODO: Select option

    	    // --- Eligible Users ---
    	    WebElement eligibleUsers = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//label[@for='users']/following-sibling::button")));
    	    eligibleUsers.click();
    	    // TODO: Select option

    	    // --- Applicable Products ---
    	    WebElement products = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//label[@for='products']/following-sibling::button")));
    	    products.click();
    	    // TODO: Select option

    	    // --- Membership ---
    	    WebElement membership = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//label[@for='membership_packages']/following-sibling::button")));
    	    membership.click();
    	    // TODO: Select option

    	    // --- Freezing Addons ---
    	    WebElement freezingAddons = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//label[@for='freezing_addons']/following-sibling::button")));
    	    freezingAddons.click();
    	    // TODO: Select option

    	    // --- Guest Pass Packages ---
    	    WebElement guestPass = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//label[@for='guest_pass_packages']/following-sibling::button")));
    	    guestPass.click();
    	    // TODO: Select option

    	    // --- Submit ---
    	    WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//button[@type='submit']//span[text()='Submit']")));
    	    submitBtn.click();
    	}

    
    
    
  
    
    

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
