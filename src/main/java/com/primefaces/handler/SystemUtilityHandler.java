package com.primefaces.handler;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.StateManager;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import ch.qos.logback.core.status.StatusManager;

/**
 * This class is the backing bean that can be used by an area of the system for
 * utility-related functionality.
 *
 * @author SXGURIJALA
 */
@Named
@ApplicationScoped
public class SystemUtilityHandler implements Serializable {

	private List<SelectItem> institutionTypeCodeItems;
	private List<SelectItem> caseLoadManagerItems;
	private List<SelectItem> stateItems;
	private List<SelectItem> statusItems;
	private List<SelectItem> corporationTypeCodeItems;
	private List<SelectItem> highRiskTypeItems;
	private List<SelectItem> charterStateItems;
	private List<SelectItem> changeReasonCodeItems;

	/*
	 * private InstitutionTypeManager institutionTypeManager;
	 * 
	 * private SuperStaffManager superStaffManager;
	 * 
	 * private ChangeReasonManager changeReasonManager;
	 */

	private StateManager stateManager;

	private StatusManager statusManager;

	/*
	 * private CorporationTypeManager corporationTypeManager;
	 * 
	 * private HighRiskTypeManager highRiskTypeManager;
	 * 
	 * private CharterStateManager charterStateManager;
	 */


	@PostConstruct
	public void init() {
		createInstitutionTypeCodeItems();
		createCaseLoadManagerItems();
		createStateItems();
		createStatusItems();
		createCorporationTypeCodeItems();
		createHighRiskTypeItems();
		createCharterStateItems();
		createChangeReasonCodeItems();
	}

	private void createInstitutionTypeCodeItems() {
		institutionTypeCodeItems = new ArrayList<>();

	}

	public List<SelectItem> getInstitutionTypeCodeItems() {
		return institutionTypeCodeItems;
	}

	private void createCaseLoadManagerItems() {
		caseLoadManagerItems = new ArrayList<>();

	}

	public List<SelectItem> getCaseLoadManagerItems() {
		return caseLoadManagerItems;
	}

	private void createStateItems() {
		stateItems = new ArrayList<>();

	}

	public List<SelectItem> getStateItems() {
		return stateItems;
	}

	private void createStatusItems() {
		statusItems = new ArrayList<>();

	}

	public List<SelectItem> getStatusItems() {
		return statusItems;
	}

	private void createCorporationTypeCodeItems() {
		corporationTypeCodeItems = new ArrayList<>();

	}

	public List<SelectItem> getCorporationTypeCodeItems() {
		return corporationTypeCodeItems;
	}

	private void createHighRiskTypeItems() {
		highRiskTypeItems = new ArrayList<>();

	}

	public List<SelectItem> getHighRiskTypeItems() {
		return highRiskTypeItems;
	}

	private void createCharterStateItems() {
		charterStateItems = new ArrayList<>();

	}

	public List<SelectItem> getCharterStateItems() {
		return charterStateItems;
	}

	public List<SelectItem> getChangeReasonCodeItems() {
		return changeReasonCodeItems;
	}

	public void createChangeReasonCodeItems() {
		changeReasonCodeItems = new ArrayList<>();

	}


}
