/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class CustomerRelationshipManagementApiController {

	@Autowired
	CustomerRelationshipManagementApiService service;
	
	@Manage.Record
	public BianResponse<RelationshipPlanRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RelationshipPlanRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Manage.RequestPost
	public BianResponse<IncidentBaseWithIdAndRoot> requestPost(@RequestBody BianRequest<IncidentBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Manage.RequestPut
	public BianResponse<IncidentBaseWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<IncidentBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("contacts")
	@Manage.Retrieve
	public BianResponse<ContactBaseWithIdAndRoot> retrieveContacts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveContacts(crReferenceId, bqReferenceId));
	}
	
	@Manage.Retrieve
	public BianResponse<RetrieveCustomerRelationshipManagementPlanResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("developments")
	@Manage.Retrieve
	public BianResponse<DevelopmentBaseWithIdAndRoot> retrieveDevelopments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevelopments(crReferenceId, bqReferenceId));
	}
	
	@BQ("incidents")
	@Manage.Retrieve
	public BianResponse<IncidentBaseWithIdAndRoot> retrieveIncidents(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIncidents(crReferenceId, bqReferenceId));
	}
	
}
