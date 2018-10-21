/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerRelationshipManagementApiService {

	RelationshipPlanRecordResponse record(String crReferenceId, RelationshipPlanRecordRequest request);
	
	IncidentBaseWithIdAndRoot requestPost(IncidentBase request);
	
	IncidentBaseWithIdAndRoot requestPut(String crReferenceId, IncidentBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	ContactBaseWithIdAndRoot retrieveContacts(String crReferenceId, String bqReferenceId);
	
	RetrieveCustomerRelationshipManagementPlanResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	DevelopmentBaseWithIdAndRoot retrieveDevelopments(String crReferenceId, String bqReferenceId);
	
	IncidentBaseWithIdAndRoot retrieveIncidents(String crReferenceId, String bqReferenceId);
	
}
