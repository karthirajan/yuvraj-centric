package com.centric.stepdefinition;

import org.openqa.selenium.By;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.StylePage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StylePageSteps extends Commonactions {

	Commonactions ca=new Commonactions();
	StylePage sp=new StylePage();
	PopupPage pup=new PopupPage();

	@When("User create New season with mandatory deatails for season creation {string},{string},{string}")
	public void user_create_New_season_with_mandatory_deatails_for_season_creation(String a,String b, String c) throws InterruptedException {
		Thread.sleep(2000);
		ca.click(sp.getNew_season_Btn());
		ca.insertText(pup.getSeason_Value(), a);
		ca.insertText(pup.getCode_Value(), b);
		ca.insertText(pup.getDescription_Value(), c);
		ca.click(pup.getSave_and_go_Btn());
		Thread.sleep(2000);
		
		System.out.println("season created successfully");

	}

	@Then("Click New Brand")
	public void click_New_Brand() throws Throwable 
	{
		Thread.sleep(2000);
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		ca.eleToBeClickable();
		
		
	}

	@And("Create Brand by providing valid and mandatory data {string},{string},{string}")
	public void create_Brand_by_providing_valid_and_mandatory_data(String a,String b, String c) throws Throwable {
		Thread.sleep(2000);
		ca.insertText(pup.getBrand_Value(), a);
		ca.insertText(pup.getBrand_code_Value(), b);
		ca.insertText(pup.getBrand_description_Value(), c);
		
		
	}

	@Then("Save the New Brand which was created")
	public void save_the_New_Brand_which_was_created() throws InterruptedException {
		Thread.sleep(2000);
		ca.click(pup.getSave_and_go_Btn());  
		Thread.sleep(2000);
		
		System.out.println("brand created successfully");
	}

	@Then("Click New department by providing valid data  {string},{string},{string}")
	public void click_New_department_by_providing_valid_data(String a,String b, String c) throws Throwable {
		Thread.sleep(2000);
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(2000);
		ca.insertText(pup.getDept_Value(), a);
		ca.insertText(pup.getDept_code_Value(), b);
		ca.insertText(pup.getDept_description_Value(), c);
	}

	@Then("Save the New department which was created")
	public void save_the_New_department_which_was_created() throws InterruptedException {
		Thread.sleep(2000);
		ca.click(pup.getSave_and_go_Btn());  
		Thread.sleep(2000);
		
		System.out.println("department created successfully");
	}

	@Then("Click New collection")
	public void click_New_collection() throws Throwable {
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(2000);
	}

	@Then("Create collection by providing valida and mandatory details {string},{string},{string}")
	public void create_collection_by_providing_valida_and_mandatory_details(String a,String b, String c) throws InterruptedException {
		Thread.sleep(2000);
		ca.insertText(pup.getCollection_Value(), a);
		ca.insertText(pup.getCollection_code_Value(), b);
		ca.insertText(pup.getCollection_description_Value(), c);

	}

	@Then("Save the collection which was created")
	public void save_the_collection_which_was_created() throws InterruptedException {
		ca.click(pup.getSave_and_go_Btn()); 
		Thread.sleep(2000);
		
		System.out.println("collection created successfully");
	}

	@Then("Click New style")
	public void click_New_style() throws Throwable {
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(2000);

	}
	
	@Then("Create Style followed by its style Type {string}")
	public void create_Style_followed_by_its_style_Type(String a) throws InterruptedException {
		Thread.sleep(2000);
		ca.insertText(pup.getStyle_type_Value(), a);
		//ca.insertText(pup.getTemplate_Value(), "apparel");
		//ca.insertText(pup.getShape_Value(), "ssgd");
		//ca.insertText(pup.getTheme_code_Value(),"sgfg");
		//ca.insertText(pup.getSstyle_Value(), "fhgvahvmZXV");
	
			ca.click(pup.getSave_and_go_Btn());	
			Thread.sleep(3000);
		
			System.out.println("style created successfully");    
	      
	}
	HomePage hp=new HomePage();

	@Then("select the image from the avilable resource")
	public void select_the_image_from_the_avilable_resource() throws Throwable {
		try {
			ca.eleToBeClickable();
		ca.click(sp.getImg_icon());
		ca.eleToBeClickable();
		}catch(Exception e) {
			ca.click(hp.getStyleBtn());
			ca.eleToBeClickable();
				ca.jsScrollPageDown(sp.getUpload_Btn());
				ca.eleToBeClickable();
			ca.click(sp.getImg_icon());
		ca.eleToBeClickable();
		}
		    ca.click(sp.getUpload_Btn());
		ca.eleToBeClickable();
		ca.click(sp.getSelect_img_Btn());
		ca.eleToBeClickable();
		ca.click(sp.getSave_img_Btn());
		Thread.sleep(2000);
	      
		System.out.println("Image uploaded successfully");
	      
	}
	
	static String A1,B1;
	
	@When("User create New season with mandatory deatails for season creation {string},{string},{string},{string},{string},{string}")
	public void user_create_New_season_with_mandatory_deatails_for_season_creation(String a, String b, String c, String A, String B, String C) throws Throwable {
	   
		ca.eleToBeClickable();
		ca.click(sp.getNew_season_Btn());
		ca.eleToBeClickable();
		ca.insertText(pup.getSeason_Value(), a);
		ca.eleToBeClickable();
		ca.insertText(pup.getCode_Value(), b);
		ca.eleToBeClickable();
		ca.insertText(pup.getDescription_Value(), c);
		ca.eleToBeClickable();
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();
		ca.insertText(pup.getSeason_Value(), A);
		ca.eleToBeClickable();
		ca.insertText(pup.getCode_Value(), B);
		ca.eleToBeClickable();
		ca.insertText(pup.getDescription_Value(), C);
		ca.eleToBeClickable();
		ca.click(pup.getSave_Btn());
		
		A1=A;
		B1=B;
		
		
	}


	@When("User performing edit action on season")
	public void user_performing_edit_action_on_season() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(sp.getEdit_Btn());
		ca.eleToBeClickable();
		ca.insertText(pup.getSeason_Value(), A1);
		ca.eleToBeClickable();
		ca.insertText(pup.getCode_Value(), B1);
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])")));
		ca.eleToBeClickable();
		ca.click(sp.getSelect_season());
		ca.eleToBeClickable();
		
		System.out.println("season created successfully");
	}

	@Then("Create Style followed by its style Type {string},{string},{string},{string}")
	public void create_Style_followed_by_its_style_Type(String a, String b, String c, String d) throws Throwable {
		

		
		ca.eleToBeClickable();
		ca.insertText(pup.getStyle_type_Value(), a);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(pup.getSstyle_Value(), a);
		ca.eleToBeClickable();
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.insertText(pup.getStyle_type_Value(), b);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(pup.getSstyle_Value(), b);
		ca.eleToBeClickable();
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.insertText(pup.getStyle_type_Value(), c);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(pup.getSstyle_Value(), c);
		ca.eleToBeClickable();
		ca.click(pup.getSave_and_new_Btn());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.insertText(pup.getStyle_type_Value(), d);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(pup.getSstyle_Value(), d);
		ca.eleToBeClickable();
		ca.click(pup.getSave_Btn());
		ca.eleToBeClickable();
		
		System.out.println("style created successfully");
	    
	}





}
