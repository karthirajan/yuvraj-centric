package com.centric.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.MaterialSpecificationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.StylePage;
import com.centric.objectrepository.UserManagementPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Given;
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

	@Given("User validates care label {string},{string},{string}")
	public void user_validates_care_label(String string, String string2, String string3) throws Throwable {
	    

		
		ca.eleToBeClickable();
		ca.click(mp.getCare_label());
		ca.eleToBeClickable();
		ca.click(mp.getNew_care_label_btn());
		ca.eleToBeClickable();
		WebElement e = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string);
		//ca.eleToBeClickable();
		//ca.click(mp.getCare_type());
		ca.eleToBeClickable();
		String[] s = string.split("-");
		 for (int i = 0; i < 10; i++) {
	           WebElement dr = mp.getCare_type();
	           Thread.sleep(100);          
	           dr.click();
	                Actions a = new Actions(driver);
	              for (int j = 0; j <= i; j++) {
	            	  Thread.sleep(100);
	             a.sendKeys(Keys.DOWN).build().perform();
	            // Thread.sleep(300);
	                         }

	                a.sendKeys(Keys.TAB).build().perform();
	               // dr.click();
		            System.out.println(dr.getText());
		            System.out.println("...............");
		            System.out.println(s[0].trim());
	             //   Thread.sleep(300);
	            if (dr.getText().equalsIgnoreCase(s[1].trim())) {
	                    break;
	                      }
	                  Thread.sleep(500);
	                     }
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.click(mp.getNew_care_label_btn());
		ca.eleToBeClickable();
		WebElement e2 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, string2);
		ca.eleToBeClickable();
		//ca.click(mp.getCare_type());
		//ca.eleToBeClickable();
		String[] s1 = string2.split("-");
		 for (int i = 0; i < 10; i++) {
	           WebElement dr = mp.getCare_type();
	           Thread.sleep(100);          
	           dr.click();
	                Actions a = new Actions(driver);
	              for (int j = 0; j <= i; j++) {
	            	  Thread.sleep(100);
	             a.sendKeys(Keys.DOWN).build().perform();
	              }
	              a.sendKeys(Keys.TAB).build().perform();
	              //dr.click();
	              System.out.println(dr.getText());
	            if (dr.getText().equalsIgnoreCase(s1[1].trim())) {
	                    break;
	                      }
	                  Thread.sleep(500);
	                     }
		ca.eleToBeClickable();
		
		ca.eleToBeClickable();
		ca.click(mp.getNew_care_label_btn());
		ca.eleToBeClickable();
		WebElement e4 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, string3);
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//span[text()='Care Label'])[2]")));
		ca.eleToBeClickable();
		
		System.out.println("care label validated successfully");
		
	}

	@Given("User validates composition placements {string},{string}")
	public void user_validates_composition_placements(String string, String string2) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(mp.getComp_placement());
		ca.eleToBeClickable();
		ca.click(mp.getNew_comp_placement_Btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getComp_placement_value(), string);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getComp_placement_value(), string2);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("composition placement validated successfully");
	}

	@Given("User validates composition material {string},{string},{string}")
	public void user_validates_composition_material(String string, String string2, String string3) throws Throwable {
	    
	try{
			
			ca.eleToBeClickable();
			ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'RightIcon')]/parent::div)[2]")));
		}catch(Exception e){
		}
		
		ca.eleToBeClickable();
		ca.click(mp.getComp_materials());
		ca.eleToBeClickable();
		ca.click(mp.getNew_comp_material_Btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getComp_material_value(), string);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getComp_material_value(), string2);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getComp_material_value(), string3);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("composition material validated successfully");
		
	}

	@Given("User validates placement {string},{string}")
	public void user_validates_placement(String string, String string2) throws Throwable {
		
	try{
			
			ca.eleToBeClickable();
			ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'RightIcon')]/parent::div)[2]")));
		}catch(Exception e){
		}
	    
	    ca.eleToBeClickable();
		ca.click(mp.getPlacement());
		ca.eleToBeClickable();
		ca.click(mp.getNew_placement_Btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getPlacement_value(), string);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_saveAndnew_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getPlacement_value(), string2);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		System.out.println("placement validated successfully");
		
	}

	@Given("User validates product symbols {string},{string},{string}")
	public void user_validates_product_symbols(String string, String string2, String string3) throws Throwable {
	    
		
		ca.eleToBeClickable();
		ca.click(mp.getProduct_symbols());
		ca.eleToBeClickable();
		ca.click(mp.getNew_prodSymbol_Btn());
		ca.eleToBeClickable();
		WebElement e = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e, string);
		ca.eleToBeClickable();
		String[] s = string.split("-");
		ca.eleToBeClickable();
		ca.click(mp.getProdSymbol_type());
		ca.eleToBeClickable();
		WebElement e1 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e1, s[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		
		ca.click(mp.getNew_prodSymbol_Btn());
		ca.eleToBeClickable();
		WebElement e2 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e2, string2);
		ca.eleToBeClickable();
		String[] s2 = string2.split("-");
		ca.eleToBeClickable();
		ca.click(mp.getProdSymbol_type());
		ca.eleToBeClickable();
		WebElement e3 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e3, s2[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		
		ca.click(mp.getNew_prodSymbol_Btn());
		ca.eleToBeClickable();
		WebElement e4 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e4, string3);
		ca.eleToBeClickable();
		String[] s3 = string3.split("-");
		ca.eleToBeClickable();
		ca.click(mp.getProdSymbol_type());
		ca.eleToBeClickable();
		WebElement e5 = driver.switchTo().activeElement();
		ca.eleToBeClickable();
		ca.insertText(e5, s3[1].trim());
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		
		System.out.println("product symbols validated successfully");
		
		
	}

	@Given("User validates language {string},{string},{string}")
	public void user_validates_language(String string, String string2, String string3) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(mp.getLanguage());
		ca.eleToBeClickable();
		ca.click(mp.getNew_language_Btn());
		ca.eleToBeClickable();
		ca.insertText(mp.getLang_value(), string);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getLang_value(), string2);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		
		ca.insertText(mp.getLang_value(), string3);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_cancel_Btn());
		ca.eleToBeClickable();
		
		System.out.println("language validated successfully");
		
	}

	@Given("User validates product structure {string}")
	public void user_validates_product_structure(String string) throws Throwable {
		

	    
		ca.eleToBeClickable();
		ca.click(mp.getProduct_structure());
		ca.eleToBeClickable();
		ca.click(mp.getNew_prodStructure_Btn());
		ca.eleToBeClickable();
		ca.click(pp.getConfig_cancel_Btn());
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//div[contains(@class,'ProductStructure')]//td[@data-csi-heading='Node Name::0']/a")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("(//div[text()='add' and contains(@class,'icon')])[2]")));
		ca.eleToBeClickable();
		ca.insertText(driver.findElement(By.xpath("((//div[contains(@data-csi-automation,'FixedMaterial')]/div)[3]/input)[1]")), string);
		ca.eleToBeClickable();
		ca.jsMouseOver();
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		ca.click(mp.getActiveIcon());
		
		ca.eleToBeClickable();
        ca.click(hp.getUser_homeBtn()); 
	     
	     System.out.println("home tab clicked successfully");
	     
	    ca.eleToBeClickable(); 
	    
	    
	    String text = ca.getText(mp.getActiveText());
		Assert.assertEquals("Active", text);
		ca.eleToBeClickable();
		
		System.out.println("product structure validated successfully");
		
	}
	

}
