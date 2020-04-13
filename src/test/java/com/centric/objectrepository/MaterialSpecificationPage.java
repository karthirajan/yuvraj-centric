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
	private WebElement save_btn1;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Save'])[2]")
	private WebElement save_btn2;
	
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
	
	@FindBy(xpath="//span[text()='Supplier' and @data-csi-tab='LibSourcing-Suppliers']")
	private WebElement supplier;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'LibSourcing-Suppliers')]//div[contains(@title,'Supplier')]/div)[2]")
	private WebElement new_suppliier_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Supplier')]/div)/div/input)[1]")
	private WebElement supplierValue;
	
	@FindBy(xpath="//input[@name='IsSupplier']")
	private WebElement isSupplier_ChkBox;
	
	@FindBy(xpath="//span[text()='Samples' or @data-csi-tab='Material-ProductSamples']")
	private WebElement samples1;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductSamples')]//div[contains(@title,'Material Sample')]/div)[2]")
	private WebElement new_mat_Sample_Btn1;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'MaterialSample')]/div)/div/input)[1]")
	private WebElement mat_SampleValue1;
	
	@FindBy(xpath="(//tr[@data-csi-form-field='RequestSampleDimensions']//input[@role='textbox'])[1]")
	private WebElement color_sizeValue;
	
	@FindBy(xpath="//input[@name='RequestSampleCustomQuantity']")
	private WebElement qntyMatrix;
	
	@FindBy(xpath="(//table[contains(@class,'grid')]//th[text()='Quantity']//following-sibling::th//input[@tabindex='0'])[1]")
	private WebElement qntyValue;
	
	@FindBy(xpath="//td[@title='Blue']")
	private WebElement blue;
	
	@FindBy(xpath="//span[text()='SKUs' or @data-csi-tab='Material-ProductSKU']")
	private WebElement SKU;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductSKU')]//div[contains(@title,'Material SKU')]/div)[2]")
	private WebElement new_mat_sku_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'SKUMaterial')]/div)/div/input)[1]")
	private WebElement mat_sku_value;
	
	@FindBy(xpath="//input[@name='UseMatrix']")
	private WebElement useMatrix_chkBox;
	
	@FindBy(xpath="(//table[contains(@class,'grid')]//th[text()='Select All']//following-sibling::th//input[@tabindex='0'])[1]")
	private WebElement selectAll;
	
	@FindBy(xpath="(//table[contains(@class,'grid')]//th[text()='Select All']//following-sibling::th//input[@tabindex='0'])[2]")
	private WebElement selectParticular;
	
	@FindBy(xpath="//span[text()='Material Gallery' or @data-csi-tab='ApparelViews-AllMaterialsGallery']")
	private WebElement material_gallery;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'MaterialsGallery')]//span[text()='Views']")
	private WebElement MGViews;
	
	@FindBy(xpath="(//tr[contains(@data-csi-automation,'MaterialsGallery')]//td[text()='Manage Views'])")
	private WebElement MGMan_Views;
	
	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])[1]/option")
	private WebElement MGSelectAll;
	
	@FindBy(xpath="(//span[contains(@class,'Button') or text()='●']//following-sibling::span[text()='Add >'])[1]")
	private WebElement Add;
	
	@FindBy(xpath="((//span[@data-csi-context-parent='centric://APPAREL/Views']/span/div)[4]//input[@role='textbox'])")
	private WebElement MGFilter;
	
	@FindBy(xpath="//span[text()='Material Security Groups' and @data-csi-tab='ApparelViews-MaterialSecurityGroups']")
	private WebElement matSecGrps;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'MaterialSecurityGroups')]//span[text()='Views']")
	private WebElement MSGViews;
	
	@FindBy(xpath="(//tr[contains(@data-csi-automation,'MaterialSecurityGroup')]//td[text()='Manage Views'])")
	private WebElement MSG_manViews;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MaterialSecurityGroups')]//div[contains(@title,'Material Security')]/div)[2]")
	private WebElement mat_SecGrp_Btn;
	
	@FindBy(xpath="//td[@data-csi-act='OnlyForMaterialTypes::0']")
	private WebElement onlyForMat;
	
	@FindBy(xpath="//label[text()='Fabric - Stanadlone']/preceding-sibling::div/input")
	private WebElement standalone_chkbox;
	
	@FindBy(xpath="//td[@data-csi-act='OnlyForMaterialTypes::0']/following-sibling::td[2]")
	private WebElement clickEmpty;
	
	@FindBy(xpath="//label[text()='Fabric - Structure Component']/preceding-sibling::div/input")
	private WebElement structure_Component;
	
	@FindBy(xpath="//label[text()='Fabric - Tool']/preceding-sibling::div/input")
	private WebElement tool;
	
	@FindBy(xpath="//span[text()='Colored Material' and @data-csi-tab='ApparelViews-ColoredMaterials']")
	private WebElement colored_mat;
	
	@FindBy(xpath="//span[text()='Material Samples' and @data-csi-tab='ApparelViews-MaterialSamples']")
	private WebElement mat_samples;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'MaterialSamples')]//div[contains(@title,'Material Sample')]/div)[2]")
	private WebElement new_mat_sample_Btn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'MaterialSample')]/div)/div/input)[1]")
	private WebElement mat_sample_Value;
	
	@FindBy(xpath="//div[contains(@class,'MaterialSamples')]//td[@data-csi-heading='Node Name::0']/div/a[1]")
	private WebElement click_materialSample;
	
	@FindBy(xpath="//span[text()='Promote Material']")
	private WebElement promote_material;
	
	@FindBy(xpath="//span[text()='Unlink']")
	private WebElement unLink;
	
	@FindBy(xpath="(//span[text()='Unlink'])[2]")
	private WebElement pp_unLink;
	
	@FindBy(xpath="//span[text()='Material SKUs' and @data-csi-tab='ApparelViews-SKUMaterials']")
	private WebElement mat_SKU;
	
	@FindBy(xpath="//span[text()='Sourcing' and @data-csi-tab='ApparelViews-MaterialSourcing']")
	private WebElement sourcing;
	
	@FindBy(xpath="//span[text()='Supplier Quotes' and @data-csi-tab='ApparelViews-MaterialQuotes']")
	private WebElement quotes;
	
	@FindBy(xpath="//span[text()='Supplier Requests' and @data-csi-tab='ApparelViews-MaterialSupplierRequests']")
	private WebElement requests;

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

	public WebElement getSave_btn2() {
		return save_btn2;
	}
	
	public WebElement getSave_btn1() {
		return save_btn1;
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

	public WebElement getSupplier() {
		return supplier;
	}

	public WebElement getNew_suppliier_Btn() {
		return new_suppliier_Btn;
	}

	public WebElement getSupplierValue() {
		return supplierValue;
	}

	public WebElement getIsSupplier_ChkBox() {
		return isSupplier_ChkBox;
	}

	public WebElement getSamples1() {
		return samples1;
	}

	public WebElement getNew_mat_Sample_Btn1() {
		return new_mat_Sample_Btn1;
	}

	public WebElement getMat_SampleValue1() {
		return mat_SampleValue1;
	}

	public WebElement getColor_sizeValue() {
		return color_sizeValue;
	}

	public WebElement getQntyMatrix() {
		return qntyMatrix;
	}

	public WebElement getQntyValue() {
		return qntyValue;
	}

	public WebElement getBlue() {
		return blue;
	}

	public WebElement getSKU() {
		return SKU;
	}

	public WebElement getNew_mat_sku_Btn() {
		return new_mat_sku_Btn;
	}

	public WebElement getMat_sku_value() {
		return mat_sku_value;
	}

	public WebElement getUseMatrix_chkBox() {
		return useMatrix_chkBox;
	}

	public WebElement getSelectAll() {
		return selectAll;
	}

	public WebElement getSelectParticular() {
		return selectParticular;
	}

	public WebElement getMaterial_gallery() {
		return material_gallery;
	}

	public WebElement getMGViews() {
		return MGViews;
	}

	public WebElement getMGMan_Views() {
		return MGMan_Views;
	}

	public WebElement getMGSelectAll() {
		return MGSelectAll;
	}

	public WebElement getAdd() {
		return Add;
	}

	public WebElement getMGFilter() {
		return MGFilter;
	}

	public WebElement getMatSecGrps() {
		return matSecGrps;
	}

	public WebElement getMSGViews() {
		return MSGViews;
	}

	public WebElement getMSG_manViews() {
		return MSG_manViews;
	}

	public WebElement getMat_SecGrp_Btn() {
		return mat_SecGrp_Btn;
	}

	public WebElement getOnlyForMat() {
		return onlyForMat;
	}

	public WebElement getStandalone_chkbox() {
		return standalone_chkbox;
	}

	public WebElement getClickEmpty() {
		return clickEmpty;
	}

	public WebElement getStructure_Component() {
		return structure_Component;
	}

	public WebElement getTool() {
		return tool;
	}

	public WebElement getColored_mat() {
		return colored_mat;
	}

	public WebElement getMat_samples() {
		return mat_samples;
	}

	public WebElement getNew_mat_sample_Btn() {
		return new_mat_sample_Btn;
	}

	public WebElement getMat_sample_Value() {
		return mat_sample_Value;
	}

	public WebElement getClick_materialSample() {
		return click_materialSample;
	}

	public WebElement getPromote_material() {
		return promote_material;
	}

	public WebElement getUnLink() {
		return unLink;
	}

	public WebElement getPp_unLink() {
		return pp_unLink;
	}

	public WebElement getMat_SKU() {
		return mat_SKU;
	}

	public WebElement getSourcing() {
		return sourcing;
	}

	public WebElement getQuotes() {
		return quotes;
	}

	public WebElement getRequests() {
		return requests;
	}
	
	

}
