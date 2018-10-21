/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerRelationshipManagementApiServiceImpl implements CustomerRelationshipManagementApiService {

	public RelationshipPlanRecordResponse record(String crReferenceId, RelationshipPlanRecordRequest request){
		return JsonReader.read("record-RelationshipPlanRecordResponse.json",new TypeReference<RelationshipPlanRecordResponse>(){});
	}
	
	public IncidentBaseWithIdAndRoot requestPost(IncidentBase request){
		return JsonReader.read("requestPost-IncidentBaseWithIdAndRoot.json",new TypeReference<IncidentBaseWithIdAndRoot>(){});
	}
	
	public IncidentBaseWithIdAndRoot requestPut(String crReferenceId, IncidentBase request){
		return JsonReader.read("requestPut-IncidentBaseWithIdAndRoot.json",new TypeReference<IncidentBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ContactBaseWithIdAndRoot retrieveContacts(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactBaseWithIdAndRoot.json",new TypeReference<ContactBaseWithIdAndRoot>(){});
	}
	
	public RetrieveCustomerRelationshipManagementPlanResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveCustomerRelationshipManagementPlanResponse.json",new TypeReference<RetrieveCustomerRelationshipManagementPlanResponse>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public DevelopmentBaseWithIdAndRoot retrieveDevelopments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DevelopmentBaseWithIdAndRoot.json",new TypeReference<DevelopmentBaseWithIdAndRoot>(){});
	}
	
	public IncidentBaseWithIdAndRoot retrieveIncidents(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-IncidentBaseWithIdAndRoot.json",new TypeReference<IncidentBaseWithIdAndRoot>(){});
	}
	
}
