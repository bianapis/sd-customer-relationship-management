package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactBaseWithIdAndRoot
 */
public class ContactBaseWithIdAndRoot   {
  private String customerRelationshipPlanReference = null;

  private String customerContactReference = null;

  private String customerReference = null;

  private String customerRelationshipContactHistory = null;

  private String customerRelationshipContactSchedule = null;

  private String customerRelationshipContactDateTimeLocation = null;

  private String employeeReference = null;

  private String customerRelationshipContactType = null;

  private Object customerRelationshipContactRecord = null;

  private String customerRelationshipContactResult = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerContactReference
  **/

  public String getCustomerContactReference() {
    return customerContactReference;
  }

  public void setCustomerContactReference(String customerContactReference) {
    this.customerContactReference = customerContactReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipContactHistory
  **/

  public String getCustomerRelationshipContactHistory() {
    return customerRelationshipContactHistory;
  }

  public void setCustomerRelationshipContactHistory(String customerRelationshipContactHistory) {
    this.customerRelationshipContactHistory = customerRelationshipContactHistory;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipContactSchedule
  **/

  public String getCustomerRelationshipContactSchedule() {
    return customerRelationshipContactSchedule;
  }

  public void setCustomerRelationshipContactSchedule(String customerRelationshipContactSchedule) {
    this.customerRelationshipContactSchedule = customerRelationshipContactSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return customerRelationshipContactDateTimeLocation
  **/

  public String getCustomerRelationshipContactDateTimeLocation() {
    return customerRelationshipContactDateTimeLocation;
  }

  public void setCustomerRelationshipContactDateTimeLocation(String customerRelationshipContactDateTimeLocation) {
    this.customerRelationshipContactDateTimeLocation = customerRelationshipContactDateTimeLocation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeReference
  **/

  public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipContactType
  **/

  public String getCustomerRelationshipContactType() {
    return customerRelationshipContactType;
  }

  public void setCustomerRelationshipContactType(String customerRelationshipContactType) {
    this.customerRelationshipContactType = customerRelationshipContactType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerRelationshipContactRecord
  **/

  public Object getCustomerRelationshipContactRecord() {
    return customerRelationshipContactRecord;
  }

  public void setCustomerRelationshipContactRecord(Object customerRelationshipContactRecord) {
    this.customerRelationshipContactRecord = customerRelationshipContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipContactResult
  **/

  public String getCustomerRelationshipContactResult() {
    return customerRelationshipContactResult;
  }

  public void setCustomerRelationshipContactResult(String customerRelationshipContactResult) {
    this.customerRelationshipContactResult = customerRelationshipContactResult;
  }


}

