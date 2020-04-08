package com.centric.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.StylePage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MaterialSpecificationPageSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	HomePage hp = new HomePage();
	PopupPage pp = new PopupPage();
	MaterialSpecificationPage mp = new MaterialSpecificationPage();
	
	@Then("Click Libraries tab under specification")
	public void click_Libraries_tab_under_specification() throws Throwable {
	   
		ca.eleToBeClickable();
		ca.click(hp.getSpecificationBtn());
		try{
			ca.eleToBeClickable();
			ca.click(driver.findElement(By.xpath("(//span[contains(@class,'RightIcon')]/parent::div)[2]")));
		}catch(Exception e){
		}
		ca.eleToBeClickable();
		ca.click(mp.getLibraries());
		ca.eleToBeClickable();
		
		System.out.println("libraries clicked successfully");
		
	}

	@When("User create New material with mandatory deatails for material creation {string},{string},{string}")
	public void user_create_New_material_with_mandatory_deatails_for_material_creation(String string, String string2, String string3) throws Throwable {
	    

		
		
		ca.eleToBeClickable();
		ca.click(mp.getLib_drpdown());
		ca.eleToBeClickable();
		ca.click(mp.getNew_material_lib());
		ca.eleToBeClickable();
		WebElement activeElement = driver.switchTo().activeElement();
	    ca.eleToBeClickable();
		ca.insertText(activeElement, "Automation");
		ca.eleToBeClickable();
		ca.click(mp.getLib_node_type());
		ca.eleToBeClickable();
		ca.click(mp.getLib_node_name());
		ca.eleToBeClickable();
		ca.click(mp.getMaterial_btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial_value(), string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial(), string2);
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial_code(), string3);
		ca.eleToBeClickable();
		ca.clickjs(mp.getSave_btn());
		ca.eleToBeClickable();
		
		System.out.println("standalone material created successfully");
		
	}

	@Then("User create material for Structure Component {string},{string},{string},{string},{string},{string}")
	public void user_create_material_for_Structure_Component(String string, String string2, String string3, String string4, String string5, String string6) throws Throwable {
	   
		
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
	     
	    ca.eleToBeClickable(); 
		
		ca.click(hp.getMaterialBtn());
		ca.eleToBeClickable();
		ca.click(mp.getNew_material_btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial_value(), string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial(), string2);
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial_code(), string3);
		ca.eleToBeClickable();
		ca.clickjs(mp.getSave_btn());
		ca.eleToBeClickable();
		
		System.out.println("structure component material created successfully");
		
		ca.eleToBeClickable();
		ca.click(mp.getNew_material_btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial_value(), string4);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial(), string5);
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial_code(), string6);
		ca.eleToBeClickable();
		ca.clickjs(mp.getSave_btn());
		ca.eleToBeClickable();
		
		System.out.println("Tool material created successfully");
		
		
	}

	@Then("User performing copy and delete action on material")
	public void user_performing_copy_and_delete_action_on_material() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Copy'])[3]")));
		ca.eleToBeClickable();
		ca.insertText(mp.getMaterial(), "copy-cotton");
		ca.eleToBeClickable();
		ca.clickjs(mp.getSave_btn());
		ca.eleToBeClickable();
		
		System.out.println("standalone material copy created successfully");
		
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Copy'])[1]")));
		ca.eleToBeClickable();
		ca.clickjs(mp.getSave_btn());
		ca.eleToBeClickable();
		
		System.out.println("Tool material copy created successfully");
		
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Delete'])[2]")));
		ca.eleToBeClickable();
		ca.clickjs(pp.getDelete_Btn());
		ca.eleToBeClickable();
		
		System.out.println("Tool material copy deleted successfully");
		
	}
	
	@When("User creates color and size")
	public void user_creates_color_and_size() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.clickjs(mp.getCopy_name());
		ca.eleToBeClickable();
		ca.jsScrollPageDown(mp.getNew_colored_material_btn());
		ca.eleToBeClickable();
		ca.click(mp.getNew_colored_material_btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getColored_material_value(), "Red");
		ca.eleToBeClickable();
		ca.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.insertText(mp.getColored_material_value(), "Blue");
		ca.eleToBeClickable();
		ca.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.insertText(mp.getColored_material_value(), "Yellow");
		ca.eleToBeClickable();
		ca.clickjs(mp.getSave_btn());
		ca.eleToBeClickable();
		
		System.out.println("Colors created successfully");
		
		ca.eleToBeClickable();
		ca.jsScrollPageDown(mp.getNew_size_btn());
		ca.eleToBeClickable();
		ca.click(mp.getNew_size_btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getSize_value(), "30");
		ca.eleToBeClickable();
		ca.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.insertText(mp.getSize_value(), "32");
		ca.eleToBeClickable();
		ca.insertText(mp.getSortOrder(), "1");
		ca.eleToBeClickable();
		ca.clickjs(mp.getSaveAndNew_btn());
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.insertText(mp.getSize_value(), "34");
		ca.eleToBeClickable();
		ca.insertText(mp.getSortOrder(), "2");
		ca.eleToBeClickable();
		ca.clickjs(mp.getSave_btn());
		ca.eleToBeClickable();
		
		System.out.println("Size created successfully");
		StylePage sp = new StylePage();
		
		//ca.jsScrollPageUp(sp.getImg_icon());
	    
	    
	}

}
