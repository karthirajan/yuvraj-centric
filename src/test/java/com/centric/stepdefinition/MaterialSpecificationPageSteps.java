package com.centric.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
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
		ca.clickjs(mp.getSave_btn1());
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
		ca.clickjs(mp.getSave_btn1());
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
		ca.clickjs(mp.getSave_btn1());
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
		ca.clickjs(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("standalone material copy created successfully");
		
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric://APPAREL/Views' and @data-csi-act='Copy'])[1]")));
		ca.eleToBeClickable();
		ca.clickjs(mp.getSave_btn1());
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
		ca.clickjs(mp.getSave_btn1());
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
		ca.clickjs(mp.getSave_btn1());
		ca.eleToBeClickable();
		
		System.out.println("Size created successfully");
		StylePage sp = new StylePage();
		
		//ca.jsScrollPageUp(sp.getImg_icon());
	    
	    
	}
	
	@Then("User creating suppliers,samples and sku and validates {string},{string},{string}")
	public void user_creating_suppliers_samples_and_sku_and_validates(String string, String string2, String string3) throws Throwable {
	    
		
		ca.eleToBeClickable();
		ca.click(hp.getSourcingBtn());
		ca.eleToBeClickable();
		ca.click(mp.getSupplier());
		ca.eleToBeClickable();
		ca.click(mp.getNew_suppliier_Btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getSupplierValue(), "Supplier - Is Supplier");
		ca.eleToBeClickable();
		ca.click(mp.getIsSupplier_ChkBox());
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();
		
		System.out.println("Supplier created successfully");
		
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
	     
	    ca.eleToBeClickable(); 
	    try{
	    	ca.click(hp.getMaterialBtn());
			ca.eleToBeClickable();
	    }catch (Exception e) {
			
		}
	    
		ca.eleToBeClickable();
		ca.clickjs(mp.getCopy_name());
		ca.eleToBeClickable();
		ca.click(mp.getSamples1());
		ca.eleToBeClickable();
		ca.click(mp.getNew_mat_Sample_Btn1());
		ca.eleToBeClickable();
		ca.insertText(mp.getMat_SampleValue1(), string);
		ca.eleToBeClickable();
		String[] s = string2.split("=");
		ca.insertText(mp.getColor_sizeValue(), s[0]);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(mp.getQntyMatrix());
		ca.eleToBeClickable();
		ca.insertText(mp.getQntyValue(), s[1]);
		ca.eleToBeClickable();
		ca.click(mp.getBlue());
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();
		
		System.out.println("Sample created successfully");
		
		ca.eleToBeClickable();
		ca.click(mp.getSKU());
		ca.eleToBeClickable();
		ca.click(mp.getNew_mat_sku_Btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getMat_sku_value(), string3);
		ca.eleToBeClickable();
		ca.click(mp.getUseMatrix_chkBox());
		ca.eleToBeClickable();
		ca.click(mp.getSelectAll());
		ca.eleToBeClickable();
		ca.click(mp.getSelectParticular());
		ca.save();
		ca.eleToBeClickable();
	    
		System.out.println("SKU created successfully");
	    
		
	}
	UserManagementPage up=new UserManagementPage();

	@Then("User validates material gallery {string},{string}")
	public void user_validates_material_gallery(String string, String string2) throws Throwable {
	    //===================================temp=======================================\\
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
	     
	    ca.eleToBeClickable(); 
	    try{
	    	ca.click(hp.getMaterialBtn());
			ca.eleToBeClickable();
	    }catch (Exception e) {
			
		}
	    //===================================================================================\\
		ca.eleToBeClickable();
		 try{
		    	ca.click(hp.getMaterialBtn());
				ca.eleToBeClickable();
		    }catch (Exception e) {
				
			}
		 ca.eleToBeClickable();
		ca.click(mp.getMaterial_gallery());
		ca.eleToBeClickable();
		List<WebElement> gallery = driver.findElements(By.xpath("//div[@class='csiGalleryProperties']//a"));
		for (WebElement webElement : gallery) {
			System.out.println("gallery names are :"+webElement.getText());
		}
		ca.eleToBeClickable();
		ca.click(mp.getMGViews());
		ca.eleToBeClickable();
		ca.click(mp.getMGMan_Views());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Copy());
		ca.eleToBeClickable();
		ca.insertText(up.getUsrMgmt_Copy_Value(), string);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		ca.eleToBeClickable();
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		ca.eleToBeClickable();
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		ca.eleToBeClickable();
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		ca.eleToBeClickable();
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		ca.eleToBeClickable();
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		ca.eleToBeClickable();
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])/option[1]")));
		ca.eleToBeClickable();
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();
		ca.insertText(mp.getMGFilter(), string2);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		
		System.out.println("Material Gallery verified successfully");
		
	}

	@Then("User validates material security group {string},{string},{string}")
	public void user_validates_material_security_group(String string, String string2, String string3) throws Throwable {
	    
		
		ca.eleToBeClickable();
		ca.click(mp.getMatSecGrps());
		ca.eleToBeClickable();
		ca.click(mp.getMSGViews());
		ca.eleToBeClickable();
		ca.click(mp.getMSG_manViews());
		ca.eleToBeClickable();
		ca.click(up.getUsrMgmt_Copy());
		ca.eleToBeClickable();
		ca.insertText(up.getUsrMgmt_Copy_Value(), string);
		ca.eleToBeClickable();
		//ca.selectByText(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])[1]/option[text()='Material Security Group']")), "Material Security Group");
		//ca.eleToBeClickable();
		//ca.click(mp.getAdd());
		//ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//select[@class='csiPreferenceSelect '])[1]/option[text()='Only For Material Types']")));
		ca.eleToBeClickable();
		ca.click(mp.getAdd());
		ca.eleToBeClickable();
		ca.save();
		ca.eleToBeClickable();
		
		System.out.println("Material Security Group custom view created successfully");
		
		ca.eleToBeClickable();
		ca.click(mp.getMat_SecGrp_Btn());
		ca.eleToBeClickable();
		WebElement activeElement = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement, string2);
		ca.eleToBeClickable();
		ca.click(mp.getOnlyForMat());
		ca.eleToBeClickable();
		ca.click(mp.getStandalone_chkbox());
		ca.eleToBeClickable();
		ca.click(mp.getClickEmpty());
		ca.eleToBeClickable();
		
		System.out.println("MSG_Standalone created successfully");
		
		ca.eleToBeClickable();
		ca.click(mp.getMat_SecGrp_Btn());
		ca.eleToBeClickable();
		WebElement activeElement1 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(activeElement1, string3);
		ca.eleToBeClickable();
		ca.click(mp.getOnlyForMat());
		ca.eleToBeClickable();
		ca.click(mp.getStandalone_chkbox());
		ca.eleToBeClickable();
		ca.click(mp.getStructure_Component());
		ca.eleToBeClickable();
		ca.click(mp.getTool());
		ca.eleToBeClickable();
		ca.click(mp.getClickEmpty());
		ca.eleToBeClickable();
		
		System.out.println("MSG_All created successfully");
	}

	@Then("User validates colored material")
	public void user_validates_colored_material() throws Throwable {
	   
		ca.eleToBeClickable();
		ca.click(mp.getColored_mat());
		ca.eleToBeClickable();
		
		System.out.println("Colored Material validated successfully");
		
	}

	@Then("User validates and edit material samples {string}")
	public void user_validates_and_edit_material_samples(String string) throws Throwable {

		  ca.eleToBeClickable(); 
		ca.click(mp.getMat_samples());
		  ca.eleToBeClickable(); 
		ca.click(mp.getNew_mat_sample_Btn());
		  ca.eleToBeClickable(); 
		ca.insertText(mp.getMat_sample_Value(), "Automation");
		  ca.eleToBeClickable(); 
		ca.save();
		  ca.eleToBeClickable(); 
		ca.click(mp.getClick_materialSample());
		  ca.eleToBeClickable(); 
		ca.click(mp.getPromote_material());
		  ca.eleToBeClickable(); 
		ca.insertText(mp.getMaterial(), "copy -"+string);
		  ca.eleToBeClickable(); 
		ca.save();
		
		
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
	     
	    ca.eleToBeClickable(); 
	    
		
		ca.click(driver.findElement(By.xpath("(//span[@data-csi-act='Delete'])[1]")));
		  ca.eleToBeClickable(); 
		ca.click(pp.getDelete_Btn());
		
		System.out.println("deleted successfully");
		
		  ca.eleToBeClickable(); 
		ca.click(mp.getClick_materialSample());
		  ca.eleToBeClickable(); 
		ca.click(mp.getUnLink());
		  ca.eleToBeClickable(); 
		ca.click(mp.getPp_unLink());
		
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
	     
	    ca.eleToBeClickable(); 
	    
	    System.out.println("Material Sample validated successfully");
		
	}

	@Then("User validates material SKU's")
	public void user_validates_material_SKU_s() throws Throwable {
	    ca.eleToBeClickable(); 
		ca.click(mp.getMat_SKU());
	    ca.eleToBeClickable();
	    
	    System.out.println("Material SKU validated successfully");
		
	}

	@Then("User validates sourcing")
	public void user_validates_sourcing() throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(mp.getSourcing());
		ca.eleToBeClickable();
		ca.click(mp.getQuotes());
		ca.eleToBeClickable();
		ca.click(mp.getRequests());
		ca.eleToBeClickable();
		
		System.out.println("Sourcing validated successfully");
		
	}


}
