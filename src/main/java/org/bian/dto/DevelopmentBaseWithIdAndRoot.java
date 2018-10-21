package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DevelopmentBaseWithIdAndRoot
 */
public class DevelopmentBaseWithIdAndRoot   {
  private String customerDevelopmentTaskReference = null;

  private String customerRelationshipPlanReference = null;

  private String customerDevelopmentTaskType = null;

  private String customerDevelopmentTaskDescription = null;

  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerSalesPlan = null;

  private String customerRelationshipContactReference = null;

  private String customerDevelopmentTaskResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerDevelopmentTaskReference
  **/

  public String getCustomerDevelopmentTaskReference() {
    return customerDevelopmentTaskReference;
  }

  public void setCustomerDevelopmentTaskReference(String customerDevelopmentTaskReference) {
    this.customerDevelopmentTaskReference = customerDevelopmentTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerRelationshipPlanReference
  **/

  public String getCustomerRelationshipPlanReference() {
    return customerRelationshipPlanReference;
  }

  public void setCustomerRelationshipPlanReference(String customerRelationshipPlanReference) {
    this.customerRelationshipPlanReference = customerRelationshipPlanReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerDevelopmentTaskType
  **/

  public String getCustomerDevelopmentTaskType() {
    return customerDevelopmentTaskType;
  }

  public void setCustomerDevelopmentTaskType(String customerDevelopmentTaskType) {
    this.customerDevelopmentTaskType = customerDevelopmentTaskType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerDevelopmentTaskDescription
  **/

  public String getCustomerDevelopmentTaskDescription() {
    return customerDevelopmentTaskDescription;
  }

  public void setCustomerDevelopmentTaskDescription(String customerDevelopmentTaskDescription) {
    this.customerDevelopmentTaskDescription = customerDevelopmentTaskDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerSalesPlan
  **/

  public String getCustomerSalesPlan() {
    return customerSalesPlan;
  }

  public void setCustomerSalesPlan(String customerSalesPlan) {
    this.customerSalesPlan = customerSalesPlan;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerRelationshipContactReference
  **/

  public String getCustomerRelationshipContactReference() {
    return customerRelationshipContactReference;
  }

  public void setCustomerRelationshipContactReference(String customerRelationshipContactReference) {
    this.customerRelationshipContactReference = customerRelationshipContactReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerDevelopmentTaskResult
  **/

  public String getCustomerDevelopmentTaskResult() {
    return customerDevelopmentTaskResult;
  }

  public void setCustomerDevelopmentTaskResult(String customerDevelopmentTaskResult) {
    this.customerDevelopmentTaskResult = customerDevelopmentTaskResult;
  }


}

