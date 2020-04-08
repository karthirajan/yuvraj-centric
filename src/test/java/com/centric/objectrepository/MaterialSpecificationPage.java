package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class MaterialSpecificationPage extends Commonactions{
	
	public MaterialSpecificationPage() {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@data-csi-tab='SizeChartAdmin-Libraries' and text()='Libraries']")
	private WebElement libraries;
	
	@FindBy(xpath="//table[contains(@data-csi-context-parent,'SizeChartAdmin')]//td[@data-dojo-attach-event='onkeydown:_onArrowKeyDown']")
	private WebElement lib_drpdown;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SizeChartAdmin')]//tr[@data-csi-act='NewLibMaterial']/td)[2]")
	private WebElement new_material_lib;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Type::0']")
	private WebElement lib_node_type;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']")
	private WebElement lib_node_value;
	
	@FindBy(xpath="//td[@data-csi-heading='Node Name::0']/a")
	private WebElement lib_node_name;
	
	@FindBy(xpath="(//table[@data-csi-context-parent-attr='Elements']//div[@title='New Material...']/div)[2]")
	private WebElement material_btn;
	
	@FindBy(xpath="(//table[@data-csi-url='centric:']//div[@title='New Material...']/div)[2]")
	private WebElement new_material_btn;
	
	@FindBy(xpath="//div[contains(@data-csi-automation,'field-Material')]/div[contains(@class,'Input')]/input[@role='textbox']")
	private WebElement material_value;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Material')]/div)/div/input)[1]")
	private WebElement material;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Material')]/div)/div/input)[2]")
	private WebElement material_code;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[1]")
	private WebElement save_btn;
	
	@FindBy(xpath="//td[@data-csi-act='Node Name::0']/a[contains(text(),'copy')]")
	private WebElement copy_name;
	
	@FindBy(xpath="(//table[@data-csi-url='centric:']//div[contains(@title,'Material')]/div)[2]")
	private WebElement new_colored_material_btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'ColorMaterial')]/div)/div/input)[1]")
	private WebElement colored_material_value;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save & New'])")
	private WebElement saveAndNew_btn;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[2]")
	private WebElement colorAndSize_save_btn;
	
	@FindBy(xpath="(//table[@data-csi-url='centric:']//div[contains(@title,'Size')]/div)[2]")
	private WebElement new_size_btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'ProductSize')]/div)/div/input)[1]")
	private WebElement size_value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'ProductSize')]/div)/input[@name='SizeCode']/preceding-sibling::input")
	private WebElement sortOrder;
	

	public WebElement getLibraries() {
		return libraries;
	}

	public WebElement getLib_drpdown() {
		return lib_drpdown;
	}

	public WebElement getNew_material_lib() {
		return new_material_lib;
	}

	public WebElement getLib_node_type() {
		return lib_node_type;
	}

	public WebElement getLib_node_value() {
		return lib_node_value;
	}

	public WebElement getLib_node_name() {
		return lib_node_name;
	}

	public WebElement getMaterial_btn() {
		return material_btn;
	}

	public WebElement getMaterial_value() {
		return material_value;
	}

	public WebElement getMaterial() {
		return material;
	}

	public WebElement getMaterial_code() {
		return material_code;
	}

	public WebElement getSave_btn() {
		return save_btn;
	}

	public WebElement getNew_material_btn() {
		return new_material_btn;
	}

	public WebElement getCopy_name() {
		return copy_name;
	}

	public WebElement getNew_colored_material_btn() {
		return new_colored_material_btn;
	}

	public WebElement getColored_material_value() {
		return colored_material_value;
	}

	public WebElement getSaveAndNew_btn() {
		return saveAndNew_btn;
	}

	public WebElement getColorAndSize_save_btn() {
		return colorAndSize_save_btn;
	}

	public WebElement getNew_size_btn() {
		return new_size_btn;
	}

	public WebElement getSize_value() {
		return size_value;
	}

	public WebElement getSortOrder() {
		return sortOrder;
	}
	
	
    

}
