package com.pages;

import org.openqa.selenium.*;


public class LoginPage {
    private final WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
    }
    public void signinButton(){
        driver.findElement(By.xpath("//button[@class='btn sb-btn-lg sb-btn-secondary rounded-pill py-1 px-3 fw-normal']")).click();
    }
    public void emailAddress(String email){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
    }

    public void password(String pass){
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
    }
    public void signIn(){
        driver.findElement(By.xpath("//button[@class='btn sb-btn-lg sb-btn-primary fw-bold rounded-pill w-100']")).click();
    }
    public void clickShareleadMenue(){
        driver.findElement(By.xpath("//*[@src='/img/joiner.svg']")).click();
    }
    public void clickSharelead(){
        driver.findElement(By.xpath("//*[@src='/img/sharelead.svg']")).click();
    }
    public void clickContinue(){
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div/div/button/span[1]")).click();
    }
    public void clickSetUpAShareBus(){d
        driver.findElement(By.xpath("//*[@class='fi fi-arrow-right-short']")).click();
    }

    public void osloNorway(String oslo){
        driver.findElement(By.xpath("//input[@id='startPoint']")).sendKeys(oslo);
        driver.findElement(By.xpath("//input[@id='startPoint']")).click();
    }
    public void destinationPoint(String destination){
        driver.findElement(By.xpath("//input[@id='destination']")).sendKeys(destination);
        driver.findElement(By.xpath("//input[@id='startPoint']")).click();
    }
    public void startingdate(){
        driver.findElement(By.xpath("//*[@placeholder='Departure Date']")).click();
        driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]")).click();

    }
    public void startingTime(){
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[2]/span/input")).click();
    }
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//input[@id='destination']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickReturndate(){
        driver.findElement(By.xpath("//*[@placeholder='Return Date']")).click();
        driver.findElement(By.xpath("//table/tbody/tr[5]/td[6]")).click();
    }
    public void clickReturnTime(){
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[2]/div[1]/div/div[2]/span/input")).click();
    }
    public void clickContinue2(){
        driver.findElement(By.xpath("//button[@class='btn sb-btn-primary sb-btn-lg rounded-pill border-0 fw-bold d-flex justify-content-center align-items-center']")).click();
    }


}
