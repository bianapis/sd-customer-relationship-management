package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * IncidentBase
 */
public class IncidentBase   {
  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String productServiceActivityReference = null;

  private String customerIncidentType = null;

  private String customerIncidentDescription = null;

  private String customerIncidentResolution = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productServiceActivityReference
  **/

  public String getProductServiceActivityReference() {
    return productServiceActivityReference;
  }

  public void setProductServiceActivityReference(String productServiceActivityReference) {
    this.productServiceActivityReference = productServiceActivityReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerIncidentType
  **/

  public String getCustomerIncidentType() {
    return customerIncidentType;
  }

  public void setCustomerIncidentType(String customerIncidentType) {
    this.customerIncidentType = customerIncidentType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerIncidentDescription
  **/

  public String getCustomerIncidentDescription() {
    return customerIncidentDescription;
  }

  public void setCustomerIncidentDescription(String customerIncidentDescription) {
    this.customerIncidentDescription = customerIncidentDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerIncidentResolution
  **/

  public String getCustomerIncidentResolution() {
    return customerIncidentResolution;
  }

  public void setCustomerIncidentResolution(String customerIncidentResolution) {
    this.customerIncidentResolution = customerIncidentResolution;
  }


}

